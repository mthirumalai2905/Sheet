public class MinHeap {
    private int[] heap;
    private int size;
    private int maxSize;

    // Constructor to initialize the heap
    public MinHeap(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        this.heap = new int[this.maxSize + 1];
        this.heap[0] = Integer.MIN_VALUE; // A sentinel value for easy comparisons
    }

    // Helper methods to get the index of parent/left child/right child
    private int parent(int pos) {
        return pos / 2;
    }

    private int leftChild(int pos) {
        return (2 * pos);
    }

    private int rightChild(int pos) {
        return (2 * pos) + 1;
    }

    // Method to check if the node is a leaf node
    private boolean isLeaf(int pos) {
        return pos >= (size / 2) && pos <= size;
    }

    // Method to swap two nodes in the heap
    private void swap(int fpos, int spos) {
        int tmp = heap[fpos];
        heap[fpos] = heap[spos];
        heap[spos] = tmp;
    }

    // Method to heapify the node at pos downwards
    private void minHeapify(int pos) {
        if (!isLeaf(pos)) {
            int left = leftChild(pos);
            int right = rightChild(pos);
            int smallest = pos;

            if (left <= size && heap[left] < heap[smallest]) {
                smallest = left;
            }
            if (right <= size && heap[right] < heap[smallest]) {
                smallest = right;
            }

            if (smallest != pos) {
                swap(pos, smallest);
                minHeapify(smallest);
            }
        }
    }

    // Method to insert a new element into the heap
    public void insert(int element) {
        if (size >= maxSize) {
            return; // Heap is full
        }
        heap[++size] = element;
        int current = size;

        // Bubble up the new element
        while (heap[current] < heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    // Method to remove and return the minimum element (root) from the heap
    public int extractMin() {
        int popped = heap[1];
        heap[1] = heap[size--];
        minHeapify(1);
        return popped;
    }

    // Method to get the minimum element (root) without removing it
    public int peek() {
        return heap[1];
    }

    // Method to check if the heap is empty
    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(15);
        minHeap.insert(5);
        minHeap.insert(3);
        minHeap.insert(17);
        minHeap.insert(10);
        minHeap.insert(84);
        minHeap.insert(19);
        minHeap.insert(6);
        minHeap.insert(22);
        minHeap.insert(9);

        System.out.println("Min value: " + minHeap.extractMin());
        System.out.println("Next min value: " + minHeap.peek());
    }
}
