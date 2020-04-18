class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        outerloop: for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break outerloop;
                }
                ;
            }
        }
        return result;
    }
}