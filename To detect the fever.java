import java.util.Scanner;

public class method_review_ex {
    public static void main(String[] args) {
        printFeverLimits();
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------");

        System.out.println("Mention the Subject name");
        System.out.println("Human, Dog or Horse");
        String subject = sc.nextLine();
        System.out.println("Pleasr write the temperature");
        int temp = sc.nextInt();

        if (hasFever(subject , temp) == true){
            System.out.println("Subjct has fever");
        }
        else {
            System.out.println("Subject does not has fever");
        }


    }

public static void printFeverLimits(){
    System.out.println("Fever Limits");
    System.out.println("Human 37");
    System.out.println("Dog 39");
    System.out.println("Horse 38");
}
public static boolean hasFever(String subject, int temp) {
    boolean hasFever = false;

    if (subject.equals("Human") && temp > 37) {
        hasFever = true;

    } else if (subject.equals("Dog") && temp > 39) {
        hasFever = true;

    } else if (subject.equals("Horse") && temp > 38) {
        hasFever = true;
    }
    return hasFever;

    }
}

