package org.example.model;

public class Bedroom {
    private String name;

    private Wall waal1;
    private Wall waal2;
    private Wall waal3;
    private Wall waal4;

    private Ceiling ceiling;

    private Bed bed;

    private Lamp lamp;

    private Wardrobe wardrobe;

    private Carpet carpet;

    public Bedroom(String name, Wall waal1, Wall waal2, Wall waal3, Wall waal4, Ceiling ceiling, Bed bed, Lamp lamp, Wardrobe wardrobe, Carpet carpet) {
        this.name = name;
        this.waal1 = waal1;
        this.waal2 = waal2;
        this.waal3 = waal3;
        this.waal4 = waal4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
        this.wardrobe = wardrobe;
        this.carpet = carpet;
    }

    public String getName() {
        return name;
    }

    public Wall getWaal1() {
        return waal1;
    }

    public Wall getWaal2() {
        return waal2;
    }

    public Wall getWaal3() {
        return waal3;
    }

    public Wall getWaal4() {
        return waal4;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Bed getBed() {
        return bed;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public Carpet getCarpet() {
        return carpet;
    }
}
