package Week_2;

import java.util.*;
public class pattern_17 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        solve(n);

        sc.close();
    }

    public static void solve(int n){
        int space = 1, star = n/2 ;
        int row = 1;

        while (row <= n){
            int col = 1;
            while(col <= star){
                System.out.print("* ");
                col++;
            }
            col=1;
            while (col <= space){
                System.out.print("  ");
                col++;
            }
            col = 1;
            while(col <= star){
                System.out.print("* ");
                col++;
            }

            if(row <= n/2){
                star--;
                space+=2;
            }
            else {
                star++;
                space-=2;
            }
            row++;
            System.out.println();
        }
    }
}
