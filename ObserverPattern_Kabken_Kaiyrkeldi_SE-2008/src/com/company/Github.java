package com.company;

import java.util.ArrayList;
import java.util.List;

public class Github implements Observable {

    private List<String> commits = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public void addCommit(String commit){
        this.commits.add(commit);
        notifyAllobservers();
    }

    public void removeCommit(String commit){
        this.commits.remove(commit);
        notifyAllobservers();
    }


    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyAllobservers() {
        for (Observer observer: observers){
            observer.update(this.commits);
        }
    }
}
