class GrumpyOwner {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;

        int maxUnsatCust = 0; // In any window of size minutes
        int currUnsat = 0;
        for(int i = 0; i < minutes; i++){
            currUnsat += customers[i] * grumpy[i];
        }
        
        int i = 0;
        int j = minutes;

        maxUnsatCust = currUnsat;

        while(j < n){
            currUnsat += customers[j] * grumpy[j];
            currUnsat -= customers[i] * grumpy[i];

            maxUnsatCust = Math.max(maxUnsatCust, currUnsat);

            i++;
            j++;
        } 

        int totalSat = maxUnsatCust;

        for(int k = 0; k < n; k++){
            if(grumpy[k] == 0){
                totalSat += customers[k];
            }
        }

        return totalSat;
    }
}
