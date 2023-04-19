package day24inheritancepolymorphism;

/*
    1) Inheritance'da object oluştururken constructor'lar yukarıdan (Parent)
        aşağıya (Child) doğru çalışır.
    2) Parent ve Super eş anlamlıdır. Child ve Sub eş anlamlıdır.
    3)Super() her constructer'in ilk satırında gorünmez olarak bulunur.
      İsterseniz görünür şekilde de yazabilirsiniz.
    4)super() sizi parent class'daki conructor'a taşır.
    5)this() sizi aynı class içindeki conructor'lar arasında gezdirir.
    6) this içinde bulunduğunuz class'daki variable'ları çağırmaya yarar.
      "super" parent class'daki variable'ları çağırmaya yarar.
      7) eğer data type'ları arasında "İS-A" ve "HAS-A" ilişkisi varsa bu data type'larına "COVARIANT" denir.
 */

/*
    1)Polymorphism ==> Çoklu şekil
      Yani bir method'un farklı şekillerde karşımıza çıkması demektir.
      Polymorphism = Overloading(+) + Overriding(-)
    2) Overridding parent class daki methodu chil class ın ihtiyaçlarına göre özelleştirerek kullnmak demektir.
    3)Overriding'de method' un body'sini değiştiriyoruz.
    4)Overriding'de method signature' a dokunulmaz. Dokunursanız Java kızar.



 */

public class Car {

    public void move(){
        System.out.println("Cars move...");
    }
    public void getBreak(){
        System.out.println("Cars break...");
    }
    public void engine(){
        System.out.println("Cars have engine...");
    }

    public String model="Car";
    public  int price=0;

    public Car(){
        System.out.println("Car constructor 1");
    }

    public Car(int i){
        this();
        System.out.println("Car constructor 2");
    }
}
