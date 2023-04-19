package day28interface;


/*
        1)Child     Parent
          Class --> Class: extends
          interface--> interface :extends
          Class--> interface :implements
          interface -->Class: olamaz!!!
          Aynı ise extends, farklı ise implements kullan.
          interface'i Class'ın child'ı yapma olmaz


  Abstract Class ile interface arasındaki farklar nelerdir?
  Method ilgili olarak farklar
    *i)Abstract Class'lar hem "abstract" hemde "concrete" method'lar içerebilir,
      fakat interface'ler sadece "abstract" method içerir.
      Ama interface'lerde istersek "default" ve "static" keyword'lerini kullanarak "concrete" method üretebiliriz.
    *ii)Abstract Class'lar multiple inheritance"i desteklemez ama interface'ler destekler.
Variable'larla alakalı*iii)Abstract Class'lar içinde her türlü variable oluşturabilir, interface'ler içindeki variable'lara public, static ve final olmak zorundadir.
    iv)İnterface Class'ın child'i olamaz ama "abstract class" class'in child'i olabilir.
     v)Abstract Class'larda constructor vardır ama object üretemez, interface'lerde constructor yoktur bu yüzden object üretilemez.




 */
public interface Mammal extends Animal {

    String feedBaby="Milk";
    int age=6;



}
