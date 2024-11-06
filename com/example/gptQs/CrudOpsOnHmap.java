package com.example.gptQs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class CrudOpsOnHmap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String, Integer> hmap=new HashMap<>();
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

            choice= sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Enter the Name and Age");
                    String name= sc.nextLine();
                    int age=sc.nextInt();
                    hmap.put(name, age);
                    System.out.println("Element is Added");
                    break;

                case 2:
                    System.out.println("Enter retrieve Element");
                    String retrieveEle=sc.nextLine();
                    System.out.println("Age of:"+hmap.get(retrieveEle));
                    break;

                case 3:
                    System.out.println("Enter updated Name and Age");
                    String updateName=sc.nextLine();
                    int updatedAge=sc.nextInt();
                    hmap.replace(updateName, updatedAge);
                    System.out.println("HashMap is Updated..");
                    break;

                case 4:
                    System.out.println("Enter removing element: ");
                    String removingEle=sc.nextLine();
                    hmap.remove(removingEle);
                    System.out.println("Element Removed");
                    break;

                case 5:
                    System.out.println("Hashmap elements: " + hmap);
                    break;

                case 6:
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }while (choice!=6);

        sc.close();
    }
}
