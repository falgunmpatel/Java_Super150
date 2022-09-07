package Week_2;

import java.util.*;
public class pattern_5 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        solve(n);

        sc.close();
    }

    public static void solve(int n){
        int space = 0, star = n;
        int row = 1;

        while (row <= n){
            int col = 1;
            while(col <= space){
                System.out.print("  ");
                col++;
            }
            col=1;
            while (col <= star){
                System.out.print("* ");
                col++;
            }
            star--;
            space++;
            row++;
            System.out.println();
        }
    }
}
