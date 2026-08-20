class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int max=0;
        HashSet<Character>h=new HashSet<>();
        for(int i=0;i<s.length();i++) {
            char c=s.charAt(i);
            while(h.contains(c)) {
                h.remove(s.charAt(left));
                left++;
            }
            h.add(c);
            max=Math.max(max,i-left+1);
        }
        return max;
    }
}