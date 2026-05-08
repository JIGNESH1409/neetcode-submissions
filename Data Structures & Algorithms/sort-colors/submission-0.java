class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int current=0;
        int high = nums.length-1;

        while(current<=high){
            if(nums[current]==0){
                swap(nums,low,current);
                low++;
                current++;
            }
            else if(nums[current]==1) current++;
            else{
                swap(nums,high,current);
                high--;
            }
        }
    }
    public void swap(int[] nums,int first,int second){
        int temp = nums[first];
        nums[first]=nums[second];
        nums[second]=temp;;
    }
}