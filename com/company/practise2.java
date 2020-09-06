package com.company;
import java.util.Scanner;


public class practise2 {
    public static void main(String[] args) {
        float sub1,sub2,sub3,total,cgpa;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Marks Of Subject 1 : ");

        sub1 = sc.nextFloat();
        System.out.print("Enter The Marks Of Subject 2 : ");

        sub2 = sc.nextFloat();

        System.out.print("Enter The Marks Of Subject 3 : ");

        sub3 = sc.nextFloat();
        
        sc.close();
        
        cgpa = (sub1+sub2+sub3)/30;


        System.out.println("Your CGPA Is : "+ cgpa);
    }
}
