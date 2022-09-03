package Week_2;

import java.util.*;
public class pattern15 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        solve(n);

        sc.close();
    }

    public static void solve(int n){
        int space = 0, star = n;
        int row = 1;

        while (row <= 2*n-1){
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

            if(row < n) {
                star--;
                space += 2;
            }
            else {
                star++;
                space -= 2;
            }
            row++;
            System.out.println();
        }
    }
}
