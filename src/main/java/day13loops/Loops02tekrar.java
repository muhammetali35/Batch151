package day13loops;

public class Loops02tekrar {
    public static void main(String[] args) {
        //Verilen bir String' de kuçuk harfleri console'a yazmayınız.
        //"Pwd12?Ab" ==>"P12?A"

        String s = "Pwd12?Ab";

        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if (ch > 'a' && ch < 'z' ){
                continue;
            }else {

                System.out.print(ch);
            }

        }

        //"break" ile "continue" arsındaki fark nedir?
        //"break" switch' in dışına çımak için ve loop' u kırmak için kullanılır.
        //"continue" ise loop yaparken bazı elemanları işleme sokmamak için kullanılır.

        System.out.println();

        //Bir String'i ters ceviren kodu yaziniz
        //"Java" ==> "avaJ"

        //1.Way
        String s1= "Java";
        String ters="";

        for (int i = s1.length()-1; i >= 0; i--) {
            ters= ters+s1.substring(i,i+1);
        }
        System.out.println(ters);

        System.out.println();

        //2.Way
        String s2= "Java";
        String ters2="";

        for (int i = s2.length()-1; i >= 0; i--) {
            ters2= ters2+s2.charAt(i);
        }
        System.out.println("2.Way : "+ ters2);


        System.out.println();


        //Bir tamsayının rakamları toplamını veren kodu yazınız.
        //578 ==> 5+7+8=20

        int sayi1=578;
        int sum=0;
        sayi1=Math.abs(sayi1);

        for (int i = sayi1; i > 0; i=i/10) {
            sum=sum+i%10;
        }
        System.out.println("For loop: "+ sum);



    }
}
