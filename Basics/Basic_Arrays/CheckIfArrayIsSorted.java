package Basics.Basic_Arrays;

import java.util.Scanner;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        System.out.println("Enter the size of array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean check = true;
        int temp = arr[0];
        for(int i =1;i<n;i++){
            if(temp>arr[i]){
                check = false;
                break;
            }
            temp = arr[i];
        }
        System.out.println(check);
        sc.close();
    }
}
