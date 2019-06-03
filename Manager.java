package com.trimindtech.training.day04;

public class Manager extends Employee{
    public Manager(String name, int age, int experience, double salary, double bonus) {
        super(name, age, experience, salary);
        this.bonus = bonus;
    }

    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSalary() {
        return super.getSalary() + getBonus();
    }

}

