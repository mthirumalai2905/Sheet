class Pair{
    int node;
    int distance;
    public Pair(int distance, int node){
        this.node = node;
        this.distance = distance;
    }
}
class Solution {
    static int spanningTree(int V, int E, List<List<int[]>> adj) {
        // Code Here.
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((x,y) -> x.distance - y.distance);
        
        int[] vis = new int[V];
        pq.add(new Pair(0 ,0));
        int sum = 0;
        while(pq.size() > 0){
            Pair curr = pq.poll();
            int wt = curr.distance;
            int node = curr.node;
            
            if(vis[node] == 1) continue;
            
            vis[node] = 1;
            sum += wt;
            
            for(int i = 0; i < adj.get(node).size(); i++){
                int edW = adj.get(node).get(i).get(1);
                int adjNode = adj.get(node).get(i).get(0);
                if(vis[adjNode] == 0){
                    pq.add(new Pair(edW, adjNode));
                }
            }
        }
        return sum;
    }
}
