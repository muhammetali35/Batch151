package QuestionBankApexQuestions;

public class IfStatement02 {
    public static void main(String[] args) {
        /*
        2) Type code to print
 a) "Valid Password" if the password has at least 8 characters different from space
 character
 b) "Do not use space character in password" if the password has any space
 character in any position
 c) "Invalid Password" if a and b conditions are not satisfied
 Note: Be careful about the orders of conditions in the solution
         */

        String password="muhammet 123??";
        boolean charNumber=password.replaceAll(" ","").length()>8;
        boolean space=password.contains(" ");

        if(charNumber && space){
            System.out.println("Valid password");
        }else {
            System.out.println("İnvalid password");
        }






    }
}
