package karisiksorular;

import java.util.Scanner;

public class soru2contains {
    /*
    Kullanıcıdan bir cümle isteyin.Cumle "buyuk" kelimesi içeriyorsa tum cumleyi
    buyuk harf olarak "kucuk" kelimesi içeriyorsa tum cumleyi kucuk harf olarak
    yazdırın iki kelimeyi de içermiyorsa "Cumle kucuk yada buyuk elimesi içermiyor" yazdırın
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz...");
        String cumle= input.nextLine();

        if(cumle.contains("buyuk")){
            System.out.println(cumle.toUpperCase());

        } else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());
        }else {
            System.out.println("Cumle kucuk yada buyuk elimesi içermiyor");
        }


    }
}
