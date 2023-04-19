package karisiksorular;

import java.util.Scanner;

public class soru3indexof {
    public static void main(String[] args) {
        //kullanıcıdan bir cumle ve bir harf isteyin, harfin var olup olmadığını kontrol edin
        //ahmet top aldı ve top attı.// yapamadım bak bidaha soru indexof() sorular 2

        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen bir cümle  giriniz...");
        String cumle= input.nextLine();
        System.out.println("Aramak istediğiniz harfi giriniz");
        char harf= input.next().charAt(0);

        if(cumle.indexOf(harf)>=1){
            System.out.println("Harf cümlede bulundu");
        }else {
            System.out.println("Harf cümlede bulunmadı");
        }



    }
}
