package com.example.homework43;

public class Plant {
    private String name;
    private String desc;
    private int plantnumber;
    private String population;

    public Plant(String name, String desc, int plantnumber, String population) {
        this.name = name;
        this.desc = desc;
        this.plantnumber = plantnumber;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPlantnumber() {
        return plantnumber;
    }

    public void setPlantnumber(int plantnumber) {
        this.plantnumber = plantnumber;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }
}
