package day18constructorsstatickeyword;

/*
1)Constructor nasıl oluşturulur ?
    Access Modifier +Class İsmi + () +{}
    2) Method ile Constructor ile arasındaki farklar nelerdir.//    İNTERVİEW SORUSU
        i) Methotlarda return type olur Constructor'larda olmaz.//En önemli fark
        ii)Methodlar yaptıkları işe göre isimlendirilirler,Örnek çarpmayap, toplamsor.Constructorlar iser "Class İsmi" ile isimlendirilirler.
        iii)"Method"lar bir aksiyon yapmak için oluşturlurlar, Constructor'lar ise object oluşturmak içindirler.
        iv)"Method" isimleri kucuk harfle baslar, "Constructor" isimleri class ismi ile ayni oldugu icin buyuk harfle baslar.
   3)Parametreli Constructor'lar olusturarak ayni class'dan farkli ozelliklere sahip object'ler olusturabiliriz.
 */

public class Car {
    String make= "Honda";
    String model="Accord";
    int year=2021;
    int price=18000;

    //Default constructor
    //Default constructor' lar parametre kullanmazlar
    //Default constructor'ların body'si boştur.
    //Java kıskançtır.Siz "default constructor"ı elle yazdığınızda
    //Java Object Class içindeki default constructor'ı kullandırmaz.

    public  Car(){

    }

    //Custom Constructor

    public Car(String make, String model, int year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }


    //Custom Constructor


    public Car(String make) {
        this.make = make;
    }
}
