package Basics.Patterns;

public class Pattern20 {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            int stars=i;
            int space = 2*(5-i);
            if(i>5){
                stars= 2*5-i;
                space = 2*(i-5);
            }
            for(int j=0;j<stars;j++){
                System.out.print("*");
            }
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            for(int j=0;j<stars;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
}
