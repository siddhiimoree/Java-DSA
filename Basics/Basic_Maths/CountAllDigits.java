package Basics.Basic_Maths;
import java.util.Scanner;
public class CountAllDigits {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //Optimal Solution
        int count = (int)(Math.log10(num)+1);
        //Brute force solution
        /* int count = 0;
        while(num>0){
            count++;
            num = num/10;
        } */
        System.out.println(count);
        sc.close();
    }
}
