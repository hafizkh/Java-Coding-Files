import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class memory_game {
    public static void main(String[] args) {

        /* Question: Write the code for examining the memory of user to remember the random generated numbers by the system
        and after five seconds, the numbers will scroll down. Then user need to write the numbers shown earlier and system
        checks if the numbers are correct or not

         */

            System.out.println("Try to remember the numbers in 5 seconds");
            System.out.println();

            Scanner sc = new Scanner(System.in);
            Random ran = new Random();

            int[] randonNumber = new int[7];

            for (int i = 0; i < 7; i++) {
                randonNumber[i] = ran.nextInt(5) + 1;
            }


            for (int b = 0; b < randonNumber.length; b++) {

                System.out.print(randonNumber[b]);
            }

            // To scroll down page after five seconds

            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            for (int j = 0; j < 20; ++j) {
                System.out.println();
            }
            String[] myAnswers = new String[7];

            System.out.println("Type those 7 numbers");

            for (int a = 0; a < myAnswers.length; a++) {
                System.out.print((a + 1) + ". number:  ");
                myAnswers[a] = sc.nextLine();
            }

            System.out.println("Your Answers: ");
            System.out.println(myAnswers[0] + myAnswers[1] + myAnswers[2] + myAnswers[3] + myAnswers[4] + myAnswers[5] + myAnswers[6]);

            for (int j = 0; j < 7; j++) {
                int h = j + 1;
                System.out.println("For numbers " + h);
                compare(randonNumber[j], myAnswers[j]);
            }
        }

    static void compare (int l , String m){
            int userstring = Integer.parseInt(m);
            if (l == userstring) {
                System.out.println("Guess is right");

            } else {
                System.out.println("Guess is not right");
            }
        }
    }

