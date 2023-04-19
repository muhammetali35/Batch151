package karisikSorular2;

public class PassByValue02 {
    /*
    Veerilen bir fiyat  için %10,%20 ve %25 indirim yapan un method oluşturun.
    -Method'da indirim uygulayıp fiyatı main method'da yazdırın
     -Methodları arkaya arkaya çağırıp doğruluklarını kontrol edin.
      */
    public static void main(String[] args) {
        int fiyat=100;

        System.out.println(fiyat);
        System.out.println(indirim10(fiyat));
        System.out.println(indirim20(fiyat));
        System.out.println(indirim25(fiyat));

    }

    public static double indirim10(double fiyat){
        fiyat=fiyat*0.90;
        return fiyat;
    }

    public static double indirim20(double fiyat){
        fiyat=fiyat*0.80;
        return fiyat;
    }
    public static double indirim25(double fiyat){
        fiyat=fiyat*0.75;
        return fiyat;
    }
}

