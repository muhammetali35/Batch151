package karisiksorular;

import java.util.Scanner;

public class TasKagitMakas {


        public static void main(String args[]) {

            //0-taş //1-kağıt //2-makas
            //3 yapan kazanır


            Scanner inp = new Scanner(System.in);

            int bilgisayarKazandi = 0;
            int kullaniciKazandi = 0;

            while(bilgisayarKazandi<3 && kullaniciKazandi<3){ //3 yapan kazanır
                System.out.println("Taş,Kağıt,Makas ?"); //Kullanıcıdan değer alınıyor. //o,1,2 dışı kontrlleri siz eklersiniz
                int kullanici = inp.nextInt(); //kullanıcıdan alınan değer kullanici değişkenine atandı
                int bilgisayar = (int)(Math.random()*3); //bilgisiyar 0,1,2 random değer oluşturuyor


                System.out.print("Bilgisayar :"); //Bilgisayarın değeri yazdırılıyor
                switch (bilgisayar)
                {
                    case 0: System.out.println("Taş."); break;
                    case 1: System.out.println("Kağıt."); break;
                    case 2: System.out.println("Makas.");
                }

                System.out.print("Kullanıcı :"); //kullanıcı değeri
                switch (kullanici)
                {
                    case 0: System.out.println("Taş"); break;
                    case 1: System.out.println("Kağıt"); break;
                    case 2: System.out.println("Makas ");
                }

                if(kullanici==bilgisayar){
                    System.out.println("Berabere");

                } else{
                    if((kullanici==0 && bilgisayar ==2) || (kullanici==1 && bilgisayar ==0) || (kullanici==2 && bilgisayar ==1)){
                        System.out.println("Bu eli kullanıcı kazandı");
                        kullaniciKazandi++;
                    }else{
                        System.out.println("Bu eli bilgisayar kazandı");
                        bilgisayarKazandi++;
                    }
                }

                System.out.println("Kullanıcı : "+kullaniciKazandi+" - "+ "Bilgisayar : "+bilgisayarKazandi);

            }



            System.out.println(kullaniciKazandi==3 ? "KULLANICI KAZANDI":"BİLGİSAYAR KAZANDI");

        }

    }


