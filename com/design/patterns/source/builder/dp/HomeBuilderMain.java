package com.design.patterns.source.builder.dp;

public class HomeBuilderMain {
    public static void main(String[] args) {
        EarthQuakeResistenceBuilding earthQuakeResistenceBuilding = new EarthQuakeResistenceBuilding();

        Director director = new Director(earthQuakeResistenceBuilding);
        director.manageRequiredHomeConstruction();
        Home home = director.getComplexHomeObjectForEarthQuakeResistenceBuilding();

        System.out.println(home);
        System.out.println(home.floors);
    }
}
