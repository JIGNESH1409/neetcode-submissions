class Solution {
    public boolean validPalindrome(String s) {
        int start =0;
        int end = s.length()-1;

        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return isPalindrome(s,start,end-1) || isPalindrome(s,start+1,end);
            }
            start++;
            end--;
        }
        return true;
    }

    public boolean isPalindrome(String s,int start,int end){
        while(start<end){
             char f = s.charAt(start);
             char e= s.charAt(end);

             if(Character.toLowerCase(f)!=Character.toLowerCase(e)){
                return false;
            }
            start++;
            end--;
        }
       return true; 
    }
    
}