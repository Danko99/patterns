package structure.facade;

public class BugTracker {
    private boolean activeSprint;

    public boolean isActiveSprint() {
        return activeSprint;
    }

    public void startSprint() {
        activeSprint = true;
    }

    public void finishSprint() {
        activeSprint = false;
    }
}
