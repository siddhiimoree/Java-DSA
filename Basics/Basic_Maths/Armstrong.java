package Basics.Basic_Maths;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        while(num>0){
            int ld = num%10;
            int cube = ld*ld*ld;
            sum = sum+cube;
            num = num/10;
        }
        if(temp == sum){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not a Armstrong");
        }
        sc.close();
    }
}
