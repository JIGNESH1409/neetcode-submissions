class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        char[] f = s.toCharArray();
        char[] g = t.toCharArray();

        Arrays.sort(f);
        Arrays.sort(g);

        return Arrays.equals(f,g);


    }
}
