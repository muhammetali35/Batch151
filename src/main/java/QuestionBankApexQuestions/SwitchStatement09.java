package QuestionBankApexQuestions;

public class SwitchStatement09 {
    /*
    8) Create an Enum and put the browser names in it like CHROME, SAFARI, IE, FIREFOX,
YANDEX. Use switch statement and print ‘I am using CHROME’ for CHROME, 'I am using
SAFARI’ for SAFARI, 'I am using IE for IE', 'I am using FIREFOX for FIREFOX', and 'I am using
YANDEX’ for YANDEX, 'Not valid browser' for browsers different from CHROME, SAFARI, IE,
FIREFOX, YANDEX.
Note: You should create enum on developer console
     */
    public enum Browseers {
        CROME, SAFARI,IE,FIREFOX,YANDEX
    }

    public static void main(String[] args) {

        String browser=Browseers.SAFARI.toString();

        switch(browser){
            case "CROME":
                System.out.println("I'm using CROME");
                break;
            case "SAFARI":
                System.out.println("I'm using SAFARI");
                break;
            case "IE":
                System.out.println("I'm using IE");
                break;
            case "FIREFOX":
                System.out.println("I'm useing FIREFOX");
                break;
            case "YANDEX":
                System.out.println("I'm useing YANDEX");
                break;
            default:
                System.out.println("I'm not using browser");



        }


        

    }
}
