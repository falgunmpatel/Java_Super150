package Week_2;

	import java.util.*;

	public class pattern2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int space = n-1, star=1, val = 1;
//			int n =5;
			
			for(int i = 1; i <= n; i++) {
				for(int j = 1; j <= space; j++) {
					System.out.print("  ");
				}
				for(int j = 1; j <= star; j++) {
					System.out.print(val + " ");
					val ++;
				}
				System.out.println();	

				
				space--;
				star+=2;
				val = 1 ;
				
				
			}
			
			
			sc.close();
		}

	}
