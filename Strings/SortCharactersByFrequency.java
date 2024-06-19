import java.util.HashMap;
import java.util.PriorityQueue;

class SortCharactersByFrequency{
    private static String frequencySort(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        PriorityQueue<Map.Entry<Character,Integer>> maxHeap = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());

        maxHeap.addAll(map.entrySet());

        StringBuilder result = new StringBuilder();
        while(!maxHeap.isEmpty()){
            Map.Entry<Character, Integer> entry = maxHeap.poll();
            char c = entry.getKey();
            int frequency = entry.getValue();
            for(int i = 0; i < frequency; i++){
                result.append(c);
            }
        }

        return result.toString();
    }
    public static void main(String[] args) {
        String s = "tree";
        String res = frequencySort(s);

        System.out.println(res);
    }
}