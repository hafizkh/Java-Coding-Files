import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class game_lucky_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        ArrayList<String> myGame = new ArrayList<>();

        int randomNumber1;
        int randomNumber2;
        int randomNumber3;

        int win = 0;
        int euro = 0;

        String userResponse = "";
        String playRow = "";

        System.out.println("Let's Play Game!!");
        System.out.println("How many Euros you want to add");
        euro = sc.nextInt();

        do {
            win = 0;
            euro -= 1;

            randomNumber1 = giveMyLuckyNumber(ran);
            randomNumber2 = giveMyLuckyNumber(ran);
            randomNumber3 = giveMyLuckyNumber(ran);

            playRow = "Result (" ;
            playRow += Integer.toString(randomNumber1);
            playRow += ", ";

            playRow += Integer.toString(randomNumber2);
            playRow += ", ";

            playRow += Integer.toString(randomNumber3);
            playRow += ")";

            if (randomNumber1 == 7) {
                win = 2;
            }
            if (randomNumber2 == 7){
                win += 2;
            }
            if (randomNumber3 == 7) {
                win += 2;
            }
            if (win == 0){
                System.out.println("You lost");
            }
            else if (win == 2){
                System.out.println("You won once");
            }
            else if (win == 4){
                System.out.println("You won twice");
            }
            else if (win == 6){
                System.out.println("JackPot");
            }

            euro = euro + win;
            playRow += ", Wallat: " ;
            playRow += Integer.toString(euro);
            playRow += "e";

            myGame.add(playRow);
            System.out.println(playRow);

            if (euro > 0) {
                System.out.println("Do y1ou want to play again (y/n)");
                userResponse = sc.next();
            }

        }while(euro > 0 && userResponse.equals("y"));

        sc.close();
        System.out.println("Game Over!!");

        System.out.println("Summary of your Game!!");
        System.out.println("******************************");
        for (int i = 1; i < myGame.size(); i++){
            System.out.print(Integer.toString(i) + ". Round: ");
            System.out.println(myGame.get(i));
        }
        System.out.println("******************************");

    }

    static int giveMyLuckyNumber(Random myNumber) {
        return myNumber.nextInt(10)+1;

    }

}
