package com.company;
/*
*
* HEADER
*
*
* */
public class PartTimeEmployee implements IAccounting{
    private String name;
    private double rate;
    private int hours;
    //Constructor

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }
    //Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    //toString


    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    @Override
    public int getSalary() {
        return (int) (this.getHours()*this.getRate());
    }
}
