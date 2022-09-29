//Question 42 HARD

package Leetcode;

public class Trapping_Rain_Water {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int collect = trap(height);
        System.out.println(collect);
    }

    public static int trap(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int [n];
        int collect = 0;

        //max of left of element
        left[0] = height[0];
        for(int i = 1; i < n; i++){
            left[i] = Math.max(left[i-1], height[i]);
        }

        //max on right of element
        right[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--){
            right[i] = Math.max(right[i+1], height[i]);
        }

        //amount of water the element will contain
        for (int i = 0; i < n; i++) {
            int min = Math.min(left[i],right[i]);
            collect += min - height[i];
        }

        return collect;
    }
}
