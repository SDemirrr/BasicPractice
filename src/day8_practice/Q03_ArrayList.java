package day8_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q03_ArrayList {
    public static void main(String[] args) {
        /*
     * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
     * not kisa metodlar kullamayiniz
     * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
     */
    int[]arr={1,2,3,8,4,5,6,7,8};
    int n=2;

        List<Integer>list=new ArrayList<Integer>();
        for (int each:arr) {
            list.add(each);
        }

        List<Integer>maxList=new ArrayList<Integer>();
        int count=1;
        int max=list.get(0);

        while (count<=n){
            for (int i = 0; i <list.size() ; i++) {
                if (list.get(i)>max&&!(maxList.contains(list.get(i)))){
                    max=list.get(i);
                }
            }
            maxList.add(max);
            list.remove(list.indexOf(max));//tekrar ayni sayiya bakmamasi icin kaldirdik
            count++;
        }
        System.out.println("Arrayin max "+n+" elemani : "+maxList);


}
}
