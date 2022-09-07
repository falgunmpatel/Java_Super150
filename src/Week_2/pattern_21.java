package Week_2;

import java.util.*;
public class pattern_21 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        solve(n);

        sc.close();
    }

    public static void solve(int n){
        int space = 2*n-3, star = 1;
        int row = 1;

        while (row <= n){
            int col = 1;
            while (col <= star){
                System.out.print("* ");
                col++;
            }
            col = 1;
            while (col <= space){
                System.out.print("  ");
                col++;
            }
            col = 1;
            while (col <= star){
                if(row==n && col==star){
                    System.out.println("  ");
                }
                else{
                    System.out.print("* ");
                }
                col++;
            }

            star++;
            space-=2;
            row++;
            System.out.println();
        }
    }
}
