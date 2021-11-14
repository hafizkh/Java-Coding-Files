import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
To guess the random number by the user within the range of 1000 and print the history of attempted numbers at the end of console
 */

public class small_game {

    public static void main(String[] args) {

        ArrayList<Integer> randomNumber = new ArrayList<>();

        Random ran = new Random();
        int b = ran.nextInt(1000);

        Scanner sc = new Scanner(System.in);
        // Applying the loop
        while(true){
            System.out.println("Enter the Number");
            int a = sc.nextInt();
            if (b == a){
                System.out.println("You won");
                System.out.println("-------------------");
                System.out.println("The Computer generated Random Number was: "+ b);
                System.out.println("-------------------");
                break;
            }
            else if(b > a){
                System.out.println("Enter the greater");
                System.out.println("-------------------");
            }
            else {
                System.out.println("Enter the Smaller");
                System.out.println("-------------------");
            }
            randomNumber.add(a);
        }

        // To generate the history of attempted numbers by the user
        System.out.println("Your history");
        System.out.println("-------------------");
        for (int i = 0; i < randomNumber.size();i++){
            System.out.print(i+1+ ".Round: ");
            System.out.println(randomNumber.get(i));
        }
        System.out.println("-------------------");

    }
}
