package QuestionBankApexQuestions;

public class Loops03 {
    /*
    3) Bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız. Bir String, tersi ile
aynıysa, buna palindrom denir. Örneğin; “anna”, “123321” palindromlardır
     */

    public static void main(String[] args) {
        //1.Way for

      /*  String s="runnur";
        String sTers="";

        for(int i=s.length()-1 ; i>-1; i--) {
            String c=s.substring(i,i+1);
            sTers=sTers+c;

        }
        if(s.equals(sTers)) {
            System.out.println("Palidromdur.");
        }
        else {
            System.out.println("Palidrom değildir.");
        }*/

        //2.Yol while
/*
        String s="runnur";
        String sTers="";

        int i=s.length()-1;
        while (i>-1) {

            String c=s.substring(i,i+1);

            sTers+=c;

            i--;
        }
        if(s.equals(sTers)){
            System.out.println("Palidrom");
        }else {
            System.out.println("Palidrom değil");
        }*/

        //3.Way

        String s="runnur";
        String sTers="";

        int i=s.length()-1;
        do {
            String c=s.substring(i,i+1);
            sTers+=c;
            i--;

        }while (i>-1);

        if(s.equals(sTers)){
            System.out.println("Palidrom");
        }else {
            System.out.println("Palidrom değil");
        }




    }
}
