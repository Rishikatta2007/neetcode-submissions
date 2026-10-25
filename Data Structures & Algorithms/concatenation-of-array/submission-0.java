class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] list=new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            list[i]=nums[i];
            list[i+nums.length]=nums[i];
        }
        return list;
    }
}