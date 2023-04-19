package day04scannerwrapperoperators;

public class WrapperClass {
    public static void main(String[] args) {
     // primitive: char  -    boolean   -   byte -      short -      int    -    long -  float - double
     // Wrapper: Character- Boolean-     Byte       -  Short-   Integer-      Long -  Float-  Double

     // Wrapper Class lar non primitive dir. o yüzden memory de çok yer kaplarlar.
     // o yüzden şart değilse wrapper class kullanmayı tercih etmiyoruz.
     // böyle bir imkanın varlığından da haberdar olmalıyız.

        //"n" yazıp nokta koyarsanız hiç method göremezsiniz. Çünkü primitive ler method içermez.
     int n= 12;

        //"m" yazıp nokta koyarsanız birçok method görürsünüz. Çünkü wrapper classlar method içerir.
     Integer m=12;

     byte p=13;

     Byte r=13;// Wrapper class da method var

        //Örnek 1: short data type'ının min ve max değerlerini kod yazarak bulun

        short maxShort = Short.MAX_VALUE;
        System.out.println("maxShort = " + maxShort);
        short minShort = Short.MIN_VALUE;
        System.out.println("minShort = " + minShort);

        //Ornek2: int data type nın min değeri ile byte data type nın max değerinin toplamını bulunuz.

        int minInt= Integer.MIN_VALUE;
        System.out.println("minInt = " + minInt);

        byte maxByte= Byte.MAX_VALUE;
        System.out.println("maxByte = " + maxByte);

        System.out.println("minInt+maxByte = " + minInt + maxByte);

        //Ornek 3: i) Primitive int'i wrapper Integer'a çeviriniz.
        int num= 13;
        Integer wrapperNum= num;

        //ii) Wrapper Byte'i primitive byte'a çeviriniz.
        Byte k=33;
        byte primitiveK= k;
        //Ornek 4: i)primitive char ı Wrapper Character e çeviriniz.(Autoboxing)

        char initial= 'l';
        Character initialWrapper= initial;

                // ii) Wrapper boolean primitive boolean a cevriniz(Unboxing)

        Boolean isOld =true;//boolean data kullanıldığında kullanılır. isOld, isYoung, isExpensive vs
        boolean isOldPrimitive = isOld;









    }
}
