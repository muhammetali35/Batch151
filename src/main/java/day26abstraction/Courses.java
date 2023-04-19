package day26abstraction;

 /*
    1) Bazen parent class'daki method'un body'si hiçbir child class tarafından kullanılmaz.
    Bu durumda paret'daki method'a body yazmak hiç kullanılmadığı için mantıklı değildir.
    Biz de o method' a body yazmayız.
    2)Body'si yazilmayan method'a "Abstract Method" denir.
      Abstract Ingilizce'de "vucutsuz" veya "soyut" anlamindadir.
    3)Method'un body'sini yazmayinca Java hata verir, biz de "abstract"
      keyword'unu kullanarak Java'ya bu emthod'un body'si olmayacak deriz.
    4)"abstract" keyword'unu kullaninca elde ettigimiz abstract method
      normal class'lara konulamaz, o yuzden class'i da "abstract" yapariz.
    5) Parent'taki method abstract ise butun child class'lar o method'u override etmek zorundadır.
        Bu yüzden tüm child'lar için mecburi olması istediğiniz fonksiyonlari
        abstract yapmak mantıklı bir seçimdir.
    6)Body'si olan method'lar (Concrete Method) abstract class'ların içine yazılabilir.
    abstract method'lar concrete class'ların içine yazılamazlar.
     7)"abstract" keyword ile "method body" bir method'da aynı anda kullanılmazlar.
     8) abstract class'ların içinde abstract method'lar olur. Abstract method'lar body'si olmadığından
     "eksik method" lar gibi duşunulabilir.
     Yani abstract class'lar içinde eksik bir yapı barındırır, siz abstract class'dan
     object üretirseniz abstract class içindeki eksiklik object'e yansır ve object eksiği olan bir object olmuş olur.
      Java bunu istemez çünkü eksik obje eksik iş yapar.
      Yanlış çalışmasına sebep olur
      Java aplicationu korumak için abstract classlardan obje üretilmesini engellemiştir
      9) "abstract class" ların constructor'ı vardır ama object oluştuamazlar.

     */
        /*
        "final" keyword'u açıklarmısınız ?
         "final" keyword i)Variable'larda ii) method'larda iii) class'larda kullanılır.

         i)variable'larda kullannıldığında a) O variable'a kesinlikle değer ataması yapılmalıdır.
                                           b) İlk atanan değer değiştirilemez.

         ii)Methot'larda kullanıldığında a)O method'un body'si değiştirilemez.
                                         b)O method override edilemez.
         iii)Class'larda kullanıldığında a) O class'ın child class'ı olamaz ama final class'ın kendisi child olabilir.

         10) "final method" lar "abstract" olamazlar.
         11) "private method"lar "abstract" olamazlar.
         12) Abstract Class'in  abstract child veya concrete child'i olabilir.




         */


public abstract class Courses  {
    public abstract void math();

    public void art(){
        System.out.println("Learn art");
    }


}
