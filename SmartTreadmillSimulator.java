// SmartTreadmillSimulator.java
public class SmartTreadmillSimulator {
    public static void main(String[] args) {

        System.out.println("=== Welcome to Smart Treadmill Simulator ===");
        
        User user = new User("Ali", 21);

        int warmupDuration = 3;
        int runningDuration = 5;
        int cooldownDuration = 2;

        Treadmill treadmill = new Treadmill("FitRun", 1500, user);
        
        try{
            treadmill.startWorkout(warmupDuration, runningDuration, cooldownDuration);
        } catch (InterruptedException e){
            System.out.println("[System] Workout interrupted: " + e.getMessage());
        }
    }
}
