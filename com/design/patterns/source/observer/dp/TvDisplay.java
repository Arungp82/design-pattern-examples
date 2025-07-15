package com.design.patterns.source.observer.dp;

import com.design.patterns.source.observer.dp.Observer;

public class TvDisplay implements Observer {
    private String weather;

    @Override
    public void update(String weather) {
        this.weather = weather;
        display();
    }

    private void display() {
        System.out.println("TV Display: Weather updated - " + weather);
    }
}
