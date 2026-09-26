package Basics.Basic_Maths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class AllDivisor {
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<Integer> res = new ArrayList<>();

        //Brute force Approach
        /* for(int i=1;i<=num;i++){
            if(num%i==0){
               res.add(i);
            }
        } */

        // Optimal Approach
        for(int i=1;i<=Math.sqrt(num);i++){
            if(num%i==0){
                res.add(i);
            }
            if((num/i)!=i){
                res.add(num/i);
            }
        }
        for(int val:res){
            System.out.print(val+" ");
        }
        sc.close();
    }
}
