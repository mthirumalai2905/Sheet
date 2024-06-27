class Hanoi {
    long count = 0;
    public long toh(int N, int from, int to, int aux) {
        if(N==0) return 0;
        toh(N-1, from, aux, to);
        System.out.println("move disk " + N + " from rod " + from + " to rod " + to);
        count++;
        toh(N-1, aux, to, from);
        return count;
    }
}
