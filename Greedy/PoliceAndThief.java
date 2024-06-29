package Greedy;

class PoliceAndThief
{ 
    static int catchThieves(char arr[], int n, int k) 
	{ 
        List<Integer> policemen = new ArrayList<>();
        List<Integer> thieves = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            if(arr[i] == 'P'){
                policemen.add(i);
            } else if(arr[i] == 'T'){
                thieves.add(i);
            }
        }
        
        int i = 0, j = 0, caught = 0;
        while(i < policemen.size() && j < thieves.size()){
            if(Math.abs(policemen.get(i) - thieves.get(j)) <= k){
                caught++;
                i++;
                j++;
            } else if(policemen.get(i) < thieves.get(j)){
                i++;
            } else {
                j++;
            }
        }
        
        return caught;
	} 
} 
