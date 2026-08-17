class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap <Character,Integer> h=new HashMap<>();
        HashMap <Character,Integer> m=new HashMap<>();
        for(char i: s.toCharArray()) {
            h.put(i,h.getOrDefault(i,0)+1);
        }
        for(char i: t.toCharArray()) {
            m.put(i,m.getOrDefault(i,0)+1);
        }
        if(h.size()==m.size()) {
            if(h.equals(m)) {
                return true;
            }
        }
        return false;

    }
}