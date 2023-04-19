package QuestionBankApexQuestions;

public class Loops04 {
    /*
    4) Type code to print the unique digits in an integer.
     Example; 223878 ⇒ 37
     */
    public static void main(String[] args) {

        //1.Way for
        /*int num=223878;
        String s=String.valueOf(num);
        String d="";

        for (int i=s.length()-1; i>-1; i--) {
            String c=s.substring(i,i+1);

            if(s.indexOf(c)==s.lastIndexOf(c)){
                d+=c;
            }
        }
        System.out.println(d);*/

        //2.Way while

       /* int num=223878;

        String s=String.valueOf(num);
        String d="";

        int i=s.length()-1;
        while (i>-1){
            String c=s.substring(i,i+1);
            if(s.indexOf(c)==s.lastIndexOf(c)){
                d+=c;


            }


        i--;
        }
        System.out.println(d);
*/

        //3.Way do while

        int num=223878;

        String s=String.valueOf(num);
        String d="";
        int i=s.length()-1;
        do {
            String c=s.substring(i,i+1);
            if(s.indexOf(c)==s.lastIndexOf(c)){
                d+=c;

            }

            i--;

        }while (i>-1);
        System.out.println(d);




    }
}
