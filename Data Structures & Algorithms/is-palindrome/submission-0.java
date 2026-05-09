class Solution {
    public boolean isPalindrome(String s) {
        int start =0;
        int end = s.length()-1;

        while(start<end){
            char f =s.charAt(start);
            char e =s.charAt(end);
            if(!Character.isLetterOrDigit(f)){
                start++;
            }
            else if(!Character.isLetterOrDigit(e)){
                end--;
            }

            else{
                if(Character.toLowerCase(f)!=Character.toLowerCase(e)){
                    return false;
                }
                start++;
                end--;
            }
            
        }
        return true;
    }
}
