package com.example.gptQs;

import javax.xml.transform.Source;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CrudOps {
    public static void main(String[] args) {
//        Map<String, Integer> ages=new HashMap<>();
//        ages.put("Rakesh", 23);
//        ages.put("Sai", 24);
//        ages.put("Ajay", 24);
//        ages.put("GTMI", 22);
//        ages.put("Mukesh", 23);
//        ages.put("Abhi", 20);
//        System.out.println(ages);
//        ages.put("Ajay", 23);
//
//        System.out.println(ages);
//        System.out.println(ages.get("Sai"));
//        ages.replace("GTMI", 20);
//        System.out.println(ages.values());

        Scanner sc=new Scanner(System.in);
        Map<String, Integer> hmap=new HashMap<>();
        System.out.println("Size of HashMap:");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            String s=sc.next().toLowerCase();
            int age=sc.nextInt();
            hmap.put(s, age);
        }
        System.out.println(hmap);

    }
}
