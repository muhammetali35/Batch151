package Projects;

import javax.swing.*;
import java.util.Scanner;

public class KahveMakinesi {

    /*1. Basit bir Kahve makinesi oluşturun.3 çeşit kahvemiz olsun.
2. Sistem şu soruyu sorsun: "Hangi Kahveyi istersiniz?"
3.Bu soru ile birlikte kullanıcı kahve bilgilerini görsün.Örn:Hangi Kahveyi İstersiniz? 1.Türk kahvesi  2.Filtre Kahve  3.Espresso
String hangiKahve oluşturun ve var olan kahvelerden birini yazınız.(örn: Türk Kahvesi, ya da türk kahvesi. Büyük-küçük harf duyarlı olmaması için String methodu kullanın.
4.Koşul bölümü: Eğer kahve Türk kahvesi ise, konsola "Türk kahvesi hazırlanıyor." yazsın.(String hangiKahve'yi çağırın!)
Eğer filtre kahve ise,konsola "Filtre kahve hazırlanıyor." yazsın.(String hangiKahve'yi kullanın)
Eğer Espresso ise, konsola "Espresso hazırlanıyor yazsın."(String hangiKahve'yi kullanın)
Eğer yanlış harf girerseniz, konsola "Hatalı tuşlama yaptınız." yazsın.(Hatalı tuslamadan sonra kod calısmaya devam edecektir.
5.Sistem bize şu soruyu sorsun: "Süt eklememizi ister misiniz?" (Evet veya Hayır olarak cevaplayınız)Konsolda aynen böyle  yazmalı. Parantez içi de konsolda olsun.
6.String sut olusturun.
7.Koşul Bölümü:eğer String sut, evet'e eşitse,konsola, "Süt ekleniyor..." yazısı gelsin.(Büyük küçük harf duyarlı olmaması için String methodu kullanın.
eğer String sut, hayır'a eşit ise, konsola, "Süt eklenmiyor" yazısı gelsin.
8.Sistem bize "Şeker ister misiniz ? (Evet veya hayır cevabını veriniz) : " şeklinde bir soru sorsun. (Büyük küçük harf duyarlılıgı olmaması için string method kullanın.
String seker oluşturunuz.
9.Koşul Bölümü: Eğer String seker Evet'e eşitse, sistem bize "Kaç şeker olsun?" sorusunu sormalı.
Sorunun altına int kacSeker  oluşturunuz. Şeker sayısını giriniz ve konsola şunu yazdırınız örnek: 5 şeker ekleniyor.
Eğer String şeker  hayır'a eşitse, sistem bize "Şeker eklenmiyor" cevabını versin.
10.Sistem bize "Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.) :   sorusunu sorsun. (büyük küçük harf duyarlılıgı olmamalı.
String boyut oluşturun.
11.Koşul Bölümü: Eğer String boyut Büyük boy' a eşitse =  Kahveniz büyük boy hazırlanıyor. (Büyük boy kısmını String boyut'u kullanarak yazalım= "Kahveniz" + boyut + "hazırlanıyor.")
Eğer String boyut  Orta Boy'a eşitse "Kahveniz orta boy hazırlanıyor." ("Kahveniz" + boyut + "hazırlanıyor.)
Eğer String boyut  Küçük boy'a eşitse "Kahveniz küçük boy hazırlanıyor"yazsın." ("Kahveniz" + boyut + "hazırlanıyor.)
SONUÇ BÖLÜMÜ
Siparişlerimizi verdik. Son hali görmek istiyoruz. Konsola şunu yazdırın örnek :Türk Kahvesi orta boy hazırdır. Afiyet olsun !!! (Türk kahvesi için String hangiKahveyi kullanın. Orta boy için de String boyut'u kullanın.)*/

     public static void main(String[] args) {

          Scanner input= new Scanner(System.in);
          System.out.println("Hangi Kahveyi İstersiniz? \n1.Türk Kahvesi \n2.Filtre Kahve \n3.Espresso ");
          String hangiKahve=input.nextLine();

               //KAHVE KISMI
          if(hangiKahve.equalsIgnoreCase("Türk Kahvesi")){
               System.out.println("Türk Kahvesi Hazırlanıyor.");

          }
          else if(hangiKahve.equalsIgnoreCase("Filtre Kahve")){
               System.out.println("Filtre Kahve Hazırlanıyor.");
          }
          else if(hangiKahve.equalsIgnoreCase("Espresso")){
               System.out.println("Espresso Hazırlanıyor.");
          }
          else {
               System.out.println("Hatalı tuşlama yaptınız.");
          }

               //SÜT KISMI
          System.out.println("Süt eklememizi ister misiniz? (Evet veya Hayır)");
          String sut = input.nextLine();

          if (sut.equalsIgnoreCase("Evet")) {
               System.out.println("Süt ekleniyor...");
          } else if (sut.equalsIgnoreCase("Hayır")) {
               System.out.println("Süt eklenmiyor.");
          }


               //ŞEKER KISMI
          System.out.println("Şeker istermisiniz?(Evet veya Hayır cevabı veriniz)");
          String seker= input.nextLine();

          if(seker.equalsIgnoreCase("Evet")){

               System.out.println("Kaç şeker olsun?");
               int kacSeker=input.nextInt();
               System.out.println(kacSeker+" şeker ekleniyor.");

          } else if (seker.equalsIgnoreCase("hayır")){
               System.out.println("Şeker eklenmiyor");
          }else {
               System.out.println("Şeker için hatalı giriş yaptınız.");
          }

               //BOYUT KISMI
          System.out.println("Hangi boyutta olsun ?( Büyük boy- orta boy- küçük boy olarak giriniz)");
          String boyut= input.nextLine().toLowerCase();

          if(boyut.equalsIgnoreCase("büyük boy")){
               System.out.println("Kahveniz "+ boyut+ " hazırlanıyor.");

          }else if(boyut.equalsIgnoreCase("orta boy")){
               System.out.println("Kahveniz "+ boyut+ " hazırlanıyor.");
          }else if(boyut.equalsIgnoreCase("küçük boy")){
               System.out.println("Kahveniz "+ boyut+ " hazırlanıyor.");
          }else {
               System.out.println("Hatalı giriş yaptınız.");
          }


          System.out.println(hangiKahve+" "+ boyut +" hazırdır. Afiyet Olsun!!! ");










     }
}

