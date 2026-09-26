package Basics.Basic_Maths;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        int i=1;
        if(n>0 && n <=10){
            while(i<=n){
                fact = fact * i++;
            }
        }
        System.out.println(fact);
        sc.close();

    }
}
