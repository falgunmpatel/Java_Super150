package Week_2;

import java.util.*;

public class Grade_Card {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int marks  = sc.nextInt();
		
		if(marks > 75) {
			System.out.println("A");
		}
		else if(marks > 65) {
			System.out.println("B");
		}
		else if(marks > 55) {
			System.out.println("C");
		}
		else if(marks > 45) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		sc.close();
	}

}
