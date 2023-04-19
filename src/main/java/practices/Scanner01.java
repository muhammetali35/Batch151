package practices;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        /*

        Kullanıcıdan adını, soyadını, yaşını, boyunu ve kilosunu ayrı ayrı sisteme girmesini isteyin
        ve bunları şu şekilde konsola yazdırın:

        Adı: ...
        Soyadı: ...
        Yas: ...
        Boy: ...
        Kilo: ...

	    */

        Scanner input= new Scanner(System.in);

        System.out.print("Adınızı giriniz: ");
        String ad= input.nextLine();

        System.out.print("Soyadınızı giriniz: ");
        String soyAd= input.nextLine();

        System.out.print("Yaşınızı giriniz: ");
        int yas= input.nextInt();

        System.out.print("Boyunuzu giriniz: ");
        double boy= input.nextDouble();

        System.out.print("Kilonuzu giriniz: ");
        int kilo= input.nextInt();

        System.out.println("Adı: "+ad+"\n"+ "Soyadı: "+soyAd+"\n"+"Yaş: "+yas+"\n"+"Boy: "+boy+"\n"+"Kilo: "+kilo);

    }
}
