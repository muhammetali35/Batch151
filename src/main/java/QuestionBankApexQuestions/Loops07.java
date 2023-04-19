package QuestionBankApexQuestions;

public class Loops07 {
    /*
    7) Type code to create multiplication table like
3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
     */

    public static void main(String[] args) {
        //1.Way for
        /*int n=3;
        for(int i = 1; i <11; i++) {
            System.out.println(n+" x "+ i+ " = "+ n*i);
        }*/

        //2.Way while

        /*int n=3;
        int i=1;
        while (i<11){

            System.out.println(n+" x "+ i+ " = "+ n*i);

        i++;
        }*/

        //3.Way do while
        int n=3;

        int i=1;
        do {
            System.out.println(n+" x "+ i+ " = "+ n*i);
            i++;
        }while (i<11);




    }
}
