package day21datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime01tekrar {
    public static void main(String[] args) {
        //Anlık zamanı nasıl alırız?
        LocalTime myCurrentTime=LocalTime.now();
        System.out.println(myCurrentTime);//23:42:00.117263200

        //Anlık zamanda bileşenler nasıl alınır?

        System.out.println(myCurrentTime.getHour());//23
        System.out.println(myCurrentTime.getMinute());//42
        System.out.println(myCurrentTime.getSecond());//00
        System.out.println(myCurrentTime.getNano());//117263200

        //Gelecek ve geçmiş zaman nasıl gidilir?
        LocalTime nextTime=myCurrentTime.plusHours(3).plusMinutes(10).plusSeconds(10);
        System.out.println(nextTime);//02:55:47.269586100

        //Zaman formatı nasıl değiştirilir?
        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("HH:mm");
        String formatterMyCurrentTime=dtf1.format(myCurrentTime);

        System.out.println(formatterMyCurrentTime);//23:48

        //Date formati nasıl değiştirilir?
        LocalDate myCurrentDate=LocalDate.of(2022,8,25);
        System.out.println(myCurrentDate);//2022-08-25

        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedCurrentDate=dtf2.format(myCurrentDate);
        System.out.println(formattedCurrentDate);//08/25/2022

        //Tarihi Gun/Ay isminin ilk 3 harfi/yil şekline çeviriniz. 25/Aug/2022

        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("dd/MMM/2022");
        String time3=dtf3.format(myCurrentDate);
        System.out.println(time3);//25/Ağu/2022

        //Başka bir zaman dilimindeki tarih ve zamanı nasıl alırız?
        LocalDate dateTokyo=LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateTokyo);

        LocalDate dateIstanbul=LocalDate.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(dateIstanbul);//2023-03-18

        LocalTime timeParis=LocalTime.now(ZoneId.of("Europe/Paris"));
        System.out.println(timeParis);//21:58:10.844919400

        LocalTime timeBerlin=LocalTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(timeBerlin);//22:00:12.440102700














    }
}
