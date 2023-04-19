package day_11_practice;

public class C02_Static {
     /*

    okulIsmi, okulNo, okulAcikMi seklinde uc tane static variable olusturalım.
    Bu static variable'leri main icerisinde yazdıralım

*/

    static String okulIsmi="Yıldız Koleji";
    static int okulNo;
    static boolean okulAcikMi; //boolean default değeri "false"dur.

    public static void main(String[] args) {
        //static variable'lara class içerisindeki tüm methodlardan direkt ulaşabiliriz.

        C02_Static obj1=new C02_Static();

        System.out.println(okulIsmi);//==aynı şey System.out.println(obj1.okulIsmi); //Yıldız Koleji
        System.out.println(okulNo);//0
        System.out.println(okulAcikMi);//false

        // static variable'lar gokteki ay gibidir
        // static variable'ın degeri bir kisi tarafından degistirilirse, herkes icin degisiklige ugrar
        okulNo=102;
        System.out.println(okulNo);//102

       staticMethod();//200
        System.out.println(okulNo);//200

    }//main

    private static void staticMethod(){
        okulNo=200;
     System.out.println(okulNo);//200

    }


}
