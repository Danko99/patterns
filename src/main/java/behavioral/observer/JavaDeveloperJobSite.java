package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class JavaDeveloperJobSite implements Observed {
    private List<String> vacancies;

    private List<Observer> subscribers;

    public JavaDeveloperJobSite() {
        vacancies = new ArrayList<>();
        subscribers = new ArrayList<>();
    }

    public void addVacancy(String vacancy) {
        vacancies.add(vacancy);
        notifyObservers();
    }

    public void removeVacancy(String vacancy) {
        vacancies.remove(vacancy);
        notifyObservers();
    }


    @Override
    public void addObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);

    }

    @Override
    public void notifyObservers() {
        subscribers.forEach(observer -> {
            observer.handleEvent(vacancies);
        });

    }
}
