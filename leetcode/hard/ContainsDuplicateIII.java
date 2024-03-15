package leetcode.hard;

public class ContainsDuplicateIII {
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        int i = 0, j = 1;

        while (j < nums.length) {
            int currValueDiff = Math.abs(nums[i] - nums[j]);
            int currIndexDiff = Math.abs(i - j);
            if (currValueDiff <= valueDiff && currIndexDiff <= indexDiff) {
                return true;
            } else if (currIndexDiff == indexDiff || j == nums.length - 1) {
                j = ++i;
            }
            j++;
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 1};
        int indexDiff = 3;
        int valueDiff = 0;
        System.out.println(containsNearbyAlmostDuplicate(nums, indexDiff, valueDiff));
        System.out.println(containsNearbyAlmostDuplicate(new int[]{1, 5, 9, 1, 5, 9}, 2, 3));
    }
}
