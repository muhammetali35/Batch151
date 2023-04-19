package day18constructorsstatickeyword;

import java.time.LocalDate;

public class StaticNonStaticBlocks01 {
    /*
    1)"static block"lar "static variable" lara "ilk değerlerini atamak" (initialize) için kullanılır
    2)"static" bir variable'a değer atamak için kod yazmanız gerekirse "static block" kullanınız.
    3)"static" bir variable'a değer atamak için yazılması gereken kod main method içine de yazılabilir.
      "static block" içine yazılan kod "main method" dan önce çalıştırılır
     4) Bir class'da birden fazla static block varsa üstteki kod çalıştırılır.
     */

    //Static variable'lar static block kullanmadan da (initialize) edilebilirler.
    public static double pi=3.14;

    //Static variable'lar static block kullanarak da (initialize) edilebilirler.
    //Aşağıdaki gibi "static" bir variable'a değer atamak için kod yazmanız gerekirse "static block" kullanınız.
    public static double price;

    static {
        System.out.println("Hey I am a static block 1");
        LocalDate d= LocalDate.now();
        if(d.getMonthValue()==3){

            price=1000;
        }else {
            price=1200;
        }
    }
    static {
        System.out.println("Hey I am a static block 2");
    }
    public static void main(String[] args) {
        System.out.println("Hey I am a main method");
        LocalDate d= LocalDate.now();
        if(d.getMonthValue()==3){

            price=1000;
        }else {
            price=1200;
        }
    }
    }




