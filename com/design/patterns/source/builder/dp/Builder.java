package com.design.patterns.source.builder.dp;

public interface Builder {
    public void buildFloors();

    public void buildWalls();

    public void buildTerrace();

    public Home getComplexHomeObject();
}
