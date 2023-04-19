package day21datetime;

import java.sql.DataTruncation;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime02tekrar {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);//2023-03-19T00:01:47.121858100

        DateTimeFormatter dtf1= DateTimeFormatter.ofPattern("MMMM/dd/yyyy HH:mm a");
        String formatteddtf1= dateTime.format(dtf1);
        System.out.println(formatteddtf1);//Mart/19/2023 00:04 ÖÖ
    }
}
