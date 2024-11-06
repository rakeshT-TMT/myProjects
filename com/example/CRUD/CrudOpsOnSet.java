package com.example.CRUD;

import java.util.HashSet;
import java.util.Scanner;

public class CrudOpsOnSet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<Integer> hset=new HashSet<>();
        int choice;
        do {
            System.out.println("\nMENU:");
            System.out.println("1. Add an element");
            System.out.println("2. Contains an element");
            System.out.println("3. Remove an element");
            System.out.println("4. size an element");
            System.out.println("5. Display all element");
            System.out.println("6. Exit");
            System.out.println("Enter the Choice");

            choice= sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Enter element to add: ");
                    int element= sc.nextInt();
                    hset.add(element);
                    System.out.println("Element is Added");
                    break;

                case 2:
                    System.out.println("Enter element: ");
                    int checkEle=sc.nextInt();
                    if(hset.contains(checkEle)){
                        System.out.println("Element is Present");
                    }else {
                        System.out.println("Element is Not Present");
                    }
                    break;

                case 3:
                    System.out.println("Enter Removing element: ");
                    int removeEle=sc.nextInt();
                    hset.remove(removeEle);
                    System.out.println("Element is Removed");
                    break;

                case 4:
                    System.out.println("Size of the element is: "+hset.size());
                    break;

                case 5:
                    System.out.println("HashSet elements: "+hset);
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
