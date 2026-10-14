class Solution {
    public void moveZeroes(int[] nums) {
        int fast=0;
        int slow=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[fast];
                nums[fast]=nums[slow];
                nums[slow]=temp;
                slow++;
                fast++;
            }
            else{
                fast++;
            }
        }
    }
}