package engday07ifstatementternarystatement;

public class IfStatementSoru {
    public static void main(String[] args) {

        //Interview questions usa qa

        //Bir Stringdeki tekrarsız karakterleri ekrana yazdırınız.
        //Strimg y= "abbccdc"


        String y="aac"; //c soru cozumu uzamaması için bu şekilde alındı.

        char ch=y.charAt(0);

        if(y.indexOf(ch)==y.lastIndexOf(ch)){
            System.out.println(ch);

        }
        char ch1 =y.charAt(1);
        if (y.indexOf(ch1)==y.lastIndexOf(ch1)){
            System.out.println(ch1);
        }
        char ch2 =y.charAt(2);

        if (y.indexOf(ch2)==y.lastIndexOf(ch2)){
            System.out.println(ch2);

        }
    }
}
