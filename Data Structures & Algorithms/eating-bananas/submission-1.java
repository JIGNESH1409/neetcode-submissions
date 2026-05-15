class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start=1;
        int end = Integer.MIN_VALUE;

        for(int num : piles){
            end = Math.max(num, end);
        }

        while(start<end){
            int mid = start+(end-start)/2;

            if(canFinish(piles,mid,h)){
                end =mid;
            }
            else{
                start=mid+1;
            }

        }
        return end;



       
    }

    public boolean canFinish(int[] piles, int reqHour, int hour){
        int totalhours = 0;

        for(int i = 0; i < piles.length; i++){
            totalhours += (int)Math.ceil((double)piles[i] / reqHour);
        }

        return totalhours <= hour;
    }
}