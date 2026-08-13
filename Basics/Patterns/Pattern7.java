package Basics.Patterns;

public class Pattern7 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=0;j<5-i;j++){
                System.out.print(" ");
            }
            for(int j=10;j>=2*(5-i);j--){
                System.out.print("*");
            }
            for(int j=0;j<5-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
