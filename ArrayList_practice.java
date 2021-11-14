package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList_practice {
    public static void main(String[] args) {
    // To add the items in the array and print the whole added items at the end of the program

        Scanner sc = new Scanner(System.in);

        ArrayList<String> ItemList = new ArrayList<String>();

        // Applying the loop
        while (true){
            System.out.println("Add items in the list (Type x for exit)");
            String items = sc.nextLine();
            ItemList.add(items);

            if (items.equals("x"))
            {
                break;
            }

            }
        // To remove the last item as it is "x"

        ItemList.remove(ItemList.size() -1);

        // Printing the items in the Array
        for (int i = 0; i < ItemList.size() ; i++)
        {
            System.out.println(ItemList.get(i));
        }
    }
}
