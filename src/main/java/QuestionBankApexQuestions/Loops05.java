package QuestionBankApexQuestions;

public class Loops05 {
    /*
    Type code to draw the following image by using a for loop.
A A A A A
A A A A A
A A A A A

     */
    public static void main(String[] args) {

        //1.Way for
   /* int satir=3;
    int sutun=5;

    for(int i=1; i<=satir; i++) {
        String s="";
        for (int j=1; j<=sutun; j++) {
            s=s+"A";
        }
        System.out.println(s);
    }*/

        //2.Way while

       /* int satir=3;
        int sutun=5;

        int i=1;
        while (i<=satir) {
            String s="";
            for (int j = 1; j <=sutun ; j++) {
                s=s+"A";

            }
        i++;
            System.out.println(s);
        }*/

        //3.Way do while
        int satir=3;
        int sutun=5;


        int i=1;
        do {
            String s="";
            for (int k=1; k<=sutun; k++){
                s=s+"A";


            }

            System.out.println(s);
            i++;
        }while (i<=satir);





    }
}
