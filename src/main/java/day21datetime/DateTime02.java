package day21datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);//2023-03-17T19:51:37.835000300

        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("M/dd/yyyy- hh:mm a");
        String formattedLdt=dtf1.format(ldt);
        System.out.println(formattedLdt);//3/17/2023- 07:54 ÖS






    }
}
