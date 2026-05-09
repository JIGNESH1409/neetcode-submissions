class Solution {
    public void reverseString(char[] s) {
        reverse(s,0,s.length-1);
    }
    public void reverse(char[] s,int start,int end){
        while(start<end){
            swap(s,start,end);
            start++;
            end--;
        }
    }
    public void swap(char[] s,int start,int end){
        char temp = s[start];
        s[start]=s[end];
        s[end]=temp;
    }
}