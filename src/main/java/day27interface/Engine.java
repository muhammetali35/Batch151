package day27interface;

  /*                İNTERFACE'DEKİ METHODLAR
    1)"interface" içine "concrete method" konulmaz
    2)"interface" içindeki methodların abstract olduğunu Java bilir,
    bu yüzden "interface" içindeki "abstract method"larda "abstract"
    keyword kullanmaya gerek yoktur.
    3)"interface" içindeki methodların tamamı "public"dir.
      Bu yüzden "interface" içinde abstract method oluştururken "acces modifier "
      yazmaya gerek yoktur.
     4)Bir "interface"i bir "class"ın parent'ı yapmak istediğinizde "extends" keyword yerine
     "implements" keyword kullanılır.
     5)"Concrete Child Class" lar "parent interface"deki "abstract method"ları override etmek zorundadırlar.
     6)"interface"ler bir applicationda "Concrete Child Class" ların yapmak zorunda oldukları
     fonksiyonları barındırırlar. Bu yüzden "interface"lere "to-do list"de denir.
     7)Birden fazla "parent interface" içinde aynı isimli abstract methodlar oluşturabiliriz.
     abstract methodların body'si olmadığı için child class"lar aynı isimli method'lardan  herhangi birini
     override ederek kullanabilirler.
     8)Birden fazla "parent ineterface" içinde aynı isimli abstract methodlar oluşturduğunuzda bu method'ların
     "return type"ları aynı olmak zorundadır.
     9)Normalde "interface" içine "concrete method" konulmaz ama bazı özel durumlarda "concrete method"
     koymamız gerekirse
             i)"default" keyword'unu aşağıdaki gibi kullanarak "interface" içine "concrete method" koyabiliriz.
             default void eco(){ System.out.println("Uses gas less...");}
             ii)"static" keyword'unu aşağıdaki gibi kullanarak "interface" içine "concrete method" koyabiliriz.
             static void stop(){ System.out.println("Stops securely...");}

     10)default veya static keyword'unu kullanarak oluşturduğunuz "concrete method"ların
     "concrete child class"lar tarafından kullanılma zorunluluğu yoktur.
     11)"default" keyword'unu kullanrak oluşturduğunuz "concrete method"lara ulaşmak için "object"
     oluşturarak ulaşılabilir.
     "static" keyword'unu kullanarak oluşturduğunuz "concrete method"lara ulaşmak için "object" oluşturmaya
     gerek yoktur.
     12)"interface"lerden "object" oluşturulamaz. Çünkü bunun içinde yarım methodlar vardır.
     "interface"lerin "constructor"ı yoktur.
     **abstract class ile interface farkları  meşhur interview sorusudur.

     */

public interface Engine {

     void start();
     void payment();

     default void eco(){
          System.out.println("Uses gas less...");
     }
     static void stop(){
          System.out.println("Stops securely...");
     }


}
