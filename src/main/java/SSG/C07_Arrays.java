package SSG;

import java.util.Scanner;

public class C07_Arrays {
    public static void main(String[] args) {
        /*
        Verilen bir method array'in istenen bir elemanı içerip içermediğini kontrol edip,
         bize true veya false sonucu dçnen bir mthod oluşturun
         */
        String isimler[]={"furkan","veli","hüzeyin", "hakan", "ali", "ece","isa","cem","ibrahim"};
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen kontrol için bir isim giriniz");
        String arananIsim = input.nextLine();
        contains(isimler,arananIsim);
    }

     public static void contains(String[] isimler,String arananIsim) {

        boolean sonuc = false;

        for(int i=0; i<isimler.length; i++) {
            if(isimler[i].equalsIgnoreCase(arananIsim)){
                sonuc=true;
            }
        }
         System.out.println(sonuc);

    }
}
