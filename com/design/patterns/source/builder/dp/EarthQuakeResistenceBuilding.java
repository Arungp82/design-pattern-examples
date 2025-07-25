package com.design.patterns.source.builder.dp;

public class EarthQuakeResistenceBuilding implements Builder {

    private Home earthquakeResistenceHome = new Home();

    @Override
    public void buildFloors() {
        this.earthquakeResistenceHome.floors = "Wooden floor";
    }

    @Override
    public void buildWalls() {
        this.earthquakeResistenceHome.walls = "Wooden walls";
    }

    @Override
    public void buildTerrace() {
        this.earthquakeResistenceHome.terrace = "Wooden terrace";
    }

    @Override
    public Home getComplexHomeObject() {
        return this.earthquakeResistenceHome;
    }

}
