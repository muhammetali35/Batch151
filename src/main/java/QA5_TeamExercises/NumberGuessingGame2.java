package QA5_TeamExercises;

import java.util.Scanner;

public class NumberGuessingGame2 {
   /* public static void main(String[] args) {
        try {
            menu();
        }catch (Exception e) {
            System.out.println("Hatalı giriş yapıldı.Lütfen tekrar deneyiniz.");
        }

    }

    public static void menu(){
        Scanner input= new Scanner(System.in);
        System.out.println("******Sayı tahmin oyununa Hoşgeldiniz******");
        System.out.println("Benim tuttuğum sayı için 1 giriniz. \n "+
                "Sizin tuttuğunuz sayıyı tahmin etek için 2 giriniz.\n" +
                "Çıkmak için 0 giriniz.\n" +
                "*****************************\n"+ "GİRİŞ: ");

        int secenek=input.nextInt();
        if(secenek==1){
            oyuncuTahmini();
        }else if(secenek==2){
            bilgisayarTahmini();
        }else {
            System.out.println("Oyundan çıkılıyor");
        }

    }
    public static void bilgisayarTahmini(){
        System.out.println("Tahmin etmem için 0 ile 100 arasında bir sayı tutunuz.");
        int a=0;
        int b=100;
        while (true){
            int tahmin = (a+b)/2;
            System.out.println("Tahminim yüksekse (+) \n "+
                    "Tahminim düşüksek (-) \n "+
                    "Tahminim doğruysa (=) \n"+
                    "Giriniz.");

            System.out.println("Tahminim : "+tahmin);
            String cevap=input.next();

            if(cevap.equals("+")){
                b=tahmin;
            }else if(cevap.equals("-")){
                a=tahmin;
            }else if(cevap.equals("=")){
                System.out.println("Doğru tahmin ettin tebrikler");
                System.out.println("Yeni oyun oynamak istermisin? (E/H)");
                String yeniOyun=input.next();
                if(yeniOyun.equals("e")){
                    menu();
                }else {
                    break;
                }
            }
            tahminSayisi++;
        }
    }
    public static void oyuncuTahmini(){
        int tahminEdilecekSayi=(int)Math.random()*100;
        System.out.println(tahminEdilecekSayi);
        System.out.println("Oyuncu tahmini");
        while ((true)){
                int oyuncuTahmini=input.nextInt();
                if()
        }*/
    }

