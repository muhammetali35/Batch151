package karisiksorular;


import java.util.Scanner;

public class burcBelirlemeSorusu {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String name=input.nextLine();

        System.out.println(" Lütfen doğduğunuz ayın numarasını yazınız.");
        byte month= input.nextByte();

        System.out.println("Lütfen doğduğunuz günün numarasını giriniz.");
        byte day= input.nextByte();

        String sing="";
        String errorMsg="Hatalı giriş yaptınız lütfen tekrar deneyiniz.";
        boolean isError=false;

        switch (month){
            case 1: if(day>=1 && day<=31){//ocak 31
                if (day<=21){
                    sing="Oğlak";
                }else {
                    sing="Kova";

                }

            }else {
                isError=true;
                errorMsg="Ocak ayında böyle birgün bulunamadı.";
            }
            break;
            case 2:  if(day>=1 && day<=29){//şubat 29
                if (day<=19){
                    sing="Kova";
                }else {
                    sing="Balık";

                }

            }else {
                isError=true;
            }
                break;
            case 3:  if(day>=1 && day<=31){//mart 31
                if (day<=20){
                    sing="Balık";
                }else {
                    sing="Koç";

                }

            }else {
                isError=true;
            }
                break;
            case 4:  if(day>=1 && day<=30){//nisan30
                if (day<=19){
                    sing="Koç";
                }else {
                    sing="Boğa";

                }

                }else {
                isError=true;
            }
                break;
            case 5:  if(day>=1 && day<=31){//mayıs31
                if (day<=20){
                    sing="Boğa";
                }else {
                    sing="İkizler";

                }

            }else {
                isError=true;
            }
                break;
            case 6:  if(day>=1 && day<=30){//haziran30
                if (day<=21){
                    sing="İkizler";
                }else {
                    sing="Yengeç";

                }

            }else {
                isError=true;
            }
                break;
            case 7:  if(day>=1 && day<=31){//temmuz31
                if (day<=21){
                    sing="Yengeç";
                }else {
                    sing="Aslan";

                }

            }else {
                isError=true;
            }
                break;
            case 8:  if(day>=1 && day<=31){//ağustos31
                if (day<=21){
                    sing="Aslan";
                }else {
                    sing="Başak";

                }

            }else {
                isError=true;
            }
                break;
            case 9:  if(day>=1 && day<=30){//eylül30
                if (day<=21){
                    sing="Başak";
                }else {
                    sing="Terazi";

                }

            }else {
                isError=true;
            }
                break;
            case 10:  if(day>=1 && day<=31){//ekim31
                if (day<=21){
                    sing="Terazi";
                }else {
                    sing="Akrep";

                }

            }else {
                isError=true;
            }
                break;
            case 11:  if(day>=1 && day<=30){//kasım30
                if (day<=20){
                    sing="Akrep";
                }else {
                    sing="Yay";

                }

            }else {
                isError=true;
            }
                break;
            case 12:  if(day>=1 && day<=31){//aralık31
                if (day<=20){
                    sing="Yay";
                }else {
                    sing="Oğlak";

                }

            }else {
                isError=true;
            }
            default:
                isError=true;


        }
        if(isError){
            System.out.println(errorMsg);

        }else {
            System.out.println("Merhaba Sayın "+name+ " burcunuz "+sing);
        }


    }
}
