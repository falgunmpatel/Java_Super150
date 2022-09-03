package Week_2;

import java.util.*;
public class pattern31 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        solve(n);

        sc.close();
    }

    public static void solve(int n){
        int space = 1, star = n, val = 5;
        int row = 1;

        while (row <= n){
            int col = 1;
            while (col <= star){
                if ((row + col) == n+1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print(val + "  ");
                }
                col++;
                val--;
            }
            row++;
            val = 5;
            System.out.println();
        }
    }
}
