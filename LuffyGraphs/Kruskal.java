import java.util.*;

class Solution {
    // Disjoint Set Union (Union-Find) Helper Class
    static class UnionFind {
        int[] parent, rank;

        public UnionFind(int n) {
            parent = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                rank[i] = 0;
            }
        }

        // Find with path compression
        public int find(int u) {
            if (parent[u] != u) {
                parent[u] = find(parent[u]);
            }
            return parent[u];
        }

        // Union by rank
        public boolean union(int u, int v) {
            int rootU = find(u);
            int rootV = find(v);

            if (rootU != rootV) {
                if (rank[rootU] > rank[rootV]) {
                    parent[rootV] = rootU;
                } else if (rank[rootU] < rank[rootV]) {
                    parent[rootU] = rootV;
                } else {
                    parent[rootV] = rootU;
                    rank[rootU]++;
                }
                return true;
            }
            return false;
        }
    }

    static int spanningTree(int V, int E, List<List<int[]>> adj) {
        List<int[]> edges = new ArrayList<>();

        // Convert adjacency list to edge list
        for (int u = 0; u < V; u++) {
            for (int[] edge : adj.get(u)) {
                int v = edge[0];
                int weight = edge[1];
                edges.add(new int[]{u, v, weight});
            }
        }

        // Sort edges by weight
        edges.sort(Comparator.comparingInt(edge -> edge[2]));

        // Kruskal's algorithm
        UnionFind uf = new UnionFind(V);
        int mstWeight = 0;
        int edgesUsed = 0;

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int weight = edge[2];

            if (uf.union(u, v)) {
                mstWeight += weight;
                edgesUsed++;
                if (edgesUsed == V - 1) break;
            }
        }

        return mstWeight;
    }
}
