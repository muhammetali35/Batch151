package pratice2;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkList_Soru {
    public static void main(String[] args) {
/* Node'ları "Ali", "veli", "Can" ve "Ayşe" olan bir linklist oluşturun.
Kullanıcıdan bir isim alın. Bu isim LinkedList'de varsa silin ve kullanıcıya "Bu isim
LinkedList'te vardı ve silindi" diye mesaj verin.
Bu isim LinkedList'te yoksa "Bu isim LinkedList"te yok bu yüzden silinemedi" diye mesaj ver

 */
        LinkedList<String> ll1= new LinkedList<>();
        ll1.add("Ali");
        ll1.add("Veli");
        ll1.add("Can");
        ll1.add("Ayşe");

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir isim giriniz");
        String isim=scan.next();

        if( ll1.remove(isim)){
           System.out.println(isim +"==> Bu isim Listte vardı ve silindi");
            System.out.println(ll1);
        }else {
            System.out.println("Bu isim listte yok bu yüzden silinemedi.");
            System.out.println(ll1);
        }
        scan.close();

    }
}
