package com.company;
import java.util.Scanner;
import java.util.Random;
public class rock_paper_scissor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        int counter = 0;
        int userWinscount = 0;
        int computerWinsCount = 0;

        System.out.println("0 for Rock");
        System.out.println("1 for Scissor");
        System.out.println("2 for Paper");


        while (counter < 5) {

            System.out.println("Enter the number for Rock, scissor or Paper");
            System.out.println("----------------------------------------------");
            System.out.print("User Choice: ");
            int userinput = sc.nextInt();
            System.out.println("----------------------------------------------");


            System.out.println("----------------------------------------------");
            int computerInput = ran.nextInt(3);
            System.out.println("Computer Choice: " + computerInput);
            System.out.println("----------------------------------------------");


            if (userinput == computerInput) {
                System.out.println("***********************************************");
                System.out.println("RESULT: DRAW");
                System.out.println("***********************************************");
            }
            else if (userinput == 0 && computerInput == 1 || userinput == 1 && computerInput == 2 || userinput == 2 && computerInput == 0)
            {
                System.out.println("***********************************************");
                System.out.println("RESULT: USER WON");
                System.out.println("***********************************************");
                userWinscount++;
            }
            else {
                System.out.println("***********************************************");
                System.out.println("RESULT: COMPUTER WON");
                System.out.println("***********************************************");
                computerWinsCount++;
            }
            counter++;

        }
        if (userWinscount > computerWinsCount) {
            System.out.println("***********************************************");
            System.out.println("FINAL WINNER: USER");
            System.out.println("***********************************************");
        }
        else if (userWinscount == computerWinsCount)
        {
            System.out.println("***********************************************");
            System.out.println("RESULT IS DRAWN");
            System.out.println("***********************************************");
        }
        else
        {
            System.out.println("***********************************************");
            System.out.println("FINAL WINNER: COMPUTER");
            System.out.println("***********************************************");
        }

    }
}