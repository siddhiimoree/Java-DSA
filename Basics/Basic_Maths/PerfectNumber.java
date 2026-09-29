package Basics.Basic_Maths;
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Enter a Number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = 1;
        int sum = 1;

        /* // Brute-Force Approch
        while(a!=num){
            if(num%a==0){
                sum = sum + a;
            }
            a++;
        } */

        // Optimal Approach
        for(int i=2;i*i<num;i++){
           if(num%i==0){
                if(i!=(num/i)){
                  sum = sum + i;
                  sum = sum + (num/i);
                }else{
                    sum = sum + i;
                 }
              }
        }



        if(num==sum){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        sc.close();

    }
}
