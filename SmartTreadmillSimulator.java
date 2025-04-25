// SmartTreadmillSimulator.java
public class SmartTreadmillSimulator {
    public static void main(String[] args){
        System.out.println("=== Smart Treadmill Simulator ===");
        //aggregation: user passed to treadmill
        User user = new User("Ali", 21);

        //Composition: treadmill owns a motor.
        Treadmill treadmill = new Treadmill("FitRun", 1500, user);
        try{
            treadmill.startWorkout();
        } catch(InterruptedException e){
            System.out.println("[Error] Workout interrupted.");
        }
    }
}
