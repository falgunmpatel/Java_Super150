// 53. Maximum Subarray MEDIUM

package Leetcode;

public class Maximum_Subarray {
    public static void main(String[] args) {
        int[] nums = {5,4,-1,7,8};
        int ans = maxSubArray2(nums);
        System.out.println(ans);
    }

    public static int maxSubArray1(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                ans = Math.max(sum, ans);
            }
        }
        return ans;
    }


    //KADANE'S ALGORITHM
    public static int maxSubArray2(int[] nums){
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            ans = Math.max(sum,ans);
            if(sum < 0){       //when SUM becomes -ve, SUM is made to ZERO not when element is ZERO
                sum = 0;
            }
        }
        return ans;
    }
}
