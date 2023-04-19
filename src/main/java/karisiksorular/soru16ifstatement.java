package karisiksorular;

import java.util.Scanner;

public class soru16ifstatement {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir gun alın eğer gun "Cuma" ise ekrana "Müslümanlar için kutsal gün"
        eğer gun "Cumartesi" ise ekrana "Yahudiler için kutsal gün"
        eğer gun "Pazar" ise ekrana "Hristiyanlar için kutsal gün" yazdırın

         */
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a day, please...");
        String day =input.next();

        if(day.equalsIgnoreCase("Cuma")){
            System.out.println("Friday is holy day for Muslims");
        }
        if(day.equalsIgnoreCase("Cumartesi")){
            System.out.println("Saturday is holy day for Jews");
        }
        if(day.equalsIgnoreCase("Pazar")) {
            System.out.println("Sunday is holy day for Christians");
        }
    }
}
