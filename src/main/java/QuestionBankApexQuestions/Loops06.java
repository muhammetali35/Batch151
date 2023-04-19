package QuestionBankApexQuestions;

public class Loops06 {
    /*
    Type code to draw the following image by using a for loop.
            A
            A A
            A A A
            A A A A
     */

    public static void main(String[] args) {

        // 1.Way for
       /* for(int i=1; i<5; i++) {

            for(int j=1; j<=i; j++) {
                System.out.print("A ");
            }
            System.out.println();
        }*/

        // 2.Way while

      /*  int i=1;
        while (i<=4){

            for(int j=1; j<=i; j++) {
                System.out.print("A ");
            }
            System.out.println();

            i++;
        }*/

        //3.Way do while

        int i=1;
        do {
            for(int j=1; j<=i; j++) {
                System.out.print("A ");
            }
            System.out.println();
            i++;
        }while (i<5);








    }

}
