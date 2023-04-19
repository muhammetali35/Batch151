package day22stringbuilder;

public class Sbf01 {
    /*

    1)StringBuffer Java'da String üreten bir Class'dır.
    2)StringBuffer, StringBuilder'a çok benzer, yani ikisi de "mutable" String üretir.
    3)StringBuffer "multi-thread"(çoklu iş) dir ama StringBuilder "multi-thread " değildir.
    4)Java StringBuffer'i ,StringBuilder'dan önce oluşturuldu.
    5)StringBuilder multi-thread" olmadığı için StringBuffer'dan daha önce çalışır.
    6) multi-thread yapılırken yapılan işlerin sıralaması önem arz eder.
       ,yapılan işleri mantıklı bir sıraya koymak "synchronization" olarak adlandırılır.
        StringBuffer "multi-thread" olduğu için aynı zamanda "synchronized" dir.
    3 tane String oluşturan Class öğrendik.Hangisini ne zaman kullanacağız?
      1)immutable string lazımsa ; String Class
      2)mutable string lazaımsa ; StringBuilder veya StringBuffer
                                  i)StringBuilder'i multi-thread gerekmezse kullanırız
                                  ii)StringBuffer'i multi-thread gerekirse kullanırız.


     */

    public static void main(String[] args) {
        StringBuffer sbf1=new StringBuffer("Java");

    }
}
