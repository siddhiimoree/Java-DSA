package Basics.Basic_Maths;
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Enter a Number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = 1;
        int sum = 0;

        /* // Brute-Force Approch
        while(a!=num){
            if(num%a==0){
                sum = sum + a;
            }
            i++;
        } */

        // Optimal Approach
        for(int i=1;i<=Math.sqrt(num);i++){
            if(num%i==0){
                sum = sum+i;
            }
            if((num/i)!=i){
                if((num/i)!=num){
                   sum = sum + num/i;
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
