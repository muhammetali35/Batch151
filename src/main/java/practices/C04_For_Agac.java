package practices;

import java.util.Scanner;

public class C04_For_Agac {
    /*

         Agac sekli olusturmak icin, kullanicidan yaprak satir sayisini ve gövde satir sayisini ayrı ayrı
         sisteme girmesini isteyiniz.

         Asagıdaki agac seklini konsala yazdırınız


        ^
        ^^
        ^^^
        ^^^^
        ^^^^^
        |||
        |||
        |||
        |||
        |||


         */
            public static void main(String[] args) {


            Scanner scan=new Scanner(System.in);
                System.out.println("Yaprak satır sayısını giriniz");
                int yaprakSatirSayisi=scan.nextInt();

                System.out.println("Gövde satır sayısını giriniz");
                int govdeSatirSayisi=scan.nextInt();

                String yaprak= "";
                String govde="";
                for(int i=0; i<yaprakSatirSayisi; i++) {
                    yaprak=yaprak+"^";
                    System.out.println(yaprak);
                }
                for(int i=0; i<govdeSatirSayisi; i++){
                    System.out.println("|||");
                }



    }
}
