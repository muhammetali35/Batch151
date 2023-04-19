package karisikSorular2;

import java.util.Arrays;

public class ArraysSorular01 {
    public static void main(String[] args) {

    //Soru 1) Elemanları "Ali", "Veli" ,"Ayşe" ve  "Fatma"   olan bir array oluşturun ve bu array'i yazdırın

        String[] names={"Ali", "Veli","Ayşe", "Fatma"};
        System.out.println(Arrays.toString(names));//[Ali, Veli, Ayşe, Fatma]

    //Soru 2) Yukarıdaki array elemanlarından "Ali" yerine "Can" ve "Ayşe" yerine "Gül" atayın
        names[0]="Can";
        names[2]="Gül";
        System.out.println(Arrays.toString(names));//[Can, Veli, Gül, Fatma]

        //Soru: Verilen 3 elemanlı bir array'in tum elemanlarını bir soldaki konuma taşıyacak
        //bir kod yazın. örnek {1,2,3}==>{2,3,1}

        int [] nums={1,2,3,4};
        int temp= nums[0];
        for(int i=1; i<nums.length; i++) {
            nums[i-1]=nums[i];
        }
        nums[nums.length-1]=temp;
        System.out.println("Değişmiş hali "+Arrays.toString(nums));

        //Soru: Verilen bir array'in tüm elemanlarını toplayan bir kod yazınız.

        int [] nums1={1,2,3,4};

        int toplam=0;

        for(int i=0; i<=nums.length; i++){
            toplam+=i;

        }
        System.out.println("Elemanların toplamı: "+toplam);
        System.out.println();

    //Soru: Aşağıdaki multidimensional Array'in tüm elemanlarının çarpımını ekrana yazdıran kod yazınız

        int number[][]={{2,3}, {4, 5,7}};

        int carpim=1;
        for(int [] w: number){
            for( int k: w){

                carpim*=k;
            }
        }
        System.out.println("Multidimensional Array elemanların çarpımı: "+ carpim);

        //Soru:Aşağıdaki multidimensional array'in iç array'indeki son elemanların çarpımını
        //ekrana yazdıran kod yazınız. {{1,2,3},{4,5},{6}}; ==>3*5*6

        int no[][]= {{1,2,3},{4,5},{6}};

        int product=1;

        for(int i=0; i<no.length; i++ ){
            int[] innerArray=no[i];
            product*=innerArray[innerArray.length-1];
        }
        System.out.println("Son elemanların çarpımı "+product);

    //Soru3:Aşağıdaki multidimensional array'lerinin iç array'lerinde aynı index'e sahip olan
    // elemanların yoplamını yazdıran kod yazınız.(zor soru)

        int arr1 [][]={{1,2},{3,4,5},{6}};
        int arr2 [][]={{7,8,9},{10,11},{12}};

        for(int i=0; i<arr1.length && i<arr2.length ; i++){
            int sum=0;

            //eşleşen indexler için elemanların toplamı
            for(int j=0; j< arr1[i].length && j< arr2[i].length; j++){
                sum+=arr1[i][j]+arr2[i][j];

            }
            System.out.println("Toplam "+sum);
        }

    //Soru:Aşagıdaki multi dimensional array'in iç array'lerindeki tüm elemanların toplamını
    //birer birer bulan ve herbir sonucu yeni bir array'in elemanı yapan ve yeni array'i
    //ekrana yazdıran bir proğram yazınız. {{1,2,3},{4,5},{6,7}} ==> 1+2+3=6 4+5=9 6+7=13 output {6,9,13}


        System.out.println();
//Soru : Kullanıcıdan bir cümle isteyin ve cümledeki kelime sayısını yazdırın

        String sentence="Java öğrenmek çok kolay değil ancak çok eğlencelidir.";

        String words[] =sentence.split(" ");
        System.out.println(words.length);//8
        System.out.println(Arrays.toString(words));//[Java, öğrenmek, çok, kolay, değil, ancak, çok, eğlencelidir.]

//Soru: Verilen bir Array'den istenen değere eşit olan elemanları kaldırıp, kalanları yeni bir
      //  Arrray olarak yazdıran bir method yazınız.















    }
}
