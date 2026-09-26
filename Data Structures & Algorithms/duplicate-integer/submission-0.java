class Solution {
    public boolean hasDuplicate(int[] nums) {
        int len = nums.length - 1;
        for (int p1 = 0; p1 <= len; p1++) 
        {
            for (int p2 = 0; p2 <= len; p2++) 
            {
                if (p2 == p1) continue;
                if (nums[p2] == nums[p1]) return true;
            }
        }
        return false;
            
    }
}