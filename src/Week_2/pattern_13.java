package Week_2;

import java.util.*;
public class pattern13 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        solve(n);

        sc.close();
    }

    public static void solve(int n){
        int space = 1, star = 1;
        int row = 1;

        while (row <= 2*n){
            int col = 1;
            while (col <= star){
                System.out.print("* ");
                col++;
            }

            if(row < n) {
                star++;
            }
            else {
                star--;
            }
            row++;
            System.out.println();
        }
    }
}
