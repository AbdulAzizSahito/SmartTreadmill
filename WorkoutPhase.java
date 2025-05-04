// Thread Class(Polymorphism).
class WorkoutPhase implements Runnable {
    private String phase;
    private int durationInSeconds;

    public WorkoutPhase(String phase, int durationInSeconds){
        this.phase = phase;
        this.durationInSeconds = durationInSeconds;
    }
    @Override
    public void run(){
        System.out.println("\n>> " + phase + " started (" + durationInSeconds + "s)");
        try{
            Thread.sleep(durationInSeconds * 1000);
        } catch(InterruptedException e){
            System.out.println(" "+ phase +" interrupted!");
        }
        System.out.println(">> "+ phase +" completed.");
    }
}
