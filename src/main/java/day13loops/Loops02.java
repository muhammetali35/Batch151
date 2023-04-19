package day13loops;

public class Loops02 {
    public static void main(String[] args) {
        //Verilen bir String' de kuçuk harfleri console'a yazmayınız.
        //"Pwd12?Ab" ==>"P12?A"

        String s= "Pwd12?Ab" ;
        for(int i=0; i<s.length(); i++) {
            char ch=s.charAt(i);
// loop yaparken bazi elemanlari isleme sokmamak icin "continue"kullanilir.
            if(ch>='a' && ch<='z') {
                continue;
            }else{
                System.out.print(ch);
            }
        //"break" ile "continue" arsındaki fark nedir?
        //"break" switch' in dışına çımak için ve loop' u kırmak için kullanılır.
        //"continue" ise loop yaparken bazı elemanları işleme sokmamak için kullanılır.

        }
        System.out.println();

        //Bir String'i ters ceviren kodu yaziniz
        //"Java" ==> "avaJ"

        //1.Way
        String t="Java";
        String ters="";
        for(int i=t.length()-1 ; i>=0; i--) {
            ters= ters+t.substring(i,i+1);
        }
        System.out.println(ters);
        System.out.println("========");
        //2.Way
        String u="Java";
        String ters2="";
        for(int i=u.length()-1 ; i>=0; i--) {
            ters2= ters2+u.charAt(i);
        }
        System.out.println(ters2);
        System.out.println("=================");


        //Bir tamsayının rakamları toplamını veren kodu yazınız.
        //578 ==> 5+7+8=20

        int sum=0;

        int n=-578;

        n=Math.abs(n);//mutlak değer

        for(int i=n; i>0; i=i/10){
        sum=sum+i%10;

        }
        System.out.println("For loop ile rakamların toplamı : "+sum);


        System.out.println("=============================");
        int sayi= 578;

        int sonRakam=sayi%10;//8
        System.out.println("Son rakam: "+sonRakam);
        sayi=sayi/10;//57
        int sondanIkinci=sayi%10;//7
        System.out.println("Sondan ikinci rakam: "+sondanIkinci);
        sayi=sayi/10;//5
        int ilkRakam=sayi%10;//5

        System.out.println("İlk rakam:"+ilkRakam);

        System.out.println(ilkRakam+sondanIkinci+sonRakam);

    }
}
