package Week_2;

	import java.util.*;

	public class pattern27 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			sol_2(n);
			sc.close();
		}

		public static void sol_1 (int n){
			int space = n-1, star=1, val = 1;

			for(int i = 1; i <= n; i++) {
				for(int j = 1; j <= space; j++) {
					System.out.print("  ");
				}
				for(int j = 1; j <= star; j++) {
					System.out.print(val + " ");
					if(j<(star/2)+1) {
						val ++;
					}
					else {
						val--;
					}
				}
				System.out.println();
				space--;
				star+=2;
				val = 1;
			}
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
					System.out.print(val + " ");
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
				val = 1;
			}
		}

	}
