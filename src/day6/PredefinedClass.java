package day6;

import java.util.logging.Logger;

public class PredefinedClass {

    public static void main(String[] args) {
        double random1 = Math.random();
        Logger.getGlobal().info(String.valueOf(random1));

        double x = 2.1;

        double ceilNumber = Math.ceil(x);
        Logger.getGlobal().info(String.valueOf(ceilNumber));

        double floorNumber = Math.floor(x);
        Logger.getGlobal().info(String.valueOf(floorNumber));

        double roundNumber = Math.round(x);
        Logger.getGlobal().info(String.valueOf(roundNumber));


    }
}
