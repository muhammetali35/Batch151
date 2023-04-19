package QA5_TeamExercises;

public class C03_Ternary {
    public static void main(String[] args) {



        String pwd="123456789";

        String result = (pwd.replaceAll("[ ]", "").length() > 7) ? "Gçerli parola" : "Geçersiz parola";
        System.out.println(result);

    }
}
