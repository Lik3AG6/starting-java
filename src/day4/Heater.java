package day4;

public class Heater {

        private String brand;
        private String color;
        private String model;
        private short size;
        private String powerConsumption;
        private String electricOrGas;
        private String portable;
        private float price;


        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public short getSize() {
            return size;
        }

        public void setSize(short size) {
            this.size = size;
        }

        public String getPowerConsumption() {
            return powerConsumption;
        }

        public void setPowerConsumption(String powerConsumption) {
            this.powerConsumption = powerConsumption;
        }

        public String getElectricOrGas() {
            return electricOrGas;
        }

        public void setElectricOrGas(String electricOrGas) {
            this.electricOrGas = electricOrGas;
        }

        public String getPortable() {
            return portable;
        }

        public void setPortable(String portable) {
            this.portable = portable;
        }

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            this.price = price;
        }

        // working
        public void working() {
            System.out.println("Heater is working perfectly and ready to go!");
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
