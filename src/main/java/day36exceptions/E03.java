package day36exceptions;

public class E03 {
    /*
    "throws" ile "throw" arasındaki farklar nelerdir?
    1)"throws" method signature satırında kullanılır, "throw" ise method body içinde  kullanılır.
    2) "throws" method signature satırında bir veya birden fazla Exception ile bir kere kullanılır.
       "throw" ise method body içinde bir tane "Exception" ile tekrar tekrar kullanılabilir.
    3)"throws" dan sonra sadece Exception Class isimleri yazilir,
       "throw" dan sonra ise Exception Class'dan object olusturulur.
     */
    public static void main(String[] args) {
        printAge(23);
    try {
        printAge(-23);
    }catch (IllegalArgumentException e) {
        System.out.println("Negative ages are not valid");
    }

        printAge(-9);

    }
    //Example 1: Kullanıcıdan alınan yaşı console'a yazdıran method'u oluşturunuz.
    public static void printAge(int age){
        if(age<0){
            throw new IllegalArgumentException("Used negative integers for ages");

        }
        System.out.println(age);
    }
}
