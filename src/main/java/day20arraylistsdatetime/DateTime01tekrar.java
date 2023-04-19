package day20arraylistsdatetime;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTime01tekrar {
    public static void main(String[] args) {

        //İçinde bulunduğumuz zaman dilimindeki tarihi nasıl alırız?
        LocalDate myCurrentDate= LocalDate.now();
        System.out.println(myCurrentDate);//2023-03-18

        System.out.println(myCurrentDate.getMonthValue());//3
        System.out.println(myCurrentDate.lengthOfMonth());//31

        System.out.println(myCurrentDate.getDayOfMonth());//18
        System.out.println(myCurrentDate.getMonth());//MARCH
        System.out.println(myCurrentDate.getDayOfWeek());//SATURDAY

        //İleri tarihe nasıl gidilir?
        System.out.println(myCurrentDate.plusYears(7).plusMonths(7).plusDays(12));//2030-10-30
        //Geçmiş tarihe nasıl gidilir?
        System.out.println(myCurrentDate.minusYears(13).minusMonths(5).minusDays(8));//2009-10-10

        LocalDate muhammetDate=LocalDate.of(1992,7,12);
        LocalDate mehmetDate=LocalDate.of(1995,5,10);
        System.out.println(muhammetDate);//1992-07-12
        System.out.println(mehmetDate);//1995-05-10

        boolean r1=mehmetDate.isAfter(muhammetDate);
        System.out.println(r1);//true

        boolean r2=muhammetDate.isBefore(mehmetDate);
        System.out.println(r2);//true

        boolean r3=muhammetDate.equals(mehmetDate);
        System.out.println(r3);//false

//Example 1: Kullanıcıdan alıdığınız tarih geçmişe ait ise "Geçersiz tarih girdiniz" mesajı veriniz.
//           Kullanıcıdan alıdığınız tarih geleceğe ait ise "Zamanı girebilirsiniz"  mesajı veriniz.

        Scanner input= new Scanner(System.in);
        System.out.println("Please enter year, month and day numbers in the given order");
        int year=input.nextInt();
        int month=input.nextInt();
        int day=input.nextInt();

        LocalDate givenDate=LocalDate.of(year,month,day);
        LocalDate today= LocalDate.now();
        boolean result=givenDate.isBefore(today);
        if(result){
            System.out.println("Geçersiz tarih girdiniz");
        }else{
            System.out.println("Zamanı girebilirsiniz");
        }

        //Example 2: Kullanıcının girdiği tarihin gun ismini bulan kodu yazınız

        System.out.println("Please enter year month and day numbers in the given order");
        int y=input.nextInt();
        int m=input.nextInt();
        int d=input.nextInt();

        LocalDate date=LocalDate.of(y,m,d);
        System.out.println(date.getDayOfWeek());








    }
}
