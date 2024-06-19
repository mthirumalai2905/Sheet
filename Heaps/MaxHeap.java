public class MaxHeap {
    private int[] heap;
    private int size;
    private int maxSize;

    // Constructor to initialize the heap
    public MaxHeap(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        this.heap = new int[this.maxSize + 1];
        this.heap[0] = Integer.MAX_VALUE; // A sentinel value for easy comparisons
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
    private void maxHeapify(int pos) {
        if (!isLeaf(pos)) {
            int left = leftChild(pos);
            int right = rightChild(pos);
            int largest = pos;

            if (left <= size && heap[left] > heap[largest]) {
                largest = left;
            }
            if (right <= size && heap[right] > heap[largest]) {
                largest = right;
            }

            if (largest != pos) {
                swap(pos, largest);
                maxHeapify(largest);
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
        while (heap[current] > heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    // Method to remove and return the maximum element (root) from the heap
    public int extractMax() {
        int popped = heap[1];
        heap[1] = heap[size--];
        maxHeapify(1);
        return popped;
    }

    // Method to get the maximum element (root) without removing it
    public int peek() {
        return heap[1];
    }

    // Method to check if the heap is empty
    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(15);
        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(17);
        maxHeap.insert(10);
        maxHeap.insert(84);
        maxHeap.insert(19);
        maxHeap.insert(6);
        maxHeap.insert(22);
        maxHeap.insert(9);

        System.out.println("Max value: " + maxHeap.extractMax());
        System.out.println("Next max value: " + maxHeap.peek());
    }
}
