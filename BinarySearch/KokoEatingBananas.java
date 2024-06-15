class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = getMax(piles);

        while(left < right){
            int mid = (left + right)/2;
            if(canEatAll(piles,mid,h)){
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    private boolean canEatAll(int[] piles, int speed, int h){
        int hours = 0;
        for(int bananas : piles){
            hours += (bananas + speed - 1) / speed;
        }
        return hours <= h;
    }
    public int getMax(int[] piles){
        int max = 0;
        for(int bananas : piles){
            max = Math.max(max, bananas);
        }
        return max;
    }
}
