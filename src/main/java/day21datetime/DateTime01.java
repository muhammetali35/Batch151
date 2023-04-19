package day21datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {
        //Anlık zamanı nasıl alırız?
        LocalTime myCurrentTime= LocalTime.now();
        System.out.println(myCurrentTime);//19:14:02.645133800

        //Anlık zamanda bileşenler nasıl alınır?
        int hour= myCurrentTime.getHour();
        System.out.println(hour);//19

        int minute=myCurrentTime.getMinute();
        System.out.println(minute);//16

        int second=myCurrentTime.getSecond();
        System.out.println(second);//18

        int nano=myCurrentTime.getNano();
        System.out.println(nano);//345766700

        //Gelecek ve geçmiş zaman nasıl gidilir?
        LocalTime next=myCurrentTime.plusMinutes(23).minusMinutes(11);
        System.out.println(next);//Bulunulan dakikaya 23 dk ekledik ve 11 dakika eksilttik

        //Zaman formatı nasıl değiştirilir?
        //"HH" 24'luk saat sistemini, "hh" 12'lik saat sistemini kullanır.
        //"hh:mm a" ifadesindeki "a" 12 lik saat sisteminde "AM", "PM" yazılmasını sağlar.
        //"ss" saniyeyi gösterir.
        //"mm" "minute" demektir. "MM" "month" demektir.
        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("HH:mm");
        String formatterMyCurrentTime=dtf1.format(myCurrentTime);

        System.out.println(formatterMyCurrentTime);//19:39:05.218133300 ==>>19.27

        //Date formati nasıl değiştirilir?
        LocalDate myCurrentDate= LocalDate.of(2022,8,25);
        System.out.println(myCurrentDate);//2022-08-25

        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedMyCurrentDate=dtf2.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate);//08/25/2022

        //Tarihi Gun/Ay isminin ilk 3 harfi/yil şekline çeviriniz. 25/Aug/2022
        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("dd/MMM/yy");
        String formattedCurrentDate2=dtf3.format(myCurrentDate);
        System.out.println(formattedCurrentDate2);//25/Ağu/22

        //Tarihi Gun/Ay ismi/yıl şekline çeviriniz. 25/Ağustos/2022
        DateTimeFormatter dtf4=DateTimeFormatter.ofPattern("dd/MMMM/yy");
        String formattedMyCurrentDate3=dtf4.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate3);//25/Ağustos/22

        //Başka bir zaman dilimindeki tarih ve zamanı nasıl alırız?
        //Tokyo'da ayın kaçı?
        LocalDate dateInTokyo=LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);//2023-03-18

        //Tashkent'te saat kaç?
        LocalTime timeInTashkent= LocalTime.now(ZoneId.of("Asia/Tashkent"));
        System.out.println(timeInTashkent);//21:50:09.197227700

        //Tokyo'da saat kaç?
        LocalTime timeInTokyo= LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);//01:50:09.197227700

        //Berlin'de saat kaç?

        LocalTime timeInBerlin= LocalTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(timeInBerlin);//17:50:09.198224


















    }
}
