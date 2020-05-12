class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        Map<String, Integer> map = new HashMap<>();
        for(String word: words)
            map.put(word, map.getOrDefault(word,0)+1);
        List<String> list = new ArrayList(map.keySet());
        Collections.sort(list, (w1,w2)-> map.get(w1)==map.get(w2)? w1.compareTo(w2): map.get(w2)-map.get(w1));
        
        return list.subList(0,k);
        
    }
}