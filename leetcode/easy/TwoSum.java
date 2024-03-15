package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }


    public static int[] twoSumHashMap(int[] nums, int target) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int difference = target-nums[i];
            if(hash.containsKey(difference)){
                int j= hash.get(difference);
                return new int[]{i,j};
            }
            hash.put(nums[i],i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSumBruteForce(nums, target)));
        System.out.println(Arrays.toString(twoSumHashMap(nums, target)));

    }
}
