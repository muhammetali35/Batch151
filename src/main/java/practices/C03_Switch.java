package practices;

import java.util.Scanner;

public class C03_Switch {
    /*
     Bir ATM'de aşağıdaki banka işlemlerini yapmak için, kullanicidan 1-4 arası işlem
     numarasını sisteme girmesini isteyiniz.

     işlem 1: Bakiye Sorgulama
     işlem 2: Para Cekme
     işlem 3: Para Yatırma
     işlem 4: İşlemi Sonlandırın

     Ve bu islemleri Switch case kullanarak yaptırınız.
     */

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Lütfen yapacağınız işlem numarasını giriniz ?"+"\n"+
                "İşlem 1: Bakiye Sorgulama"+"\n"+
                "İşlem 2: Para Çekme"+"\n"+
                "İşlem 3: Para Yatırma"+"\n"+
                "İşlem 4: İşlem Sonlandır"+"\n");

        int islemNo=input.nextInt();

        int bakiye=1000;



        switch (islemNo) {
            case 1: //Bakiye Sorgulama
                System.out.println("Bakiyeniz: "+bakiye+ "TL");
                break;
            case 2: //Para Çekme
                System.out.println("Çekmek istediğiniz parayı giriniz: ");
                int cekilecekPara=input.nextInt();
                if(cekilecekPara<bakiye){
                    bakiye-=cekilecekPara;
                    System.out.println("Para çekme işleminden sonra kalan bakiyeniz :"+bakiye);
                }else {
                    System.out.println("Bakiyeniz yetersiz");
                }
                break;
            case 3:
                System.out.println("Kaç para yatırmak istiyorsunuz?");
                int yatanPara =input.nextInt();
                if(yatanPara<2000){
                    bakiye+=yatanPara;
                    System.out.println("Mevcut bakiyeniz :"+bakiye+" TL");
                }else {
                    System.out.println("ATM'de günlük para yatrıma limiti 2000 TL");
                }
                break;
            case 4:
                System.out.println("Bankamızı kullandığınız için teşekkür ederiz iyi günler ");
                break;
            default:
                System.out.println("Yanlış bir değer girdiniz");
        }
    }
}
