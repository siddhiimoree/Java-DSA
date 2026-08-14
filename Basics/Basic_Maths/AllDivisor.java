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
        for(int i=1;i<=num;i++){
            if(num%i==0){
               res.add(i);
            }
        }
        System.out.println(res);
        sc.close();
    }
}
