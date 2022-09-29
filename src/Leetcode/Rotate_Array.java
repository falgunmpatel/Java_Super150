//Question 189  USING REVERSAL ALGORITHM
package Leetcode;

public class Rotate_Array {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int[] nums = {1,2,3,4,5,6,7};
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = sc.nextInt();
//        }
        rotate(nums, 3);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length; //since rotate pattern repeats after k = n
        reverse(nums, 0, nums.length - 1 - k);  //reversing nums.length - k elements at the beginning of array
        reverse(nums, nums.length - k, nums.length - 1); //reversing k elements at the end of array
        reverse(nums, 0, nums.length - 1); // reversing all elements of array
    }

    public static void reverse(int[] nums,int i,int j){
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }


}
