package practices;

public class Q04_Hipotenus {
    //Hipotenüs hesaplayan bir kod yazınız
    public static void main(String[] args) {

        System.out.println(hipotenusHesapla(5,12)+5);
        // double sonuc= hipotenusHesapla(5,12);
       // System.out.println(sonuc);
    }

    public static double hipotenusHesapla(double dikkenar1, double dikkenar2){

        double hipotenus= Math.sqrt(dikkenar1*dikkenar1+dikkenar2*dikkenar2);
        return hipotenus;

    }
}
