package Week_2;

import java.util.*;
public class pattern10 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        solve(n);

        sc.close();
    }

    public static void solve(int n){
        int space = 0, star = 2*n-1;
        int row = 1;

        while (row <= n){
            int col = 1;
            while (col <= space){
                System.out.print("  ");
                col++;
            }
            col = 1;
            while (col <= star){
                System.out.print("* ");
                col++;
            }
            row++;
            star-=2;
            space++;
            System.out.println();
        }
    }
}
