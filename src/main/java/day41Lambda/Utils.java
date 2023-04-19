package day41Lambda;

public class Utils { //Sık kullanılanlar demek
    public static int getSquare(int a){
        return a*a;
    }

    public static boolean isOdd(int a){
        return a%2!=0;
    }
    public static int getSumOfDigits(int a){
        int sum = 0;
        while(a>0){
            sum = sum + a%10;
            a = a/10;
        }
        return sum;
    }

    public static int karesiniAl(String s){
        return s.length() * s.length();
    }

    public static boolean ciftMi(String s){
        return s.length()%2==0;
    }

    public static boolean tekMi(String s){
        return s.length()%2!=0;
    }

    public static boolean tekMi(int s){
        return s%2!=0;
    }

    public static boolean ciftMi(int s){
        return s%2==0;
    }

}
