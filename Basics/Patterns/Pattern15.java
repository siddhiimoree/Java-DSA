package Basics.Patterns;

public class Pattern15 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(char j = 'A';j<'A'+5-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
