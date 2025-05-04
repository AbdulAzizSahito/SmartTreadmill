class Treadmill extends ElectronicAppliance {
    private Motor motor;
    private ControlPanel panel;
    private SafetySystem safety;
    private User user;

    public Treadmill(String brand, int powerRating, User user){
        super(brand, powerRating);
        if (user == null) {
            throw new IllegalArgumentException("User cannot be null.");
        }
        this.motor = new Motor();
        this.panel = new ControlPanel();
        this.safety = new SafetySystem();
        this.user = user;
    }

    public void startWorkout(int warmupSec, int runSec, int cooldownSec) throws InterruptedException{
        System.out.println("\n Hello, " + user.getDetails());
        turnOn();
        panel.displayMenu();
        safety.checkStatus();
        motor.runMotor();

        Thread warmup = new Thread(new WorkoutPhase("Warm-up", warmupSec));
        Thread running = new Thread(new WorkoutPhase("Running", runSec));
        Thread cooldown = new Thread(new WorkoutPhase("Cooldown", cooldownSec));

        warmup.start(); warmup.join();
        running.start(); running.join();
        cooldown.start(); cooldown.join();

        System.out.println("\n Session completed successfully!");
        turnOff();
    }

}
