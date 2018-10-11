package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    grades();
    }

   public static void grades() {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter your score");
       int num = sc.nextInt();
       if(num>= 90){
           System.out.println("your grade is A");
       } else if (num <= 89 || num >= 80) {
           System.out.println("Your grade is B");
       } else if (num <= 79 || num >= 70) {
           System.out.println("your grade is c");
       } else if (num <= 69 || num >= 60) {
           System.out.println("your grade is d");
       } else {
           System.out.println("your grade is F");
       }
   }

}
