package Basics.Basic_Arrays;
import java.util.Scanner;
public class SumOfArrayElement {
    public static void main(String[] args) {
        System.out.println("Enter the size of array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum = sum +arr[i];
        }
        System.out.println(sum);
        sc.close();
    }
}
