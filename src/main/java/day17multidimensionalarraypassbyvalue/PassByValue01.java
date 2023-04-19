package day17multidimensionalarraypassbyvalue;

public class PassByValue01 {
    public static void main(String[] args) {

        /*
        Method oluşturmak için aşağıda ki beş adımı takip ediniz
        1)Acces Modifier
        2)Return Type
        3)Method İsmi
        4)Method Parantezi
        5){} Method Body

        Note:Main method'un içindeki tüm method'lar static olmalıdır.
        Bir method'u static yapmak için "access modifier" ile return arasına "static" yapmalıyız.

        Pass by Value:
        1)Java "Pass by Value" kullanır.
        2)Yani; Java methodların orjinal değerini değiştirmesine müsaade etmez
        3)Java method'lara değer yollarken orjinal değerin kopyasını oluşturur ve o kopyayı method'a yollar.
        Method kopya değer üzerinde değişiklik yapar, böylece orijinal değer korunmuş olur.
        4)Java esnek bir dildir. İstersek yazdığımız kod ile orjinal değerin değişmesinide temin edebilir.
        Bakınız line 28

        Pass by reference

        1-pass by reference da methoda reference yollanir
        2-reference adres demektir. adres yolaninca method adresi kullanarak orijinal degere ulasir
        ve orijinal degeri degistirir.
        bu yuzden c# gibi pass by reference kullanan yazilim dillerinde method
        variable nin orijinal  degerini degistirir.
         */
        int shirtPrice=200;

        System.out.println(discount("student",shirtPrice));
        shirtPrice=discount("veteran",shirtPrice);
        System.out.println(shirtPrice);

        System.out.println(shirtPrice);//orijinaldeğeri değiştirebiliriz

    }

    //Discount Method'u oluşturunuz
    public static int discount(String type,int price){
        switch (type){//3 ve 3 ten fazla seçenek varsa switch () genelde kullanılır
            case "student":
                price=price-20;
                break;
            case "veteran":
                price=price-40;
                break;
            case "senior":
                price=price-30;
                break;
            default:
                price=price;

        }
        return price;



    }



}
