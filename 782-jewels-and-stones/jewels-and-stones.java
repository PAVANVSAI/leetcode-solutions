class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        int i=0;
        for(char c:stones.toCharArray()){
            if(jewels.indexOf(c)!=-1){
                count+=1;
            }
            
        }
        return count;
    }
}