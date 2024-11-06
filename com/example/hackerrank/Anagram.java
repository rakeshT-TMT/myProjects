package com.example.hackerrank;
import  java.util.*;
public class Anagram {


        static boolean isAnagram(String a, String b) {

            String[] arr1=a.split("");
            String[] arr2=b.split("");
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1, arr2);
        }

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String a = scan.next();
            String b = scan.next();
            scan.close();
            boolean ret = isAnagram(a, b);
            System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        }

}
