package day20arraylistsdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {
        //İçinde bulunduğumuz zaman dilimindeki tarihi nasıl alırız?
        LocalDate myCurrentDate=LocalDate.now();
        System.out.println(myCurrentDate);//2023-03-15

        int monthValue=myCurrentDate.getMonthValue();
        System.out.println(monthValue);//3

        int yearValue=myCurrentDate.getYear();
        System.out.println(yearValue);//2023

        int dayValue=myCurrentDate.getDayOfMonth();
        System.out.println(dayValue);//15

        //Aşağıdaki "Month" bir Enum'dır.
        //Enum. Java'daki sabit değerleri(Ay isimleri,Gün isimleri,Şehir isimleri,Samayolu Galaksisindeki Gezegen İsimleri)
        // depolamak için kullanılır.
        Month monthName=myCurrentDate.getMonth();
        System.out.println(monthName);//MARCH

        DayOfWeek dayName=myCurrentDate.getDayOfWeek();
        System.out.println(dayName);//WEDNESDAY

        //İleri tarihe nasıl gidilir?
        System.out.println(myCurrentDate.plusDays(5).plusMonths(2).plusDays(4));//2023-05-24

        //Geçmiş tarihe nasıl gidilir?
        System.out.println(myCurrentDate.minusYears(30).minusMonths(2).minusDays(18));

        LocalDate gokhanDate= LocalDate.of(1986,6,10);
        LocalDate fatifDate= LocalDate.of(1985,2,25);

        // Bir tarihin bir tarihten sonra olup olmadığını nasıl öğreniriz?
        boolean r1=gokhanDate.isAfter(fatifDate);//fatih gökhandan sonra doğdu mu?
        System.out.println(r1);//true

        // Bir tarihin bir tarihten önce olup olmadığını nasıl öğreniriz?
        boolean r2=fatifDate.isBefore(gokhanDate);//gökhan fatihten önce doğdu mu?
        System.out.println(r2);//true

        // Bir tarihin bir tarihe eşit olup olmadığını nasıl öğreniriz?
        boolean r3=gokhanDate.isEqual(fatifDate);
        System.out.println(r3);//false

        //Example 1: Kullanıcıdan alıdığınız tarih geçmişe ait ise "Geçersiz tarih girdiniz" mesajı veriniz.
        //           Kullanıcıdan alıdığınız tarih geleceğe ait ise "Zamanı girebilirsiniz"  mesajı veriniz.

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter year month and day numbers in the given order");
        int year=input.nextInt();
        int month=input.nextInt();
        int day=input.nextInt();

        LocalDate givenDate=LocalDate.of(year,month,day);

        if(givenDate.isBefore(LocalDate.now())){
            System.out.println(givenDate+" İnvalid day");
        }else {
            System.out.println("Enter time for the ticket");
        }

        int lengthOfMonth=myCurrentDate.lengthOfMonth();
        System.out.println(lengthOfMonth);//31 ayın kaç çektiğine bakıyor

        //Example 2: Kullanıcının girdiği tarihin gun ismini bulan kodu yazınız

        System.out.println("Please enter year month and day numbers in the given order");
        int y=input.nextInt();
        int m=input.nextInt();
        int d=input.nextInt();

        LocalDate date=LocalDate.of(y,m,d);

        System.out.println(date.getDayOfWeek());//S


    }
}
