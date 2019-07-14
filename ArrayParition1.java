class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int returnSum = 0;
        for(int i=0;i<nums.length;i+=2) {            
            returnSum += nums[i];
        }
        return returnSum;
    }
}
