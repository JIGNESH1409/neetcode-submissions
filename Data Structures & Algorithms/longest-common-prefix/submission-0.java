class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        String left = strs[0];
        String right = strs[strs.length-1];

        int idx=0;

        while(idx<left.length() && idx<right.length()){
            if(left.charAt(idx)==right.charAt(idx)){
                idx++;
            }
            else{
                break;
            }
        }
        return left.substring(0,idx);

        
    }
}