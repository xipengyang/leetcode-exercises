import java.util.HashMap;

/**
 * HashMap implementation. Time Complexity O(1). Space Complexity O(n)
 * 
 */
public class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> valueMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            valueMap.put(nums[i], i);
        }
        for (int i = 0; i < n; i++) {
            int hit = target - nums[i];
            if (valueMap.containsKey(hit) && valueMap.get(hit) != i) {
                return new int[] { i, valueMap.get(hit) };
            }
        }

        return new int[] { -1, -1 };
    }
}