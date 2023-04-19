package QA5_TeamExercises;

import java.util.Scanner;

public class C05_KediMamaSorusu {
    /*
    4 kedi var 3 çeşit mama var . Herkedi her mamyı yemiyor .

    1.Kedi 1 ve 3. çeşit mamayı yiyor
    2.Kedi 2 ve 3. çeşit mamayı yiyor
    3.Kedi yalnız 1. çeşit mam yiyor
    4.Kedi yalnız 3. çeşit mam yiyor
    switch case ile yap
    ==> yer veya yemez yazdır

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kedi numarasını giriniz");
        int kediNumarasi = input.nextInt();

        System.out.println("Lütfen mama numarasını girniz");
        int mamaNumarasi = input.nextInt();

        switch (kediNumarasi) {
            case 1:
                if (mamaNumarasi == 1 && mamaNumarasi == 3) {
                    System.out.println("Yer");

                } else {
                    System.out.println("Yemez");
                }

                break;
            case 2:
                if (mamaNumarasi == 2 && mamaNumarasi == 3) {
                    System.out.println("Yer");

                } else {
                    System.out.println("Yemez");
                }
                break;

            case 3:
                if (mamaNumarasi == 1) {
                    System.out.println("Yer");

                } else {
                    System.out.println("Yemez");
                }
                break;
            case 4:
                if (mamaNumarasi == 3) {
                    System.out.println("Yer");

                } else {
                    System.out.println("Yemez");
                }
                break;
            default:
                System.out.println("Geçersiz değer girdiniz");


        }
    }
}