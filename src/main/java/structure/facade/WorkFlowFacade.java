package structure.facade;

public class WorkFlowFacade {
    private final BugTracker bugTracker;
    private final Developer developer;
    private final Job job;

    public WorkFlowFacade() {
        bugTracker = new BugTracker();
        developer = new Developer();
        job = new Job();
    }

    public void startWorkProgress(){
        job.doJob();
        bugTracker.startSprint();
        developer.doJobForDeadLine(bugTracker);
    }
}
