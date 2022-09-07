package Week_2;

import java.util.*;

public class pattern_20 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        solve(n);

        sc.close();
    }

    public static void solve (int n) {
        int space = (n-1)/2, star=1;
        int row = 1;

        while(row<=n){
            int col=1;
            while(col <= space){
                System.out.print("  ");
                col++;
            }
            col=1;
            while(col <= star){
                if(col==1 || col==star){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                col++;
            }
            System.out.println();
            row++;

            if(row <= (n/2)+1) {
                star+=2;
                space--;
            }
            else{
                star-=2;
                space++;
            }
        }
    }



}


