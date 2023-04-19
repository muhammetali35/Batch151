package QuestionBankApexQuestions;

public class IfStatement08 {
    public static void main(String[] args) {
        /*
        8) Type code to check the format of state abbreviations in the USA
 a) Your code should print "State abbreviations cannot have more than 2 characters" if the
abbreviation has more than 2 characters
 b) Your code should print "State abbreviations cannot have lowercase characters" if the
abbreviation has lowercase characters
 c) Your code should print "State abbreviations cannot have characters different from
letters" if the abbreviation has characters different from letters.
 Note: If the abbreviation has more than 1 error all related error messages should be printed.
For example; for "fl3" your code should print, "State abbreviations cannot have more than
2 characters", "State abbreviations cannot have lowercase characters", and "State abbreviations
cannot have characters different from letters"
         */

        String abb="La1";

        if(abb.length()>2){
            System.out.println("State abbreviations cannot have more than 2 characters");
        }if(abb.replaceAll("[^a-z]","").length()!=0) {
            System.out.println("State abbreviations cannot have lowercase characters");
        }if(abb.replaceAll("[^a-zA-Z]","").length()!=0){
            System.out.println("State abbreviations cannot have characters different from letters");

        }
    }
}
