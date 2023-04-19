package QA5_TeamExercises;

import java.util.Scanner;

public class RakamiYaziIleYAzdirma {

    //Girilen sayıyı yazı ile yazdır
    public static void main(String[] args) {

        String[] birler={"","bir","iki","üç","dört","beş","altı","yedi","sekiz","dokuz","on"};
        String[] onlar={"","on","yirmi","otuz","kırk","elli","altmış","yetmiş","seksen","doksan"};
        String[] yuzler={"","yüz","ikiyüz","üçyüz","dörtyüz","beşyüz","altıyüz","yediyüz","sekizyüz","dokuzyüz"};

        Scanner input= new Scanner(System.in);
        System.out.println("Üç basamaklı bir sayı giriniz");
        int sayi=input.nextInt();

        int birlerBasamagi=sayi%10;
        int onlarBasamagi=(sayi/10)%10;
        int yuzlerBasamagi=(sayi/100)%10;

        String yazi=yuzler[yuzlerBasamagi] + " " + onlar[onlarBasamagi]+ " " + birler[birlerBasamagi];

        System.out.println(yazi);



     }
    }

