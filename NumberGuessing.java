package project;

import java.util.Scanner;
import java.util.Random;
    public class NumberGuessing {
	 public static void main(String[] args) {
		 Scanner scn = new Scanner (System.in);
		 Random a = new Random();
		 int number = a.nextInt(100) + 1;
		 int attempt = 0;
		 int MaxAttempts = 5;
		 System.out.println("Dammuntey number guess chey ra (1-100):");
		 while(attempt < MaxAttempts) {
			 System.out.println("Enter chey ne guess");
		   int guess = scn.nextInt();
		   attempt++;
		 if(guess == number) {
			 System.out.println("correct guess chesav kada ra" + attempt + "attempts");
			 break;
		 } else if (guess < number){
			 System.out.println("peddha number ra pawan kalyan:");
		 } else {
			 System.out.println("chinna number ra allu arjun:");
		 }
		 System.out.println("inka unnay le chance luu..." + (MaxAttempts - attempt));
	 }
		 if(attempt == MaxAttempts) {
			 System.out.println("correct number is :" + number);
		 }

	        System.out.println(" baga adav  anukuntunav entraa !");
	        scn.close();
 }
 }