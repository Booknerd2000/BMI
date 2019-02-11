package com.LickingHeights;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

	Scanner keyboard;
	double weight, feet, inches;

	keyboard = new Scanner(System.in);

	System.out.println("What is your weight?");
	weight = keyboard.nextInt();

	System.out.println("What is your height(only feet)?");
	feet = keyboard.nextInt();

	System.out.println("What is your height(only inches)?");
	inches = keyboard.nextInt();
	    inches = (feet*12+inches);

	System.out.println((weight*703)/(inches*inches));
	
    }
}
