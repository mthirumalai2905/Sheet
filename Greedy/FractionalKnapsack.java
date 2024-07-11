class Solution {

    double fractionalKnapsack(int W, Item[] items, int n) {
        // Sort items by value to weight ratio in descending order
        Arrays.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                double r1 = (double) o1.value / o1.weight;
                double r2 = (double) o2.value / o2.weight;
                return Double.compare(r2, r1);
            }
        });

        double totalValue = 0.0;
        int currentWeight = 0;

        for (Item item : items) {
            if (currentWeight + item.weight <= W) {
                // If the item can be added completely
                currentWeight += item.weight;
                totalValue += item.value;
            } else {
                // If the item can't be added completely, add fractional part
                int remainingWeight = W - currentWeight;
                totalValue += item.value * ((double) remainingWeight / item.weight);
                break;
            }
        }

        return totalValue;
    }

    
}
