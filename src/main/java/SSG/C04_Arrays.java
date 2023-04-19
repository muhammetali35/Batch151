package SSG;

public class C04_Arrays {
    public static void main(String[] args) {
        /*
        verilen bir int array'indeki en buyuk sayıyı yazdıran bir method oluşturun.
         */

        int arr[]= {10,7,8,32,12,14,2,1,0};

        enBuyukSayi(arr);

    }

    public static void enBuyukSayi(int[] arr) {
      int enBuyuk =arr[0];
    for(int i=0;i<arr.length-1;i++) {
      /*      if(arr[i]>enBuyuk){
              enBuyuk=arr[i];
          }
      }*/
        enBuyuk = Math.max(enBuyuk, arr[i]);
    }
        System.out.println("En büyük:"+ enBuyuk);
    }
}
