package karisiksorular;

import java.util.Scanner;

public class soru35SwitchStatement {
    public static void main(String[] args) {
        // Kullanıcıdan haftanın kaçıncı günü olduğunu sorun ve gün ismini yazdırın
        Scanner input= new Scanner(System.in);
        System.out.println("What day of the week is it? ");
        byte numberOfDay= input.nextByte();

        switch (numberOfDay){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("You entered invalid");
                break;

        }


    }
}
