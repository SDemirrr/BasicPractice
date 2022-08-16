package ODEV;

import java.util.Arrays;

public class teamSoru03 {
    public static void main(String[] args) {
        // Verilen 3 elemanlı bir array'in tum elemanlarını
        // bir sonraki konuma taşısayacak bir program yaziniz.

        int arr[]={1,2,3};
        int temp=arr[arr.length-1];

        for (int i = arr.length-1; i >0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0]=temp;
        System.out.println(Arrays.toString(arr));


    }
}
