package Week_2;

import java.util.*;
public class pattern22 {
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
            col = 1;
            while (col <= space){
                if(row > 1){
                    System.out.print("  ");
                }
                col++;
            }
            col = 1;
            while (col <= star){
                if(row==1){
                    System.out.print("* ".repeat(n-1));
                    break;
                }
                else{
                    System.out.print("* ");
                }
                col++;
            }

            star--;
            if (row > 1) {
                space+=2;
            }

            row++;
            System.out.println();
        }
    }
}
