package Basics.Basic_Maths;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a Number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int rev =0;
        while(num>0){
            int ld = num %10;
            rev = rev * 10 + ld;
            num = num/10;
        }
        if(temp == rev ){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
        sc.close();
    }
}
