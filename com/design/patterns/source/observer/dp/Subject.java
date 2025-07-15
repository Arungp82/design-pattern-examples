package com.design.patterns.source.observer.dp;

import com.design.patterns.source.observer.dp.Observer;

public interface Subject {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

}
