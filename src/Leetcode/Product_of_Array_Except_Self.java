//Question 238 MEDIUM
package Leetcode;

public class Product_of_Array_Except_Self {
    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        int[] product = productExceptSelf(nums);
        for(int i = 0; i < product.length; i++){
            System.out.print(product[i] + " ");
        }

    }

    public static int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] product = new int[nums.length];
        //product of elements on the left
        int prod = 1;
        for(int i = 0; i < nums.length; i++){
            left[i] = prod;
            prod *= nums[i];
        }

        //product of elements on the right
        prod = 1;
        for(int i = nums.length - 1; i >= 0; i--){
            right[i] = prod;
            prod *= nums[i];
        }

        //product of left and right
        for(int i = nums.length - 1; i >= 0; i--){
            product[i] = left [i] * right[i];
        }


        return product;
    }
}
