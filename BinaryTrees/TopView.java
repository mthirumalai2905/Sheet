class Solution {
    
    static class Pair {
        Node node;
        int hd; 

        public Pair(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();

        queue.add(new Pair(root, 0));

        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            Node node = pair.node;
            int hd = pair.hd;

            if (!map.containsKey(hd)) {
                map.put(hd, node.data);
            }

            if (node.left != null) {
                queue.add(new Pair(node.left, hd - 1));
            }
            if (node.right != null) {
                queue.add(new Pair(node.right, hd + 1));
            }
        }

        for (int value : map.values()) {
            result.add(value);
        }

        return result;
    }
}
