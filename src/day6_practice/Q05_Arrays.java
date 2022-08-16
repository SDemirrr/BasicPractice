package day6_practice;

public class Q05_Arrays {
    	/*
        given an int array and find the squares of the elements
        (Verilen bir int dizisi icin elemanlarin karelerini bulun )
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */
        public static void main(String[] args) {
            int arr[] = {2, 6, 4, 5, 8, 9};
            int arrSonEleman=arr[arr.length-1];
            int arrbasi=arr[0];


            for (int i = 0; i < arr.length; i++) {
                if (arrbasi==arr[i]) {
                    System.out.print("{");
                }
                else if (arr[i]!=arrSonEleman){
                   System.out.print((arr[i]*arr[i])+",");
               }else {
                   System.out.print((arr[i]*arr[i])+"}");
               }
            }


        }
}
