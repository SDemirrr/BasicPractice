package day7_practice;

public class Q02_MDArray {

    /*
     *  String 2D array olustur
     *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
     *  String de $ varsa 3.2 ile carp
     *  String de € varsa 4.2 ile carp
     *  elemanlarin toplamini double olarak yazdir
     */
    public static void main(String[] args) {



    String arr[][]= {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};
    double toplam=0;

        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                if (arr[i][j].contains("$")){
                    toplam+=Double.parseDouble(arr[i][j].replace("$",""))*3.2;
                    //parantez icindeki replace methodu ile $ isaretinden kurtulduk sonra elimizde "12" var
                    //double topalm variable ile isleme katmak icin data casting yaptik Double.parseDouble() methd kullandik
                    //"12" double 12 oldu
                } else {
                    toplam+=Double.parseDouble(arr[i][j].replace("€",""))*4.2;

                }


            }

        }
        System.out.println(toplam);
}}
