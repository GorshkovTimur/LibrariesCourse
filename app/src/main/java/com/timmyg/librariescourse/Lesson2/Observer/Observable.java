package com.timmyg.librariescourse.Lesson2.Observer;

public interface Observable {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyScribers();
}
