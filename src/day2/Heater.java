package day2;

public class Heater {

    // States


    // brand
    // color
    // model
    // size
    // powerConsumption
    // electricOrGas
    // portable
    // price

    String brand;
    String color;
    String model;
    short size;
    String powerConsumption;
    String electricOrGas;
    String portable;
    float price;


    // behaviour


    // working
    public void working() {
        System.out.println("Heater is working");
    }

    // currentTemperature
    public void currentTemperature() {
        System.out.println("Heater current temperature");
    }

    // rangeOfHeat
    public void rangeOfHeat(){
        System.out.println("Heater's range");
    }

    // circulatingOrNot
    public void circulatingOrNot(){
        System.out.println("Heater is circulating or not");
    }
}
