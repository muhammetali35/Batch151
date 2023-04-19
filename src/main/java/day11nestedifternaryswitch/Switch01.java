package day11nestedifternaryswitch;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan gun isimlerini alınız, o gunun kaçıncı gun olduğunu ekrana yazdırınız
        Sunday==>1 Monday==>2
         */
        Scanner input= new Scanner(System.in);
        System.out.print("Please enter a day name...");
        String dayName = input.next();

        //1.Way:
        if(dayName.equalsIgnoreCase("Sunday")){
            System.out.println("Sunday is the first day");
        }else if(dayName.equalsIgnoreCase("Monday")){
            System.out.println("Monday is the second day");
        }else if(dayName.equalsIgnoreCase("Tuesday")){
            System.out.println("Monday is the third day");
        }else if(dayName.equalsIgnoreCase("Wednesday")){
            System.out.println("Monday is the fourth day");
        }else if(dayName.equalsIgnoreCase("Thursday")){
            System.out.println("Monday is the fifth day");
        }else if(dayName.equalsIgnoreCase("Friday")){
            System.out.println("Monday is the sixth day");
        }else if(dayName.equalsIgnoreCase("Saturday")){
            System.out.println("Monday is the seventh day");
        }else {
            System.out.println("Invalid day name ");
        }

        //2.Way:

        switch (dayName.toLowerCase()){
            case "sunday":
                System.out.println("Sunday is the first day");
                break;
            case "monday":
                System.out.println("Monday is the second day");
                break;
            case "tuesday":
                System.out.println("Monday is the third day");
                break;
            case "wednesday":
                System.out.println("Monday is the fourth day");
                break;
            case "thursday":
                System.out.println("Monday is the fifth day");
                break;
            case "friday":
                System.out.println("Monday is the sixth day");
                break;
            case "saturday":
                System.out.println("Monday is the seventh day");
                break;
            default:
                System.out.println("Invalid day name ");
        }

    }
}
