class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> h=new HashMap<>();
        for(String word: strs) {
            char[] chars=word.toCharArray();
            Arrays.sort(chars);
            String key=new String(chars);
            if(!h.containsKey(key)){
                h.put(key,new ArrayList<>());
            }
            h.get(key).add(word);
        }
        return new ArrayList<>(h.values());
    }
}