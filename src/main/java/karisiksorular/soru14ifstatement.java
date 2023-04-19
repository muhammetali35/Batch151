package karisiksorular;

import java.awt.*;
import java.util.Scanner;

public class soru14ifstatement {
    public static void main(String[] args) {
        /*
        Kullaınıcıdan gun ismini alın ve hafta içi veya hafta sonu olduğunu yazdırın
        Ornek:  gun= Pazar output ="Hafta sonu"
                gun= Salı output ="Hafta içi"
                String için equals methotunu kullanın.
         */
        Scanner input= new Scanner(System.in);
        System.out.println("Enter name of a day");
        String day= input.nextLine();

        if(day.equalsIgnoreCase("Pazar") || day.equalsIgnoreCase("Cumartesi")){
            System.out.println("Weekend: "+day);
        }
        if(day.equalsIgnoreCase("Pazartesi") ||
                day.equalsIgnoreCase("Salı") ||
                day.equalsIgnoreCase("Çarşamba") ||
                day.equalsIgnoreCase("Perşembe") ||
                day.equalsIgnoreCase("Cuma") ){
            System.out.println("On Weekday: "+day);
    }

}}
