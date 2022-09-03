package Week_2;

import java.util.*;

public class pattern33 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        int n;
        sol_2(10);
        sc.close();
    }

    public static void sol_2(int n){
        int space = n-1, star = 1, val = 10;
        int row = 1;

        while(row <= n){
            int col = 1;
            while(col <= space){
                System.out.print("  ");
                col++;
            }
            col = 1;
            while(col <= star){
                if(col==star/2+1){
                    System.out.print(0 + " ");
                }
                else{
                    System.out.print(val + " ");
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
            val=n-row+1;
        }
    }

}
