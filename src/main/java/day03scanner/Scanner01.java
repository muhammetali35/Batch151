package day03scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        //1.adım : Scanner class tan bir obje oluştur
        Scanner input= new Scanner(System.in);
        //obje ismini input yaptık çunku bu obje kullanıcıdan alınan datayı benim kodlarımın içine koyacak

        //2.adım Kullanıcıya ne istediğinize dair mesaj veriniz
        System.out.println("Lutfen yaşınızı giriniz...");

        //3.adım Uygun method'u kullanarak kullanıcının verdiği data'yı memory'e yerleştiriniz
        byte age= input.nextByte();
        System.out.println(age);


    }

}
