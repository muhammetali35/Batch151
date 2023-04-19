package day17multidimensionalarraypassbyvalue;

public class PassByValue01tekrar {
    public static void main(String[] args) {

        int shirtPrice=200;

        System.out.println("Price for student: "+discount("student",shirtPrice));
        System.out.println("Price for veteran: "+discount("veteran",shirtPrice));
        System.out.println("Price for senior: "+discount("senior",shirtPrice));

        shirtPrice=discount("student",shirtPrice);
        System.out.println("shirtPrice orjinalinin değişmiş hali: "+shirtPrice);


    }


    public static int discount(String type, int price) {

        switch(type){
            case "student":
                price=price-20;
                break;
            case "senior":
                price=price-10;
                break;
            case "veteran":
                price=price-30;
                break;
            default:
                price=price;

        }
        return price;




    }
}
