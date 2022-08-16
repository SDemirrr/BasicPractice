package day11_interviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q05 {
    public static void main(String[] args) {


        int[] arr = {12, 23, 45, 67};

        System.out.println("arrTopla(arr) = " + arrTopla(arr));
        System.out.println("varargsTopla = " + varargsTopla(1, 2, 3, 4, 5));
        System.out.println("varargsToplaList(1,2,3,4,5) = " + varargsToplaList(1, 2, 3, 4, 5));

    }

    private static List varargsToplaList(int i, int i1, int i2, int i3, int i4) {

        List<Integer> list=new ArrayList<>();
        list.add(i1);
        list.add(i2);
        list.add(i3);
        list.add(i4);
        int toplam=0;

        for (int w:list) {
            toplam+=w;
        }
        return Collections.singletonList(toplam);

    }


    private static int varargsTopla(int... i) {
        int toplam=0;
        for (int each:i) {
            System.out.println();
            toplam+=each;
        }
        return toplam;

    }

    private static int arrTopla(int[] arr) {
        int toplam=0;
        for (int each:arr) {
            System.out.println();
            toplam+=each;
        }
        return toplam;
    }


}
