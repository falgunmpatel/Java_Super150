package Week_2;

import java.util.*;

public class pattern_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sol_1(n);

		sc.close();
	}

	public static void sol_1 (int n) {
		int space = (n - 1)/2, star = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("* ");
			}
			System.out.println();

			if (i < n/2+1) {
				space--;
				star+=2;
			} else {
				space++;
				star-=2;
			}
		}
	}

	public static void sol_2 (int n) {
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
				System.out.print("* ");
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


