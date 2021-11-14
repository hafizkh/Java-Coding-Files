import java.util.Scanner;
public class Guess_name_game {
    public static void main(String[] args) {

    /* To Guess the name of the person in which system asks from th user and print the result in console
    in no. of tries but user can quit the loop by typing stop
    */
    
            Scanner sc = new Scanner(System.in);
        System.out.println("Guess my name(Type stop to exit)");

        String guessName = sc.nextLine();

        String myNmae = "Emma";
        int counter = 0;

        while(true){
            if (guessName.equals(myNmae)){
                System.out.println("Congrats!");
                System.out.println("You guessed in " + counter + " times");
                break;
            }
            else {
                if (guessName.equals("stop")) {
                    System.out.println("You guessed in " + counter + " times");
                    break;
                }
                System.out.println("Guess my name(Type stop to exit)");
                guessName = sc.nextLine();
                counter++;


            }
        }


    }
}
