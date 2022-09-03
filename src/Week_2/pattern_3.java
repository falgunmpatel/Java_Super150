package Week_2;

import java.util.*;
public class pattern3 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        solve(n);

        sc.close();
    }

    public static void solve(int n){
        int space = 1, star = n;
        int row = 1;

        while (row <= n){
            int col = 1;
            while (col <= star){
                System.out.print("* ");
                col++;
            }
            star--;
            row++;
            System.out.println();
        }
    }
}
