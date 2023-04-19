package practices;

public class MaymunAlivetekrar {

       /* INTERWIEW SORUSU

    Adada yalnız bir maymun var
    Her gün 4 muz yemesi gerekiyor
    o adada sadece 165 muz var
    Maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.

*/
       public static void main(String[] args) {


    int numberOfBananas=165;
    int yasadigiGun=1;
    boolean alive=true;

    do {
            numberOfBananas-=4;
        System.out.println("Kalan muz sayısı: "+ numberOfBananas);
            yasadigiGun++;
        if(numberOfBananas<4){
            System.out.println("maymun"+yasadigiGun+" yaşar ve ölür.");
            alive= false;
        }else {
            System.out.println("Buğün "+ yasadigiGun+". ve maymun yaşıyor.");
        }

            }while (alive);



       }
}
