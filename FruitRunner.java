package com.trimindtech.training.day04;

public class FruitRunner {
    public static void main(String[] args) {
        Fruit orange = new Orange();
        Fruit apple = new Apple();
    }
    public static void makeJuice(Fruit fruit){
        if((fruit instanceof Apple)){
           fruit.peel();
           fruit.makeJuice();
        }else {
            ((Apple) fruit).removeSeeds();
            fruit.makeJuice();
        }
        System.out.println("make juice");
    }
}
