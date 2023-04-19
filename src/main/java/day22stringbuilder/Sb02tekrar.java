package day22stringbuilder;

public class Sb02tekrar {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Java is easy");
        System.out.println(sb1);//Java is easy

        sb1.reverse();
        System.out.println(sb1);//ysae si avaJ

        sb1.delete(4,7);
        System.out.println(sb1);//ysae avaJ

        sb1.replace(2,5,"X");
        System.out.println(sb1);//ysXavaJ

        sb1.insert(3,2023);
        System.out.println(sb1);//ysX2023avaJ

        StringBuilder sb2 = new StringBuilder("Java");
        StringBuilder sb3 = new StringBuilder("Java");

        int r1=sb2.compareTo(sb3);
        System.out.println(r1); //Sonuç 0 ise alfabetik olarak aynı sıradalar demektir.
                                // Sonuç mesela -3 ise sb1, sb3 den alfabetik olarak 3 önde demektir.
                                // Sonuç mesela +3 ise sb1, sb3 den alfabetik olarak 3 sonra demektir

        //StringBuilder nasıl String'e çevrilir?
        String str=sb1.toString().toUpperCase();
        System.out.println(str);//YSX2023AVAJ

        //String nasıl StringBuilder'e çevrilir?
        StringBuilder newSb1=new StringBuilder(str);
        System.out.println(newSb1);//YSX2023AVAJ





    }
}
