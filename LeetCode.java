class Solution {
    public int[] twoSum(int[] nums, int target) {
         for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int c=nums[i]+nums[j];
                if (c==target){
                    System.out.println("Target is there");
                     return new int[] {i, j}; 
                }
            }
        }
        return new int[] {} ;
    }
}