package Basics.Basic_Maths;

import java.util.Scanner;

public class CountOddDigits {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n>0){
            if(n<0 || n>5000){
                break;
            }
            if(n%2!=0){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
        sc.close();
    }
}
