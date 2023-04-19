package day35exceptions;

public class E03 {
    /*
    1)try block'dan sonra çoklu catch block kullanılabilir.
        catch block'lar arasında parent-child ilişkisi yoksa catch block'lar istenildiği gibi sıralanabilir.
        catch block'lar arsında parent-child ilişkisi varsa child üstte olmalıdır.

    2)"Exception Class" tum Exception'ların parent'idir.
       Çoklu catch block' kullanmak yerine sizden istenen fonksiyonu karşıladığı sürece
       tek catch block'ı "Exception Class" ile kullanabilirsiniz.

     3)"try + 1 catch" olur - "try + cok catch" olur - "try" tek basina kullanilamaz

      "try" catch block olmadan kullanilabilir mi?
      "try + finally" olabilir.
     */
    public static void main(String[] args) {
        System.out.println(convertStringToIntDivideByLength1("6"));
        System.out.println(convertStringToIntDivideByLength2("6"));
        System.out.println(convertStringToIntDivideByLength3("6"));
    }

    //Bir String'i integer'a çeviren ve bu integer'i String'in length'inin 1 eksiğine bölen method'u oluşturunuz.
    public static int convertStringToIntDivideByLength1(String str) {
        int  result=0;

        try {
            int a = Integer.valueOf(str);
             result = a / (str.length() - 1);

        } catch (NumberFormatException e) {

            System.out.println("Non-digit character cannot be used in valueOf");

        } catch (ArithmeticException e) {

            System.out.println(e.getMessage());
        }

        return result;
    }

    public static int convertStringToIntDivideByLength2(String str) {
        int  result=0;

        try {
            int a = Integer.valueOf(str);
            result = a / (str.length() - 1);

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
        return result;
    }
    public static int convertStringToIntDivideByLength3(String str) {
        int  result=0;

        try {
            int a = Integer.valueOf(str);
            result = a / (str.length() - 1);

        }catch (ArithmeticException e) {
            System.out.println("Jump");
        }
        catch (Exception e) {

            System.out.println(e.getMessage());
        }
        return result;
    }
}
