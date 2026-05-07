class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length+nums.length];
        int j=0;

        for(int i =0;i<result.length;i++){
            if(i>nums.length-1){
                result[i]=nums[j];
                j++;
            }
            else{
                result[i]=nums[i];
            }
        }
        return result;
    }
}