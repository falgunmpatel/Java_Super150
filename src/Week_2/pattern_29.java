package Week_2;

import java.util.*;

public class pattern_29 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sol_2(n);
        sc.close();
    }

    public static void sol_2(int n){
        int space = n-1, star = 1, val = 1;
        int row = 1;

        while(row <= n){
            int col = 1;
            while(col <= space){
                System.out.print("  ");
                col++;
            }
            col = 1;
            while(col <= star){
                if(col==1 || col==star) {
                    System.out.print(val + " ");
                }
                else{
                    System.out.print(0 + " ");
                }
                col++;
                if(col <= (star/2)+1){
                    val++;
                }
                else{
                    val--;
                }
            }
            System.out.println();
            star+=2;
            space--;
            row++;
            val=row;
        }
    }

}
