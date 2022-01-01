package day4;

public class HeaterEncapsulation {

    public static void main(String[] args) {
        Heater heater1 = new Heater(); // object heater 1 created
        heater1.setBrand("Kenmore");
        heater1.setColor("Blue");
        heater1.setModel("Latest");
        heater1.setSize((short) 10);
        heater1.setPrice(100.00F);
        System.out.println("Heater 1 brand is: " + heater1.getBrand());
        System.out.println("Heater 1 color is: " + heater1.getColor());
        System.out.println("Heater 1 model is: " + heater1.getModel());
        System.out.println("Heater 1 size is: " + heater1.getSize() + " cm");
        System.out.println("Heater 1 price is: $" + heater1.getPrice() + " only");
        heater1.working();


    }
}
