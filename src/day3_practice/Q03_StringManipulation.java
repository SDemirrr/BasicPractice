package day3_practice;

public class Q03_StringManipulation {
    public static void main(String[] args) {

           /*
		name1 ve name2 degiskenlerini olusturun.
		name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
		name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirin.
		          e.g:
		         name1= mehmet
		         name2= ahmet
		         Print ==> mehahmetmet
		*/

        String name1="11111111";
        String name2="2222";

        String name1IlkYarisi=name1.substring(0,(name1.length())/2);
        String name1IkinciYarisi=name1.substring((name1.length())/2);

        if (name1.length()%2==0){

            System.out.println(name1IlkYarisi.concat(name2).concat(name1IkinciYarisi));

        }else System.out.println("name1 cift sayili olmadigi icin ortasina yerlestiremedik");





    }
}
