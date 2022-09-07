package Week_2;

import java.util.*;
public class pattern_25 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        solve(n);

        sc.close();
    }

    public static void solve(int n){
        int space = n-1, star = 1, val = 1;
        int row = 1;

        while (row <= n){
            int col = 1;
            while (col <= space){
                System.out.print("    ");
                col++;
            }
            col = 1;
            while (col <= star){
                if(val<10){
                    System.out.print(val + "   ");
                }
                else{
                    System.out.print(val + "  ");
                }
                col++;
                val++;
            }
            row++;
            star+=2;
            space--;
            System.out.println();
        }
    }
}
