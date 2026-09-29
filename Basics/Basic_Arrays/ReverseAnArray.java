package Basics.Basic_Arrays;

import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        System.out.println("Enter the size of array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //Brute-Force Approach
        int i = 0;
        int j = n-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--; 
        }

        //Optimal Solution




        
        for(int a = 0;a<n;a++){
            System.out.print(arr[a]+ " ");

        }
        sc.close();
    }
}
