package com.design.patterns.source.builder.dp;

public class Director {
    private Builder builder;

    public Director(Builder builderType){
        this.builder=builderType;
    }

    public Home getComplexHomeObjectForEarthQuakeResistenceBuilding(){
        return this.builder.getComplexHomeObject();
    }

    public void manageRequiredHomeConstruction(){
        this.builder.buildWalls();
        this.builder.buildFloors();
        this.builder.buildTerrace();
    }
}
