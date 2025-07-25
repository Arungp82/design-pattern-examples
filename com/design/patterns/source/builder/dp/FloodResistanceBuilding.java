package com.design.patterns.source.builder.dp;

public class FloodResistanceBuilding implements Builder {

    private Home floodResistanceBuilding = new Home();

    @Override
    public void buildFloors() {
        floodResistanceBuilding.floors = "Floor should be 10 feet above ground level";
    }

    @Override
    public void buildWalls() {
        floodResistanceBuilding.walls = "Walls should be water resistant";
    }

    @Override
    public void buildTerrace() {
        floodResistanceBuilding.terrace = "Terrace should be water leak proof";
    }

    @Override
    public Home getComplexHomeObject() {
        return this.floodResistanceBuilding;
    }
}
