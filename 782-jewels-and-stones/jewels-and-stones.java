class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        HashSet<Character> h=new HashSet<>();
        for(char i:jewels.toCharArray()) {
            h.add(i);
        }
        for(char i:stones.toCharArray()) {
            if(h.contains(i)) {
                count+=1;
            }
        }
        return count;
    }
}