package Basics.Patterns;

public class Pattern18 {
    public static void main(String[] args) {
        char ch = 'E';
        for(int i=0;i<5;i++){
            ch = (char)('E'-i);
            for(int j=0;j<=i;j++){
                System.out.print((char)(ch + j));
            }
            System.out.println();
        }
    }
}
