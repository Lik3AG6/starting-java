package day6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Logger;

public class DatePractice {

    public static void main(String[] args) {
        Date date = new Date(); // in the case of Date library you will need to create an object to use the fields and functions of Date. # Prints out the date and time
        Logger.getGlobal().info(String.valueOf(date)); // date will be printed according to the device that you are using.

        LocalDate localDate = LocalDate.now(); // prints out the local date only
        Logger.getGlobal().info(String.valueOf(localDate));

        LocalTime localTime = LocalTime.now();
        Logger.getGlobal().info(String.valueOf(localTime));

        LocalDateTime localDateT = LocalDateTime.now();
        Logger.getGlobal().info(String.valueOf(localDateT));

        Calendar calendar = Calendar.getInstance();
        Logger.getGlobal().info(String.valueOf(calendar));


        // TODO LocaDateTime cannot be found ** Recording 2022-01-04, paused at 1:07 **
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a");
        String formattedDate = dateFormatter.format(localDateT);
        Logger.getGlobal().info(formattedDate);






    }
}
