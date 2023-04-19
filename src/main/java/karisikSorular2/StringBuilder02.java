package karisikSorular2;

public class StringBuilder02 {
    /*
    For Loop ile 1000 defa bir işlem yapalım. Öncesinde ve sonrasında zamanı kontrol
    edip StringBuilder ve String class'larının performanslarını karşılaştıralım.
     */


    public static void main(String[] args) {

        long timeS = System.nanoTime();
        String str = "ali can";
        for (int i = 0; i < 1000; i++) {
            System.out.println(i + str);
        }
        long timeS1 = System.nanoTime();
        System.out.println(timeS1-timeS);//133283200

        long timeS2 = System.nanoTime();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            System.out.println( i+s.toString());
        }

        long timeS3 = System.nanoTime();
        System.out.println(timeS3-timeS2);//10072700
    }

}
