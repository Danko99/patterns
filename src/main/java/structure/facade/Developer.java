package structure.facade;

public class Developer {

    public void doJobForDeadLine(BugTracker bugTracker) {
        if (bugTracker.isActiveSprint()) {
            System.out.println("I am writing code now");
        } else {
            System.out.println("I am doing nothing now");
        }
    }
}
