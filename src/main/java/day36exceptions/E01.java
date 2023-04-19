package day36exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E01 {

        /*
        1)Run Button'una bastıktan sonra console'da alınan Exception'lara "Runtime Exception"denir.
         ArithmeticException, NullPointerException, NumberFormatException, ArrayIndexOutOfBoundsException,
          StringIndexOutOfBoundsException "Runtime Exception" a ornektir.
        "Runtime Exception" lara "Unchecked Exception"da denir.

        2)Code yazarken kirmizi alt cizgi seklinde alinan Exception'lar da vardir, bunlara "Compile Time Exception" denir.
          FileNotFoundException, IOException "Compile Time Exception" a ornektir.
          "Compile Time Exception"lara "Cheched Exception"da denir.

        3) FileNotFoundException: Java'ya bir dosyayı bul dediğimizde, Java dosyanın adresi ve dosyanın varlığı konusunda
                                  hata oluşursa ne yapması gerekitğini söylemenizi ister.

        4)IOException:'IO' Input demektir.
                     Note:IOException, FileNotFoundException'in parent'ıdır.

        5) Java da hatalar temelde 2'ye ayrılır.
           i)Exception'lar(Handle edilebilir) ii)Error'lar(Handle edilemezler) a) StackOverflowError b)Out Of Memory Error c)Virtual Machine Error d)

         */

    public static void main(String[] args) throws IOException {

        FileInputStream fis= new FileInputStream("src/main/java/day36exceptions/TextFile");

        int i=0;

        while ((i= fis.read())!=-1){

            System.out.print((char)i);

        }



    }
}
