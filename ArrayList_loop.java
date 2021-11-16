import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_loop {
    public static void main(String[] args) {

        /* Question:
        1. To add the Items in ArrayList
        2. Print the Item List at the end when user press q
        3. Later, program asks from the user if want to remove any item. if so, press number of the item.
        4. Print the total number of remaining items
         */

                // To make the Scanner Object
                Scanner sc = new Scanner(System.in);
                // To make the ArrayList
                ArrayList<String> ItemList = new ArrayList<String>();

                // Applying the loop
                while (true) {

                    System.out.println("Add item " + (ItemList.size() + 1) + " (type q to quit)");
                    String item = sc.nextLine();
                    ItemList.add(item);

                    if (item.equals("q")) {
                        break;
                    }
                }

                //Removing the last object as we do not want to print q
                ItemList.remove(ItemList.size() - 1);

                // To print the list of items added by the user

                System.out.println("Shopping Cart");
                for (int j = 0; j < ItemList.size(); j++) {
                    System.out.println("Item " + (j + 1) + ": " + ItemList.get(j));
                }

                System.out.println("Items Total: " + ItemList.size());

                // Asking the item which we want to remove from the list

                System.out.println("Type the number of item you want to delete from the list");
               int numberToRemove =sc.nextInt();

                ItemList.remove(numberToRemove-1);

                // Printing the full List of final items

                for (int k = 0; k < ItemList.size(); k++) {
                    System.out.println("Item " + (k+1) + ": " + ItemList.get(k));
                }
                System.out.println("Items Total: " + ItemList.size());


    }
        }









