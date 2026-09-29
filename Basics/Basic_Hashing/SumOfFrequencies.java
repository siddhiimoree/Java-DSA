package Basics.Basic_Hashing;
import java.util.Scanner;
import java.util.HashMap;
public class SumOfFrequencies {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        System.out.println("Enter the size of array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter array elements");
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int MaxFreq = Integer.MIN_VALUE;
        int MinFreq = Integer.MAX_VALUE;

        for(int freq : map.values()){
            MaxFreq = Math.max(MaxFreq, freq);
            MinFreq = Math.min(MinFreq, freq);
        }

        System.out.println(MaxFreq+MinFreq);
        sc.close();
    }
}
