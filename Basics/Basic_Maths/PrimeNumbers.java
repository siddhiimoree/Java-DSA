package Basics.Basic_Maths;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Enter a Number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

       /*  //Brute-Force Approach
        for(int i=1;i<=n;i++){
            if(n%i==0){
                cnt++;
            }
        } */

        // Optimal Approach
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                cnt++;
            }
            if((n%i)!=i){
                cnt++;
            }
        }

        if(cnt==2){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a prime number");
        }
        sc.close();

    }
}