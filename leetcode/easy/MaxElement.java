package leetcode.easy;

import java.util.Arrays;

public class MaxElement {
    public static int[] maxElement(int[] nums) {
        int max = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        return new int[]{max};
    }

    public static int maxElementBruteForce(int[] nums) {
        int max = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int nums[]={1,2,9,5,0} ;
        System.out.println(Arrays.toString(maxElement(nums)));

        System.out.println(maxElementBruteForce(nums));
    }
}
