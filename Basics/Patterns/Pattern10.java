package Basics.Patterns;

public class Pattern10 {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            int stars = i;
            if(i>5){
                stars=2*5-i;
            }
            for(int j=0;j<stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
