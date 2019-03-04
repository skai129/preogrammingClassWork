package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
	    //get first number from user
        int number1;
        while(true) {
            System.out.println("Enter a number");
            try {
                number1 = Integer.valueOf(console.nextLine());
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Bad input.");
                continue;
            }
        }
        //get second number from user
        int number2;
        while(true) {
            System.out.println("Enter a number");
            try {
                number2 = Integer.valueOf(console.nextLine());
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Bad input.");
                continue;
            }
        }
        //find prime numbers between first two numbers
        //put smaller of the inputs into smallerNum
        int smallerNum = 0;
        int largerNum = 0;
        if (number1 <= number2){
            smallerNum = number1;
            largerNum = number2;
        }
        else if (number1 > number2){
            smallerNum = number2;
            largerNum = number1;
        }
        int i = smallerNum;
        if (smallerNum < 2){
            i = 2;
        }
        while (i <= largerNum){
            //check to see if i is prime
            boolean Prime = true;
            int num = 2;
            while (num < i){
                if(i%num==0){
                    Prime = false;
                }
                num++;
            }
            //if i is prime, print i
            if(Prime){
                System.out.println(i);
            }
            i++;
        }
    }
}
