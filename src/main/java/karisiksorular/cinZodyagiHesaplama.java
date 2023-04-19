package karisiksorular;

import java.util.Scanner;

public class cinZodyagiHesaplama {
    public static void main(String[] args) {
        /*
        Proje Konusu
#Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.

Artık yıl, Miladî takvimde 365 yerine 366 günü olan yıl. Bu fazladan gün artık gün, normalde
   28 gün olan şubat ayına 29 Şubat’ın eklenmesi ile elde edilir.

Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

Doğum Tarihi %12 = 0  | Maymun
Doğum Tarihi %12 = 1 | Horoz
Doğum Tarihi %12 = 2 | Köpek
Doğum Tarihi %12 = 3 | Domuz
Doğum Tarihi %12 = 4 | Fare
Doğum Tarihi %12 = 5 | Öküz
Doğum Tarihi %12 = 6 | Kaplan
Doğum Tarihi %12 = 7 | Tavşan
Doğum Tarihi %12 = 8 | Ejderha
Doğum Tarihi %12 = 9 | Yılan
Doğum Tarihi %12 = 10 | At
Doğum Tarihi %12 = 11 | Koyun
         */

        Scanner input= new Scanner(System.in);
        System.out.println("Enter your birthday in year");

        Short year =input.nextShort();

        int kalan= year%12;
        String zodyag="";
        switch (kalan){
            case 0:
                zodyag="Maymun";
                break;
            case 1:
                zodyag="Horoz";
                break;
            case 2:
                zodyag="Köpek";
                break;
            case 3:
                zodyag="Hınzır";
                break;
            case 4:
                zodyag="Fare";
                break;
            case 5:
                zodyag="Öküz";
                break;
            case 6:
                zodyag="Kaplan";
                break;
            case 7:
                zodyag="Tavşan";
                break;
            case 8:
                zodyag="Ejderha";
                break;
            case 9:
                zodyag="Yılan";
                break;
            case 10:
                zodyag="At";
                break;
            case 11:
                zodyag="Koyun";
                break;
            default:
                System.out.println("Tekrar deneyiniz...");
        }
        System.out.println("Çin zodyağına göre: "+zodyag);


    }
}
