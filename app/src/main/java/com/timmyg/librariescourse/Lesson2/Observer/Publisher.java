package com.timmyg.librariescourse.Lesson2.Observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements Observable {

    private List<Observer> observerList;

    public Publisher() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyScribers() {
        for (Observer o:observerList ) {
            o.getNotify();

        }
    }
}
