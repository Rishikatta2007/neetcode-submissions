class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean flag=false;
        int[] seen=new int[nums.length];
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<count;j++){
                if (seen[j]==nums[i]){
                    flag=true;
                    break;
                }
            }
            if(flag){
                break;
            }
            seen[count]=nums[i];
            count++;
        }
        return flag;
        }
}