package practices;

public class Ascii2 {
    // CEM isminin icerisinde bulunan harfleri kullanmadan yazdırınız
    /* ASCİİ

          B ==> 66           C ==> 67
          D ==> 68           E ==> 69
          L ==> 76           M ==> 77

        */
    public static void main(String[] args) {

        char ilkKarakter='B'+1;//C
        char ikinciKarakter='D'+1;//E
        char ucuncuKarakter='L'+1;//M



        System.out.println(""+ilkKarakter+ikinciKarakter+ucuncuKarakter);


    }
}
