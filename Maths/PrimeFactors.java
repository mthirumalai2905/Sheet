class PrimeFactors
{
    public int[] AllPrimeFactors(int N)
    {
       ArrayList<Integer> list = new ArrayList<>();
       
       for(int i =  2; i <= N; i++){
           if(N % i == 0){
               list.add(i);
               while(N % i == 0){
                   N = N / i;
               }
           }
       }
       
       int[] res = new int[list.size()];
       
       for(int i = 0; i < list.size(); i++){
           res[i] = list.get(i);
       }
       
       return res;
    }
}
