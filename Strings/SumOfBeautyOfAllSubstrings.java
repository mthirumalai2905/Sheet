public class SumOfBeautyOfAllSubstrings {
    public int beautySum(String s) {
        int n = s.length();
        int totalBeautySum = 0;

        for(int i = 0; i < n; i++){
            HashMap<Character, Integer> frequencyMap = new HashMap<>();
            for(int j = i; j < n; j++){
                char currChar = s.charAt(j);
                frequencyMap.put(currChar, frequencyMap.getOrDefault(currChar, 0) + 1);

                int minFreq = Integer.MAX_VALUE;
                int maxFreq = Integer.MIN_VALUE;

                for(int freq : frequencyMap.values()){
                    minFreq = Math.min(minFreq, freq);
                    maxFreq = Math.max(maxFreq, freq);
                }
                totalBeautySum += (maxFreq - minFreq);
            }
        }
        return totalBeautySum;
    }

}
