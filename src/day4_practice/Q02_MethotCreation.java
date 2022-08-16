package day4_practice;

public class Q02_MethotCreation {
  static  double cm=100;

    public static void main(String[] args) {
          /*
     cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
      */


       double donusum= donustur(cm);



    }

    public static double donustur(double cm) {

        double metreDonustur=cm*100;
        double kmDonustur=cm*10000;


return metreDonustur;}
}
