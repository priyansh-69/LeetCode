class Solution {
    public int[] twoSum(int[] nums, int target) {
   for(int i=0;i<nums.length;i++){
       for(int j=1+i;j<nums.length;j++){
           if(nums[i]+nums[j]==target){
               int a[]={i,j};
               return a;
           }
       }
       
   }
   return null ;
}
}
