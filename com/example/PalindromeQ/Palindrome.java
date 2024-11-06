package com.example.PalindromeQ;
//Longest Palindrome
public class Palindrome {
    public static void main(String[] args ) {
        StringBuffer str=new StringBuffer("vvgaggsa8sdfda109876789012134543");
        int prev=0;
        String palindrome="";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                StringBuilder s3 = new StringBuilder(str.substring(i, j));
                String temp = s3.toString();
                s3.reverse();

                if (temp.equalsIgnoreCase(s3.toString())) {
                    int len = s3.length();
                    if (len > prev) {
                        prev = len;
                        palindrome = s3.toString();
                    }
                }
            }
        }

        System.out.println(palindrome);

//        StringBuffer s1=new StringBuffer(str.substring(0,13));
//        StringBuffer s2=new StringBuffer(str.substring(13, str.length()));
//        System.out.println(s1);
//        System.out.println(s2);
//        for(int i=0;i<s2.length();i++){
//
//            for(int j=i+1;j<s2.length();j++){
//                StringBuffer s3=new StringBuffer(s2.substring(i,j));
//                String ss=s3.toString();
//                String temp=ss;
//                s3.reverse();
//
//
//                if(temp.equalsIgnoreCase(s3.toString())){
//                    System.out.println(s3);
//
//                }
//
//            }
//        }

    }
}
