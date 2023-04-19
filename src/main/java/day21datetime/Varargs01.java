package day21datetime;

public class Varargs01 {
    public static void main(String[] args) {

        System.out.println(add(5,2,4,3));//14
        System.out.println(add(5,2));//7
        System.out.println(add(5));//5
        System.out.println(add());//0

        getInitials("Ali Can","Kemal Han","Muhammet Yılmaz");

    }

    //Example 1: Toplama işlemi yapan bir method oluştur?
    //Aşağıdaki gibi farklı method'lar oluşturarak iş yapamayız.
    //Çünkü kullanıcı farklı sayıdaki sayıları toplamak isteyebilir, her ihtimal için bir method oluşturmak mümkün değildir.


    /*public int add(int a, int b){
        return a+b;


    }

    public int add(int a, int b, int c){
        return a+b+c;

    }
    public int add(int a, int b, int c,int d){
        return a+b+c+d;

    }
*/
    //Java farklı sayıdaki parametrelrin hepsini kabul eden bir yapı oluşturdu.
    //Bu yapıya "Varargs" denir.
    //"Varargs" arkada "Array" yapısını kullanır

    /*
    1) Bir method'un içine birden fazla "Varargs" koyulamaz
    2)Bir method parantezi'nde bir'den fazla parametre kullanılacaksa "Varargs" en sonda olmalıdır.
     */
    public static int add(int ... a){

        int sum = 0;

        for (int w: a){
            sum =sum+ w;
        }
        return sum;


    }

    //Example 2: Verilen isimlerin ilk harflerini console'a yazdıran method'u oluşturunuz
    // Ali Can ==> AC

    public static void getInitials(String... s) {
        String initials = "";

        for (String w : s) {
            initials = initials + w.charAt(0) + w.split(" ")[1].charAt(0);
            System.out.println(initials);
            initials="";

        }
    }
}
