package karisiksorular;

import java.util.Scanner;

public class soru38SwitchStatement {
    public static void main(String[] args) {
        //Switch de long, double, float ve boolean kullanılmaz.
        /*
        Kulanıcıdan SDET kısaltmasındaki harflerden birini yazmasını isteyin.
        Kullanıcı S girerse "Software"
        Kullanıcı D girerse "Developer"
        Kullanıcı E girerse "Engineer"
        Kullanıcı T girerse "In Testing" yazdırın
         */
        Scanner input= new Scanner(System.in);
        System.out.println("Enter one of the letters int the SDET ,please... ");
        char let= input.next().charAt(0);

        switch (let){
            case 'S' , 's':
                System.out.println("Software");
                break;
            case 'D' , 'd':
                System.out.println("Developer");
                break;
            case 'E' , 'e':
                System.out.println("Engineer");
                break;
            case 'T' , 't':
                System.out.println("In Testing");
                break;
            default:
                System.out.println("You have entered invalid");
                break;


        }

    }
}
