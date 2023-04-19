package day02datatypesmethodcreation;

public class MethodCreation01 {
    /*
    Java da method nasıl olusturulur?
    1) main method un dısında olusturulur.
    2) Access Modifier+ Return Type + Method ismi +()+ {}

    Olusturulan methodlar nasıl kullanılır?
    1) main methodun içinden kullanılır.
    2) method un ismi+() yazın
    3) işlem yapacağınız parametreleri parantez içine koyun

     */
    public static void main(String[] args) {

        int sonuc= toplamaYap(3,5);
        System.out.println(sonuc);

        long Carpmasonuc= multiply(4,5);
        System.out.println(Carpmasonuc);

        int ucluSonuc= firstTwoMultiplyThirdAdd(2,3,4);
        System.out.println(ucluSonuc);

        System.out.println(getCube(3));// sepete koymadan böyleda yazılabilir
        //double cubeSonuc= getCube(3);
        //System.out.println(cubeSonuc);

        print("Hello World");
        print("Muhammet yılmaz");


    }


    // Ornek1: toplama işlemi yapan bir methot olusturun
    // main method static olduğu için method da herzaman static olamlıdır.
    public static int toplamaYap(int a, int b){
        return a+b;

    }
    // Ornek2: 2 sayıyı çarpan bir method  yap ve ekrana yazdır
    protected static long multiply(int a, int b) {
        return a*b;

    }
    // Ornek3: Verilen 3 sayidan ilk ikisini carpan ve sonucu üçüncü  sayi ile toplam methodu oluştur
    private static int firstTwoMultiplyThirdAdd(int a, int b, int c){

        return a*b+c;

    }
    // Ornek4: Verilen bir onalık sayının kupunu hesaplayan methodu kullanınız.
    //NOTE: ACCESS MODİFİERİ default yapmak için access modifier yazmayınız!!!
    static double getCube(double a){
        return a*a*a;

    }
    //Ornek5: Girilen bir kelimeyi ekrana yazdiran bir method oluşturup kullanınız

    public static void print(String a){
        System.out.println(a);
    }
        //method un return type'i void ise method body içinde return keyword yazılmaz.
        //eğer bi method yeni bir data üretmiyorsa return type ı void olur.



}
