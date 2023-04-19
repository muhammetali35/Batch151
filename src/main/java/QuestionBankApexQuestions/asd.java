package QuestionBankApexQuestions;

public class asd {
    public static void main(String[] args) {
        String s = "2a3B4?-!5";
        Integer numOfNonDigitChars = s.replaceAll("[0-9]","").length();
        System.out.println("Total number of non-digit characters: " + numOfNonDigitChars);
    }
}
