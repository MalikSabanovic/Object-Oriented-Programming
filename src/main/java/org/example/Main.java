package org.example;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void printText(){
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
    public static void draw(int rows){
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void draw2(int rows){
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void draw3(int rows){
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    //a

    public static void main(String[] args) {
        /*Task 1.*/

        /*Scanner sc = new Scanner(System.in);
        String password = "";

        while (!password.equals("1234")) {
            System.out.print("Enter password: ");
            password = sc.nextLine();

            if (password.equals("1234")) {
                System.out.println("Right!");
                System.out.println("Secret message is: gg!");
            } else {
                System.out.print("Incorrect, enter the password again: ");
            }
        }*/

        /*Task 2.*/

        /*Scanner sc = new Scanner(System.in);
        System.out.print("First Number: ");
        int firstNumber = Integer.parseInt(sc.nextLine());
        System.out.print("Second Number: ");
        int secondNumber = Integer.parseInt(sc.nextLine());
        System.out.print("Third Number: ");
        int thirdNumber = Integer.parseInt(sc.nextLine());
        int sum = firstNumber + secondNumber + thirdNumber;
        System.out.println("The sum is: " + sum);*/

        /*Task 3.*/

        /*Scanner sc = new Scanner(System.in);
        int number;
        int sum = 0;

        while(true) {
            System.out.print("Enter a number: ");
            number=Integer.parseInt(sc.nextLine());

            if(number==0) {
                break;
            }else {
                sum+=number;
            }
        }
        System.out.println("The sum of the numbers is: "+sum);*/

        /*Task 4*/

        /*Scanner sc = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        int firstNumber = Integer.parseInt(sc.nextLine());

        System.out.print("Enter the last number: ");
        int lastNumber = Integer.parseInt(sc.nextLine());

        System.out.println("Numbers between " + firstNumber + " and " + lastNumber + ":");


        if (firstNumber <= lastNumber) {
            int temp = firstNumber;
            while (temp <= lastNumber) {
                System.out.println(temp);
                temp++;
            }
        }
        else {
            int temp = firstNumber;
            while (temp >= lastNumber) {
                System.out.println(temp);
                temp--;
            }
        }*/

        /*Task 5.*/

        /*Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number= Integer.parseInt(sc.nextLine());

        System.out.println("Enter the power: ");
        int power= Integer.parseInt(sc.nextLine());

        int sum=0;
        for(int temp=0; temp<=power; temp++){
            sum +=Math.pow(number,temp);

        }
        System.out.println("The sum of the numbers is: "+sum);*/

        /*Task 6.*/

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times you want to print out the text: ");
        int n=Integer.parseInt(sc.nextLine());

        for(int i=1;i<=n;i++){
            printText();
        }*/

        /*Task 7.*/


        /*Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = Integer.parseInt(sc.nextLine());

        draw(number);*/

        /*Task 8.*/

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = Integer.parseInt(sc.nextLine());

        draw2(number);*/

        /*Task 9.*/

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = Integer.parseInt(sc.nextLine());

        draw3(number);*/

        /*Task 10.*/
        /*
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int targetNumber=rand.nextInt(101);
        int guess=-1;
        int attempts=0;

        while (guess != targetNumber){

            attempts++;

            System.out.print("Enter your guess: ");
            guess = Integer.parseInt(sc.nextLine());

            if (guess < targetNumber) {
                System.out.println("The number is greater.");
            } else if (guess > targetNumber) {
                System.out.println("The number is lower.");
            } else {
                System.out.println("Congratulations, your guess is correct!");
                System.out.println("It took you " + attempts + " guesses.");
            }

        }*/


    }


}
