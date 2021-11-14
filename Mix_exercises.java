package com.company;

import java.util.Scanner;

public class Mix_exercises {
    public static void main(String[] args) {

        // Q.1: Multiplication Table
        int a = 7;
        for (int i = 1; i <=10; i++){
            System.out.printf("%d X %d = %d \n",a,i,a*i);
        }

        // Q2. Switch Case to print the days of the week

        System.out.println("Write the number for days of the week..1 for Monday and so on");
        Scanner sc = new Scanner(System.in);
        int weekdays = sc.nextInt();

        switch (weekdays) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 7:
                System.out.println("Saturday");
                break;

            case 8:
                System.out.println("Sunday");
                break;
        }

        // Q.3 To find the Sum of first 5 even numbers

        int i = 0;
        int n = 5;
        int sum = 0;

        while (i<n){
            sum += 2 * i;
            i++;
        }
        System.out.println("The sum of the first 5 even numbers are " + sum);

    }

}
