package karisiksorular;

import java.util.Scanner;

public class soru55DoWhile {
    public static void main(String[] args) {
        /*
        Kullanıcıdan toplamak üzere pozitif sayılar isteyin, işlemi bitirmek için 0'a basmasını
        söyleyin.
        Kullanıcı yanlışlıkla negative sayı girerse o sayıyı dikkate almayın ve "negative sayi
         giremezsiniz" yazdırıp basa donun
         Kullanıcı 0'a bastığında toplam kaç pozitif sayi girdiğini, yanlışlıkla
         kaç negatif sayı girdiğini ve girdiği sayıların toplamının kaç olduğunu yazdırın.

         */
        Scanner input = new Scanner(System.in);

        int countPos=0;
        int countNeg=0;
        int toplamPos=0;
        int toplamNeg=0;

        int num;

        do {
            System.out.println("Pozitif tamsayı giriniz( Çıkmak için 0'a basınız");
            num=input.nextInt();
            if(num>0){
                countPos++;
                toplamPos+=num;
            }else if (num<0){
                System.out.println("Negatif sayı giremezsiniz");
                countNeg++;
                toplamNeg+=num;
            }
        }while (num!=0);

        System.out.println("Girilen pozitif sayı adedi: "+countPos+" Girilen pozitif sayıların toplamı: "
                        +toplamPos+ " Girilen negatif sayı adedi: "+ countNeg+
                        " Girilen negatif sayıların toplamı: "+ toplamNeg);


    }
}
