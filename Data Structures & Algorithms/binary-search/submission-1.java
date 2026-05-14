class Solution {
    public int search(int[] nums, int target) {
        Arrays.sort(nums);
        int low =0;
        int end = nums.length-1;
        while(low<=end){
            int mid = low+(end-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
}
