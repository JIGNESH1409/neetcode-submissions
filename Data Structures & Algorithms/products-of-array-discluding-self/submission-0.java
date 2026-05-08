class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftProd = new int[nums.length];
        int[] rightProd = new int[nums.length];
        int[] result = new int[nums.length];
        leftProd[0]=1;
        for(int i =1;i<nums.length;i++){
            leftProd[i]=leftProd[i-1]*nums[i-1];
        }
        rightProd[nums.length-1]=1;
        for(int j=nums.length-2;j>=0;j--){
            rightProd[j]=rightProd[j+1]*nums[j+1];
        }
        for(int k=0;k<nums.length;k++){
            result[k]=leftProd[k]*rightProd[k];
        }
        return result;
    }
}  
