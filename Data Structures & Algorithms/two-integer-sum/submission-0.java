class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if (nums[0] + nums[1] == target) {
            result[0] = 0;
            result[1] = 1;
            return result;
        }

        for (int i = 0; i < nums.length; i++) {
            int answer = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == answer) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
