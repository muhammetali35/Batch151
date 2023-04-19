package Projects;

import java.util.Scanner;



public class KahveMakinesiFarkliCozum {
    static String hangiKahve = "";
    static Scanner input = new Scanner(System.in);
    static String sut;
    static String seker;
    static int kacSeker;
    static String boyut;

    public static void main(String[] args) {
        anaMenu();

    }

    public static void anaMenu(){
        do {
            System.out.println("Hangi kahveyi istersiniz \n1.Türk Kahvesi \n2.Filtre Kahve \n3.Espresso");
            hangiKahve=input.nextLine().toLowerCase();
            if(hangiKahve.equalsIgnoreCase("türk kahvesi") ||
                    hangiKahve.equalsIgnoreCase("filtre kahve") ||
                    hangiKahve.equalsIgnoreCase("espresso")){
                System.out.println(hangiKahve+ " hazırlanıyor...");
                sut();
            }else {
                System.out.println("Hatalı giriş yaptınız.");
            }

        }while (true);
    }

    public static void sut(){
        System.out.println("Süt eklememizi ister misiniz? (Evet veya Hayır olarak cevaplayınız)");
        sut=input.next().toLowerCase();
        if(sut.equalsIgnoreCase("evet")){
            System.out.println("Süt ekleniyor...");
            seker();
        }else if(sut.equalsIgnoreCase("hayır")){
            System.out.println("Süt eklenmiyor");
            seker();
        }else {
            System.out.println("Süt için hatalı giriş yaptınız.");
            sut();
        }
    }

    public static void seker(){
        System.out.println("Şeker istermisiniz?(Evet veya Hayır cevabı veriniz)");
        seker=input.next().toLowerCase();
        if(seker.equalsIgnoreCase("evet")){
            System.out.println("Kaç şeker olsun?");
            kacSeker=input.nextInt();
            input.nextLine(); // neden ?? boş dummy
            System.out.println(kacSeker+ " şeker ekleniyor.");
            boyut();

        }else if(seker.equalsIgnoreCase("hayır")){
            System.out.println("Şeker eklenmiyor.");
            //input.nextLine();// neden ?? boş dummy
            boyut();

        }else {
            System.out.println("Şeker için hatalı giriş yaptınız.");
            seker();
        }
    }
    public static void boyut(){
        System.out.println("Hangi boyutta olsun ?( Büyük boy- orta boy- küçük boy olarak giriniz)");
        boyut=input.nextLine().toLowerCase();
        if(boyut.equalsIgnoreCase("büyük boy") || boyut.equalsIgnoreCase("orta boy")
        || boyut.equalsIgnoreCase("küçük boy")){
            System.out.println("Kahveniz "+ boyut+ " hazırlanıyor.");
            sonuc();

        }else {
            System.out.println("Boyut için hatalı tuşlama yaptınız. ");
            boyut();
        }
    }

    public static void sonuc(){
        System.out.println(hangiKahve+" "+ boyut+ " hazırdır. Afiyet Olsun!!!") ;
        anaMenu();
    }


}