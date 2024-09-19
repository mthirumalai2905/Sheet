import java.util.*;

public class DisjointSet {
    private List<Integer> rank;
    private List<Integer> parent;

    public DisjointSet(int n) {
        rank = new ArrayList<>(Collections.nCopies(n + 1, 0));
        parent = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            parent.add(i);
        }
    }

    public int findUPar(int node) {
        if (node != parent.get(node)) {
            parent.set(node, findUPar(parent.get(node)));
        }
        return parent.get(node);
    }

    public void unionByRank(int u, int v) {
        int ulp_u = findUPar(u);
        int ulp_v = findUPar(v);
        if (ulp_u != ulp_v) {
            if (rank.get(ulp_u) < rank.get(ulp_v)) {
                parent.set(ulp_u, ulp_v);
            } else if (rank.get(ulp_v) < rank.get(ulp_u)) {
                parent.set(ulp_v, ulp_u);
            } else {
                parent.set(ulp_v, ulp_u);
                rank.set(ulp_u, rank.get(ulp_u) + 1);
            }
        }
    }
}
