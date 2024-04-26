package leetcode.medium;

import java.util.Arrays;

public class SortColor {
    public static void sortColors(int[] nums) {
        int red =0;
        int white =0;
        int blue =0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                red++;
            }else if(nums[i]==1){
                white++;
            }else{
                blue++;
            }
        }
        int index = 0;
        for (int i = 0; i < red; i++) {
            nums[index++] = 0;
        }
        for (int i = 0; i < white; i++) {
            nums[index++] = 1;
        }
        for (int i = 0; i < blue; i++) {
            nums[index++] = 2;
        }
    }
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        System.out.println("Sorted Array: " + Arrays.toString(nums));
    }
}
