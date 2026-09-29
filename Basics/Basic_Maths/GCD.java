package Basics.Basic_Maths;

import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        /* //Brute-Force Approach
        int gcd = 0;
        for(int i = 1;i<=Math.min(a,b);i++){
            if(a%i==0 && b%i==0){
                gcd = i;  
            }
        }
        System.out.println(gcd); */

        // Optimal Approach
        while(a>0 && b>0){
            if(a>b){
                a = a%b;
            }
            else{
                b = b%a;
            }
        }
        if(a==0){
            System.out.println(b);

        }
        else{
            System.out.println(a);
        }
        sc.close();

    }
}
