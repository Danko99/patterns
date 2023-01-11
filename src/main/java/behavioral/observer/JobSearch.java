package behavioral.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();
        jobSite.addObserver(new Subscriber("Vasya"));

        jobSite.addVacancy("Java Middle");
    }
}
