package ZMirac_Hoca;

import java.util.Arrays;

public class Q02 {

    public static void main(String[] args) {

        /*

Bir array , integer bir "k" değeri ve eşik değeri olarakda integer "thereshold" değeri verilecek, "k" boyutunda
ve elemanlarının ortalaması eşik değerinden büyük veya ona eşit olan kaç adet alt-dizilerin olduğunu ve
bu alt dizileri ekrana yazdıran bir metod oluşturunuz.
Not: yeni oluşacak elemanlar, ilk diziden seçilirken arka arkaya sıralı gelmeli.

Örnek :

Input: arr = [2,2,2,2,5,5,5,8], k = 3, threshold(eşik) = 4
Output: 3

 */

        int[] arr={2,2,2,2,5,5,5,8};
        int k=3;
        int  threshould=4;

        System.out.println(nunOfSubArrays(arr, k, threshould));

    }

    public static int nunOfSubArrays(int[] arr,int k,int threshould){

        int[] arr2=new int[k];
        int sum=0;
        int count=0;

        for (int i = 0; i <arr.length ; i++) {
            if (i==arr.length-(k-1))
                break;
            System.arraycopy(arr,i,arr2,0,k);
            /*
            for (int j = 0; j < k; j++) {
             arr2[j] = arr[i + j];
             */

            for (int j = 0; j <k ; j++) {
                sum+=arr2[j];
                
            }

            if (sum>=threshould*k){
                count++;
               System.out.println(Arrays.toString(arr2));
            }
            sum=0;

        }
        return count;
    }
}
