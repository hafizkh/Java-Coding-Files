import java.util.Scanner;

public class methods_overloading {
    public static void main(String[] args) {
        /* Question: To Calculate the Area of Rectangle or Circle as per user requirements by calling Methods from the
         main class.
         Program asks from the user which area wants to calculate (Area of Circle / Area of Rectangle)?
         */

//        Calculation.calcArea(2,3);
//        Calculation.calcArea(5);

        Scanner sc = new Scanner(System.in);


            System.out.println("What you want to Calculate? Area of Rect or Circle");
            System.out.println("a: For Rectangle");
            System.out.println("c: For Circle");
            String input = sc.nextLine();

            // Applying the Validations
        
            if (input.equals("a")) {
                System.out.print("Please Enter the Width: ");
                double width = sc.nextDouble();
                System.out.print("Please Enter the Height: ");
                double height = sc.nextDouble();
                System.out.printf("The Area of Rectangle is % .2f", Calculation.calcArea(height, width));
            } else if (input.equals("c")) {
                System.out.print("Please Enter the Radius:");
                double acr = sc.nextDouble();
                System.out.println("The Area of Circle is " + Calculation.calcArea(acr));
            } else {
                System.out.println("Please Enter the Valid Value");
            }
        }


    class Calculation {

        double width;
        double height;
        double radius;

        // Making the Methods to calculate the area

        static double calcArea(double width, double height) {
            double ar = width * height;
            return ar;
        }

        static double calcArea(double radius) {
            double acr = Math.PI * radius * radius;
            return acr;
        }
    }
}

