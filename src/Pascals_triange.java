import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Pascals_triange {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
//        approach_1();
        approach_2();
    }
    static  void approach_1(){
        int n = sc.nextInt();
        int row = 1;
        while(row <= n){
            int col = 1;
            int value = 1;
            while(col <= row){
                System.out.print(value+" ");
                value = ((row - col)*value) / col ;
                col++;
            }
            System.out.println();
            row++;
        }
    }

    static  void approach_2(){
        int n = sc.nextInt();
        int row = 0;
        while(row < n){
            System.out.println((int) Math.pow(11,row));
            row++;
        }
    }
}