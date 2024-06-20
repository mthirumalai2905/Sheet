class SortCharactersByFrequency{
public String frequencySort(String s) {
       HashMap<Character, Integer> map = new HashMap<>();

       for(char c : s.toCharArray()){
        map.put(c, map.getOrDefault(c,0)+1);
       }

       PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());

       for(HashMap.Entry<Character, Integer> entry : map.entrySet()){
        maxHeap.offer(entry);
       }

       StringBuilder result = new StringBuilder();
       while(!maxHeap.isEmpty()){
        Map.Entry<Character, Integer> entry = maxHeap.poll();
        result.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
       }
       return result.toString();
    }
}
