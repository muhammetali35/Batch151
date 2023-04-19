package day18constructorsstatickeyword;

public class MethodOverloading {
    /*
    1) Bir method aynı isim ve farklı parametelerle oluşturulursa buna "method overloading" denir.
    2)"Method ovweloading" Java da "iyi organizasyon" için önemlidir.
    3) Method ovweloading yaparken 3 şekilde değiştirilebilir.
        i) Parametrelerin sayıları değiştirlilebilir.
        ii)Parametrelerin data type'larını değiştirelibiriz.
        iii))Parametrelerin data typeları farklı ise yerlerini değiştirelibiriz.
    4)"Method Overloading" bir class'in icinde olusur bu yuzden "private" method'lar da overload edilebilir.
      "Method Overloading" butun access modifier'larda kullanilabilir.
    5)"static" methodlar overload ediledbilir
    */

    public static void main(String[] args) {

        add(3,5);




    }
    public static int add(int a,int b){
        return a+b;
    }
    public static int add(int a,int b,int c){
        return a+b+c;
    }
    public static double add(double a,int b){
        return a+b;
    }
    public static double add(int a,double b){
        return a+b;
    }



}
