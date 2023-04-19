package day28interface;

public interface Animal {

     void eat();

     void drink();

     //1)interface'lerdeki tüm variable'lar otomatik olarak "final"dir.
     // Bu yüzden interface içindeki variable'i oluşturduğunuzda mutlaka değer ataması yapmalısınız.
     // Bilindiği gibi final variable'ların değerleri değiştirilemez.
     //2)interface'lerdeki tüm variable'lar otomatik olarak"public"dir.
     //3)interface'lerdeki tüm variable'lar otomatik olarak"public"dir.

     int age=4;



}
