package com.LickingHeights;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

	Scanner keyboard;
	int weight, feet, inches;

	keyboard = new Scanner(System.in);

	System.out.println("What is your weight?");
	weight = keyboard.nextInt();

	System.out.println("What is your height(only feet)?");
	feet = keyboard.nextInt();

	System.out.println("What is your height(only inches)?");
	inches = keyboard.nextInt();

	
    }
}
