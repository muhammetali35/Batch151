package karisiksorular;

import java.util.Scanner;

public class sicakligaGoreEtkinlik {
    public static void main(String[] args) {
        /*
        Proje Konusu
#Java ile kullanıcının girdiği sıcaklık durumuna göre aşağıda ki etkinlikleri
öneren programı yazınız.
- Sıcaklık 5'den küçük ise "Kayak" yapmayı öner.
- Sıcaklık 5 ve 15 arasında ise "Tiyatro" etkinliğini öner.
- Sıcaklık 15 ve 25 arasında ise "Mangal" etkinliğini öner.
- Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

         */
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the temperature");
        byte temp= input.nextByte();
        String event="";

        if(temp<5){
            event= "Kayak";
        }else if(temp<15){
            event= "Tiyatro";
        }else if(temp<25){
            event="Mangal";
        }else{
            event="Yüzme";
        }
        System.out.println("Önerilen etkinlik: "+event);


    }
}
