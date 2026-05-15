class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start=0;
        int end = 0;
        for(int num:weights){
            start=Math.max(start,num);
        }

        for(int num:weights){
            end+=num;
        }

        while(start<end){
            int mid = start+(end-start)/2;
            if(canFinish( weights, mid, days)){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return end;


    }
    public boolean canFinish(int[] weights,int capacity,int days){
        int totalDays=1;
        int load=0;

        for( int weight :weights){
            if(load + weight >capacity){
                totalDays+=1;
                load=weight;
            }
            else{
                load+=weight;
            }
        }
        return totalDays<=days;




    }
}