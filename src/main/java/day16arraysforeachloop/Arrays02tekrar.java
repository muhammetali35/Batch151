package day16arraysforeachloop;

import java.util.Scanner;

public class Arrays02tekrar {
    //+,-,*,/,% işlemleri yapabilen bir hesap makinesi yapınız.
    //Kullanıcı "q" ya basmadığı surece işlem seçip dursun
        /*
        1)Kullanıcıdan data almak için Scanner object oluştur.
        2)Kullanıcıdan yapacağı işlemi almalıyız.
        3)Kullanıcıdan iki tane sayi almalıyız.
        4)Tekrar tekrar işlem yapabilmek için loop kullanmalıyım
         */
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Merhaba Hesap Makinesine Hoşgeldiniz");
        System.out.println("Çıkmak için q' ya basınız");
        char opr=' ';


        do{

            System.out.println("+,-,*,/,% işlemlerinden hangisini yapmak istersiniz? ");
             opr=input.next().charAt(0);
            if(opr=='q' || opr=='Q'){
                System.out.println("Görüşmek üzere");
                break;
            }



            boolean bl= opr=='+' || opr=='-' || opr=='*' ||opr=='/' ||opr=='%';
            if(!bl){
                System.out.println("Yanlış bir değer girdiniz ");
                break;
            }
                System.out.println("Birinci sayıyı giriniz: ");
                int num1= input.nextInt();

                System.out.println("İkinci sayıyı giriniz: ");
                int num2= input.nextInt();


                switch (opr){
                    case '+':
                        System.out.println(num1+" + "+num2+" = "+(num1+num2));
                        break;
                    case '-':
                        System.out.println(num1+" - "+num2+" = "+(num1-num2));
                        break;
                    case '*':
                        System.out.println(num1+" x "+num2+" = "+(num1*num2));
                        break;
                    case '/':
                        System.out.println(num1+" : "+num2+" = "+(num1/num2));
                        break;
                    case '%':
                        System.out.println(num1+" % "+num2+" = "+(double)(num1*num2)/100);
                        break;

                }

        }while (true);









    }
}
