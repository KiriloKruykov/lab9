package com.company;
/*
 *HEADER
 */

public class FullTimeEmployee implements IAccounting {
    private String name;
    private int mounthlySalary; //Solid salary for a month according to contract
    //constructor

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(String name, int mounthlySalary) {
        this.name = name;
        this.mounthlySalary = mounthlySalary;
    }
    //Getter and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMounthlySalary() {
        return mounthlySalary;
    }

    public void setMounthlySalary(int mounthlySalary) {
        this.mounthlySalary = mounthlySalary;
    }
    //toString

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "name='" + name + '\'' +
                ", mounthlySalary=" + mounthlySalary +
                '}';
    }

    @Override
    public int getSalary() {
        return this.getMounthlySalary();
    }
}
