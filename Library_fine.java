import java.util.Scanner;

public class Library_fine {
    public static void main(String[] args) {
        /* To determine the fine from the library with 40 cents for the first 10 days but 60 cents for the next ten days
        and 80 cents after the 20 days

        */
        System.out.println("Enter the Number of days : ");

        Scanner sc = new Scanner(System.in);

        int days = sc.nextInt();

        // Applying the validations for the days

        if (days <= 10){
            System.out.println(0.4 * days);
        }
        else if (days >=11 && days <=20){
            System.out.println(0.6*days);
        }
        else
        {
            System.out.println(0.8 * days);
        }

    }
}
