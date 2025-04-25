/ Subclass(Treadmill)
class Treadmill extends ElectronicAppliance{
    private Motor motor;       // Composition
    private User user;   //Aggregation

    public Treadmill(String brand, int power, User user){
        super(brand, power);
        this.motor = new Motor();
        this.user = user;
    }
    public void startWorkout() throws InterruptedException{
        System.out.println("Welcome, "+ user.getInfo());
        turnOn();
        motor.startMotor();

        Thread warmup = new Thread(new WorkoutPhase("Warm-up", 3));
        Thread run = new Thread(new WorkoutPhase("Running", 5));
        Thread cooldown = new Thread(new WorkoutPhase("Cooldown", 2));

        warmup.start();  warmup.join();
        run.start(); run.join();
        cooldown.start(); cooldown.join();

        System.out.println("Session complete.");
        turnOff();
    }
}
