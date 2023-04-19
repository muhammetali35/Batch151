package karisiksorular;

import java.util.Scanner;

public class soru11manipulationsornekler {

    public static void main(String[] args) {
    /*
    Kullanıcıdan ismini soyismini ve kredi kart numarasını isteyin ve aşağıdaki gibiyazdırın
    isim-soyisim: M**** B*****
    kart no: **** **** **** 1234
     */

        Scanner input= new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName= input.next().toUpperCase();
        char f1= firstName.charAt(0);
        System.out.println("Enter your last name");
        String lastName= input.next().toUpperCase();
        char f2= lastName.charAt(0);
        System.out.println("Enter your card number");
        double cardNo= input.nextDouble();
        long sonDort= (int)cardNo%10000;


        String s="";
        String s1="";

        for (int i=1; i<=firstName.length()-1; i++){
            s=s+"*";
        }

        for (int i=1; i<=lastName.length()-1; i++){
            s1=s1+"*";
        }
        System.out.println("isim-soyisim:"+f1+s+f2+s1);

       System.out.println("Kart no: "+"**** **** **** "+sonDort);//Başka yolları var mı bak??










    }
}
