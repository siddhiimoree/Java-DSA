package Basics.Basic_Maths;

import java.util.Scanner;

public class PrimeNumbersTillN {
    public static void main(String[] args) {
        System.out.println("Enter a Number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt2 = 0;
            for(int j = 2;j<n;j++){
                int cnt1 =0;
                for(int i=1;i*i<j;i++){
                    if(j%i==0){
                       cnt1++;
                    }
                    if((j%i)!=i){
                       cnt1++;
                    }
                    System.out.println(j + "="+ cnt1 );
                }
                if(cnt1==2){
                    cnt2++;
                }
            }
        }
        System.out.println(cnt2);
    }
}
