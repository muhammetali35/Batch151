package day23inheritance;

public class Animal {
    /*
    1)eat() methodu'u gibi birçok class'in kullanması gereken method'ları her class'a ayrı ayrı
    yazarsak;
        i)Tekrar yapmis oluruz, tekrar ideal code'da olmamalidir.
        ii)Ayni method'u tekrar tekrar yazmak zaman kaybidir.
        iii)Tekrar tekrar yazilan method'un tamiri cok zaman alir.
        iv)Tekrar tekrar yazilan method'un gelistirilmesi cok zaman alir.
        v)Her class'in icine method'u tekrar tekrar yazmak "atomic yapiya" terstir.
     2)private class member'lar child class'lar tarafından kullanılamaz
       public class  member'lar child class'lar tarafindan kullanilabilir.
       default class  member'lar ayni package'de child class'lar tarafindan kullanilabilir.
       protected class  member'lar farkli package'de de olsalar child class'lar tarafindan kullanilabilir.
     3) Java'da bir Class'ın sadece 1 tane parent'i olabilir.
        Çoklu Parent'a "Multiple İnheritance" derler, tekli parent'a "String İnheritance" denir
        Java "Multiple İnheritance"i desteklemez, Java "String İnheritance" kullanır.
     4) Apartman şeklindeki inheritance yapısına "Multiplevel İnheritance" denir.
        Java "Multiplevel İnheritance"ı destekler.
     */
    protected   void eat(){
        System.out.println("Animals eat...");
    }
    public void drink(){
        System.out.println("Animals drink...");
    }

}
