package Basics.Patterns;

public class Pattern17 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            char ch = 'A';
            for(int j=0;j<4-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<2*i;j++){
                System.out.print(ch);
                if(j>=4){
                    ch--;
                }
                else{
                    ch++;
                }  

            }
            for(int j=0;j<4-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
