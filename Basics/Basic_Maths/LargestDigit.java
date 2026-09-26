package Basics.Basic_Maths;
import java.util.Scanner;

public class LargestDigit {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int largest = 0;
        while(n>0){
            int temp = n%10;
            if(temp > largest){
                largest = temp;
            }
            n = n/10;
        }
        System.out.println(largest);
        sc.close();

    }
}
