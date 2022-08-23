package day15_lambda_practice;

import java.util.*;
import java.util.stream.Collectors;

public class Lamda01 {
/*
    reduce()-->azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir.
    kullanımı yaygındır pratiktir.
    Bir Stream içerisindeki verilerin teker teker işlenmesidir. Teker teker işleme sürecinde, bir önceki adımda elde edilen sonuç
    bir sonraki adıma girdi olarak sunulmaktadır. Bu sayede yığılmlı bir hesaplama süreci elde edilmiş olmaktadır.
    reduce metodu ilk parametrede identity değeri, ikinci parametrede ise BinaryOperator türünden bir obj kullanılır.
    reduce işleminde bir önceki hesaplanmış değer ile sıradaki değer bir işleme tabi tutulmaktadır.
    İşleme başlarken bir önceki değer olmadığı için bu değer identity parametresinde tanımlanmaktadır.

 */

   static ArrayList<String> name = new ArrayList<>(Arrays.asList("Tulay","Zekeriya","Hasan","Ismail","Osman","Fatih","Ersin","Mevlut"));
   static List<Integer >numbers = new ArrayList<>(Arrays.asList(25,65,-56,55,-89,65,55,21,54,9,35,35,34));

    /* TASK :

     * Input olarak verilen listteki isimlerden
     * icinde 'a' harfi bulunanlari silen bir code create ediniz.
     *
     * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
     * OUTPUT : [Veli,Omer]
     */

    public static void aHarfleriniSilGerisiniYazdir(ArrayList<String>name){
      //1.yol
        // System.out.println(name.stream()//akisa alindi
        //        .map(m -> m.toLowerCase()).//hepsi kucuk harfe cevrildi
         //       filter(m -> !m.contains("a"))//a harfi olmayanlar filtrelendi
         //       .collect(Collectors.toList()));//liste atildi

        //2.yol
        name.removeIf(t->t.contains("a")||t.contains("A"));
        System.out.println(name);
    }

    //en buyyk elemani bulun
    public static void enBuyukSayiyiBul(List<Integer>name){

      int sayi1= numbers.stream().sorted(Comparator.reverseOrder()).findFirst().get();
        System.out.println("1. yol : "+sayi1);

        Integer sayi2 =numbers.stream().reduce(Math::max).get();
        System.out.println("2. yol : "+sayi2);


    }

    // Task : List'teki tum elemanlarin toplamini yazdiriniz.

    public static void tumElemanlarinToplami(List<Integer>numbers){

      Integer toplam1= numbers.stream().reduce(0,(a,b)->a+b);
        System.out.println(toplam1);

       int toplam2= numbers.stream().reduce(Integer::sum).get();
        System.out.println(toplam2);

    }

    // Task : List'teki cift elemanlarin carpimini  yazdiriniz.
    public static void ciftElemanlarinCarpimi(List<Integer>numbers){
        //method reference ile
        Integer carpim1= numbers.stream().
                filter(Methodlarim::ciftElemaniBul).//method ref. kullanildi
                reduce(Math::multiplyExact).get();
        System.out.println(carpim1);



      //lambda expression ile
        Integer carpim2= numbers.stream().
                filter(Methodlarim::ciftElemaniBul).
                reduce(1,(a,b)->a*b);//lambda exp. kullanildi
        System.out.println(carpim2);

    }

    //okul projesinde listele vb lambda expression ile yapiniz







}
