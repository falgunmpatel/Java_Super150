//WAP to calculate thw GCD of a given number

package Week_3;

import java.util.*;

public class GCD {
    public static void main(String[] arg){
        Scanner sc = new Scanner (System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int dividend = n1, divisor = n2;

//        NO need to use if_else, for checking for greatest number.
//        Since loop will run 1 time longer in case of smaller dividend and greater divisor.
//    if (n1 > n2){
//        dividend = n1;
//        divisor = n2;
//    }
//    else{
//         divisor = n1;
//        dividend = n2;
//    }

        while (dividend % divisor != 0){
            int rem = dividend % divisor;
            dividend = divisor;
            divisor = rem;
        }

        System.out.println(divisor);

        sc.close();
    }
}
