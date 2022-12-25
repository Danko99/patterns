package structure.facade;

public class FacadeClient {
    public static void main(String[] args) {
//        Job job = new Job();
//        job.doJob();
//        BugTracker bugTracker = new BugTracker();
//        bugTracker.startSprint();
//
//        Developer developer = new Developer();
//        developer.doJobForDeadLine(bugTracker);
//
//        bugTracker.finishSprint();
//        developer.doJobForDeadLine(bugTracker);

        WorkFlowFacade workFlowFacade = new WorkFlowFacade();
        workFlowFacade.startWorkProgress();

    }
}
