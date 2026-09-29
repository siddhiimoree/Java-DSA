package Basics.Basic_Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HighestFrequency {
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
        int highFreq = Integer.MIN_VALUE;

        for(int freq : map.values()){
            if(freq>highFreq){
                highFreq = Math.max(freq, highFreq);
            }
        }
        int answer = Integer.MAX_VALUE;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(highFreq== entry.getValue()){
                answer = Math.min(entry.getKey(), answer);
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
