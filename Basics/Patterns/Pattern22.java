package Basics.Patterns;

public class Pattern22 {
    public static void main(String[] args) {
        int n = 7;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                int min = Math.min(Math.min(i, j), Math.min(n - i + 1, n - j + 1));

                System.out.print(5 - min + " ");
            }

            System.out.println();
        }
    }
    
}
