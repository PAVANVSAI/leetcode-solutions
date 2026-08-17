class Solution {
    public int lengthOfLastWord(String s) {
        String[] g=s.split(" ");
        int n=g.length;
        String j=g[n-1];
        return j.length();
    }
}