class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans=0;
        for(int i=0;i<sentences.length;i++) {
            int temp=0;
            for(int j=0;j<sentences[i].length();j++) {
                if(sentences[i].charAt(j)==' '){
                    temp+=1;
                }
            }
            ans=Math.max(ans,temp+1);
        }
        return ans;
    }
}