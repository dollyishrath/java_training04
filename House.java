package com.trimindtech.training.day04;

public class House {
    public House(){
        this.freehold = freehold;
    }

    public House(String type, double price, int numberOfBedrooms){
        this.type = type;
        this.price = price;
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public House(String type1, char zone1, double price1, int numberOfBedrooms1) {
        this.type = type1;
        this.zone = zone1;
        this.price = price1;
        this.numberOfBedrooms = numberOfBedrooms1;
    }

    private String type;
    private char zone;
    private double price;
    private int numberOfBedrooms;
    private boolean freehold;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public char getZone() {
        return zone;
    }

    public void setZone(char zone) {
        this.zone = zone;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public boolean isFreehold() {
        return freehold;
    }

    public void setFreehold(boolean freehold) {
        this.freehold = freehold;
    }

    @Override
    public String toString() {
        return "House{" +
                "type='" + type + '\'' +
                ", zone=" + zone +
                ", price=" + price +
                ", numberOfBedrooms=" + numberOfBedrooms +
                ", freehold=" + freehold +
                '}';
    }
}
