// Thread Class(Polymorphism).
class WorkoutPhase implements Runnable{
    private String phaseName;
    private int seconds;

    public WorkoutPhase(String phaseName, int seconds){
        this.phaseName = phaseName;
        this.seconds = seconds;
    }
    public void run(){
        System.out.println(" "+ phaseName+ " started ("+ seconds+ "s)");
        try{
            Thread.sleep(seconds * 1000);
        } catch(InterruptedException e){
            System.out.println(" " + phaseName+ " interrupted");
        }
        System.out.println(" "+phaseName + " ended.");
    }
}
