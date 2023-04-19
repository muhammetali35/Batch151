package karisiksorular;

import java.util.Scanner;

public class soru54DoWhile {
    public static void main(String[] args) {
        /*
        Kullanıcıdan toplamak üzere pozitif  sayilar isteyin, işlemi bitirmek için 0'a
        basmasını söyleyin.
        Kullanıcı 0'a bastığında toplam kaç pozitif sayi girdiğini ve girdiği pozitif
        sayiların toplamının kaç olduğunu yazdırın
         */
        Scanner input = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        int number;
        do {
            System.out.println("Pozitif tamsayı girin(çıkmak için 0'a basın): ");
            number=input.nextInt();
            if (number > 0) {
                count++;
                sum += number;

            }

        }while (number!=0);

        System.out.println("Girdiğiniz: "+ count+ " pozitif sayının toplamı: "+sum);
    }
}