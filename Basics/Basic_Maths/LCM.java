package Basics.Basic_Maths;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int largest = Math.max(a, b);
        int smallest = Math.min(a, b);
        int multiple = largest;

        while(true){
            if((multiple%smallest)==0){
                break;
            }
            multiple+= largest;
        }
        System.out.println(multiple);
        sc.close();
    }
}
