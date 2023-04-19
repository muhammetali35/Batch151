package SSG;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C07_List {
    /*
    İçinde 200 tane 1000'den küçük pozitif tamsayı olan bir list oluşturun
    kullanıcıdan bir sayı isteyip listede var olup olmadığını kullanıcıya yazın.
     */

    public static void main(String[] args) {
        Random randomSayilar= new Random();

        List<Integer> sayiListesi= new ArrayList<>();
        int sayi=0;
        while (sayiListesi.size()<200){
            sayi=randomSayilar.nextInt(1000);
            if(!sayiListesi.contains(sayi)){
                sayiListesi.add(sayi);
            }
        }
        System.out.print(sayiListesi);

        Scanner scan= new Scanner(System.in);
        int kalanTahmin=5;
        int tahmninSayisi=0;
       do {
           System.out.println("Lütfen tahminde bulunmak için sayı giriniz");
           sayi=scan.nextInt();
           tahmninSayisi++;
           if(sayiListesi.contains(sayi)){
               System.out.println("Tebrikler "+tahmninSayisi+" . tahminde doğru sonuca ulaştınız.");
                break;
           }


           kalanTahmin--;
           System.out.println("Kalan tahmin sayınız "+ kalanTahmin);
       }while (kalanTahmin>0);
       if(kalanTahmin==0){
           System.out.println("Malesef bulamadınız.");
       }
    }
}
