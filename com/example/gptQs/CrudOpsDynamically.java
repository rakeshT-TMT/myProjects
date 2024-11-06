package com.example.gptQs;
import java.util.*;
public class CrudOpsDynamically {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {

            System.out.println("\nMENU:");
            System.out.println("1. Add an element");
            System.out.println("2. Get an element by index");
            System.out.println("3. Update an element");
            System.out.println("4. Remove an element");
            System.out.println("5. Display all elements");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");


            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:

                    System.out.print("Enter the element to add: ");
                    int element = scanner.nextInt();
                    list.add(element);
                    System.out.println("Element added.");
                    break;

                case 2:

                    System.out.print("Enter the index to retrieve the element: ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < list.size()) {
                        System.out.println("Element at index " + index + ": " + list.get(index));
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 3:

                    System.out.print("Enter the index to update the element: ");
                    index = scanner.nextInt();
                    scanner.nextLine();  // Consume the newline
                    if (index >= 0 && index < list.size()) {
                        System.out.print("Enter the new element: ");
                        int newElement = scanner.nextInt();
                        list.set(index, newElement);
                        System.out.println("Element updated.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 4:

                    System.out.print("Enter the index to remove the element: ");
                    index = scanner.nextInt();
                    if (index >= 0 && index < list.size()) {
                        list.remove(index);
                        System.out.println("Element removed.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 5:
                    System.out.println("ArrayList elements: " + list);
                    break;

                case 6:

                    System.out.println("Exiting the program...");
                    break;

                default:

                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }

        } while (choice != 6);


        scanner.close();
    }
}
