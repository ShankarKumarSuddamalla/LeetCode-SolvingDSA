class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int left = 0;
        // int right = nums.length-1;
        // while(left<right){
        //     int sum=nums[left]+nums[right];
        //     if(sum>target){
        //         right--;
        //     }else if(sum<target){
        //         left++;
        //     }
        //     else{
        //         return new int[]{left,right};
        //     }
        // }
        // return new int[]{};
        HashMap<Integer,Integer> visited = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int res = target-nums[i];
            if(visited.containsKey(res)){
                return new int[]{visited.get(res),i};
            }
            else{
                visited.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}