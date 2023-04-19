package QuestionBankApexQuestions;

public class IfStatement03 {
    public static void main(String[] args) {
        /*
        3) Type code to print
 a) "Round up by last digit:" and print the rounded value if the last digit is greater than
 or equal to 5
 b) "Round down by last digit" and print the rounded value if the last digit is less than 5
         */
        int i=125;
        if(i%10>=5){
            System.out.println((i/10+1)*10);
        }else {
            System.out.println((i/10)*10);
        }








    }
}
