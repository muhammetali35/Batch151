package QA5_TeamExercises;

public class BasamaklarıBulma {
    public static void main(String[] args) {
        int a= 12345;

        int birler= a%10;
        System.out.println("birler :"+birler);

        int onlar=(a/10)%10;
        System.out.println("onlar :"+onlar);

        int yuzler=(a/100)%10;
        System.out.println("yuzler :"+yuzler);

        int binler=(a/1000)%10;
        System.out.println("binler :"+binler);



    }
}
