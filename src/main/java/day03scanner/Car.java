package day03scanner;

public class Car {
    //Variable' lar olusturma
    public String model= "Corolla";
    public int fiyat= 20000;

    //Method'lar olusturalim
    // Note : "return type void " oldugunda method icinde "return" keywordu kullanilmaz
    // eger bir method yeni bir data uretmiyorsa sadece belli bir islem yapiyorsa return type'i void olur.
    public void hakaret(){
        System.out.println("Corolla hizli hareket eder...");

    }
    public void dur(){
        System.out.println("Corollo guvenli bir şekilde durur...");


    }
}
