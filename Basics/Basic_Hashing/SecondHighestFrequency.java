package Basics.Basic_Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SecondHighestFrequency {
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

        int maxfreq = Integer.MAX_VALUE;

        for(int freq: map.values()){
            maxfreq = Math.max(maxfreq, freq);
        }
        int secondFrequency = -1;

        for(int freq : map.values()){
            if(freq<maxfreq){
                secondFrequency = Math.max(secondFrequency,freq);
            }
        }

        if(secondFrequency == -1){
            System.out.println("-1");
        }
        else{
            int answer = Integer.MAX_VALUE;

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if(entry.getValue()==secondFrequency){
                    answer = Math.min(answer,entry.getKey());
                }

            }
            System.out.println(answer);
        }
        sc.close();
        
    }
}
