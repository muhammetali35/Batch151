package karisiksorular;

import java.util.Scanner;

public class soru4indexof {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanımına
        bakarak aşağıdaki 3 cumleden  uygun olanı yazdırın.
        -Girilen kelime cumlede kullanılmamıs
        -Girilen kelime cumlede 1 kere kullanılmıs
        -Girilen kelime cumlede 1'den fazla kullanılmıs
         */
//ahmet top atsana top at lan-----cumle.indexOf(kelime, index + kelime.length()) == -1
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen bir cümle  giriniz...");
        String cumle= input.nextLine();
        System.out.println("Aramak istediğiniz kelimeyi giriniz");
        String kelime= input.next();

        int index=cumle.indexOf(kelime);


        if(index==-1){
            System.out.println("Girilen kelime cumlede kullanılmamıs");
        }else if (cumle.indexOf(kelime,index+ kelime.length())==-1) {
            System.out.println("Girilen kelime cumlede 1 kere kullanılmış");
        }else  {
            System.out.println("Girilen kelime cumlede 1 den fazla kullanılmış");
        }
    }
}
