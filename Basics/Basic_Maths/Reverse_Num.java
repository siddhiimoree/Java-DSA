package Basics.Basic_Maths;
public class Reverse_Num {
    public static void main(String[] args) {
        int num = 1234;
        //Only Approach
        int reverse = 0;
        while(num>0){
            int temp = num%10;
            reverse = reverse*10+temp;
            num = num/10;
        }
        System.out.println(reverse);
    }
}
