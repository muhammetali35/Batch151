package day04scannerwrapperoperators;

public class TekrarWrapperClass {
    public static void main(String[] args) {


        byte b = 12;
        Byte bWrapper= 12;
        Byte maxDeger = bWrapper.MAX_VALUE;
        System.out.println("maxDeger = " + maxDeger);

        //Autoboxing
        int i= 13;
        Integer iWrapper= i;
        System.out.println("iWrapper = " + iWrapper);

        //Unboxing

        Integer k= 20;
        int k1= k;
        System.out.println("k1 = " + k1);

        boolean isStudent= false;
        Boolean isStWrapper= isStudent;

        System.out.println("isStWrapper = " + isStWrapper);
        System.out.println("isStudent = " + isStudent);

    }
}
