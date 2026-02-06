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
		 System.out.println("Guess the number between (1-100):");
		 while(attempt < MaxAttempts) {
			 System.out.println("Enter ur guess");
		   int guess = scn.nextInt();
		   attempt++;
		 if(guess == number) {
			 System.out.println("=u guessed correctly" + attempt + "attempts");
			 break;
		 } else if (guess < number){
			 System.out.println("it was a big number myann:");
		 } else {
			 System.out.println("it is small number bro:");
		 }
		 System.out.println("there are the chances still." + (MaxAttempts - attempt));
	 }
		 if(attempt == MaxAttempts) {
			 System.out.println("correct number is :" + number);
		 }

	        System.out.println(" well played !");
	        scn.close();
 }
 }
