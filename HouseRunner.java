package com.trimindtech.training.day04;

public class HouseRunner {
    public static void main(String[] args) {

        House house = new House("Apartment",'A',68000.0,3);
        house.setType("Apartment");
        house.setZone('A');
        house.setPrice(68000.0);
        house.setNumberOfBedrooms(3);

        House house1 = new House("Apartment1",'B',70000.0,4);
        house1.setType("Apartment1");
        house1.setZone('B');
        house1.setPrice(70000.0);
        house1.setNumberOfBedrooms(4);

        House house2 = new House("Apartment2",'C',72000.0,5);
        house2.setType("Apartment2");
        house2.setZone('C');
        house2.setPrice(72000.0);
        house2.setNumberOfBedrooms(5);

        House[] houses = new House[3];
        houses[0] = house;
        houses[1] = house1;
        houses[2] = house2;

        for(House house3 : houses){
            if(false){
                System.out.println("house1 details");
            }
            else{
                System.out.println("house2 details");
            }

        }
        System.out.println(house.getType());
        System.out.println(house.getZone());
        System.out.println(house.getPrice());
        System.out.println(house.getNumberOfBedrooms());
        System.out.println(house.getClass());

    }
}
