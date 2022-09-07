package Week_2;

import java.util.*;
public class pattern_32 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        solve(n);

        sc.close();
    }

    public static void solve(int n){
        int space = 1, star = 1, val = 1;
        int row = 1;

        while (row <= 2*n-1){
            int col = 1;
            while (col <= star){
                if(col < star){
                    System.out.print(val + " " + "* ");
                }
                else{
                    System.out.print(val + " ");
                }
                col++;
            }

            if(row < n) {
                star++;
                val = row+1;
            }
            else {
                star--;
                val = 2*n-1 - row;
            }
            row++;

            System.out.println();
        }
    }
}
