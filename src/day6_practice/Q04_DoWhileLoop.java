package day6_practice;

import java.util.Scanner;

public class Q04_DoWhileLoop {
     /*
		Ask user to enter a word. If the word has odd number of characters
		 and has 3 or more characters,
		 print the character in the middle of the word.
		 the word has even number of character print "You entered wrong word."
		     INPUT      :   celik
		     OUTPUT 	:   l
		     INPUT      :   elif
		     OUTPUT 	:   You entered wrong word.

		     Kullanıcıdan bir kelime girmesini isteyin. Kelimenin tek sayıda karakteri varsa
ve 3 veya daha fazla karaktere sahip,
karakteri kelimenin ortasına yazdırın.
kelime çift sayıda karakter baskısına sahip "Yanlış kelime girdiniz."
*/

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String str=scan.nextLine();
        int uzunnluk=str.length();

      while (uzunnluk>0){
          if (uzunnluk%2==1&&uzunnluk>=3){
              System.out.println(str.substring((uzunnluk / 2), uzunnluk / 2 + 1));
              break;
          }else {
              System.out.println("Yanlis kelime girdiniz");
              break;
          }

      }
    }
}
