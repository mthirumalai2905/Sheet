package LinkedLists;

public class Node {
    Node next;
    int value;

    public Node(int value){
       this.value = value;
    }

    // Traversal of singly linked lists
    public static void traversal(Node head){
        Node ptr = head;

        while(ptr != null){
            System.out.print(ptr.value + "->");
            ptr = ptr.next;
        }

    }

    //inserting head
    public static Node insertAtTheBeginning(Node head){
        Node node = new Node(0);
        node.next = head;
        head = node;

        return node;
    }

    //inserting at the end
    public static Node insertAtTheEnd(Node head){
        Node ptr = head;
        Node node = new Node(10);

        while(ptr.next != null){
            ptr = ptr.next;
        }

        ptr.next = node;

        return head;
    }


    //insert at the beginning
    public static Node insertAtThePosition(Node head, int pos, int value){
        Node node = new Node(value);

        Node ptr = head;

        for(int i = 0; i < pos - 1; i++){
            ptr = ptr.next;
        }

        node.next = ptr.next;
        ptr.next = node;
        
        return head;
    }


    // Deleting the head from the linked list
    public static Node deleteFromTheBeginning(Node head){
        return head = head.next;
    }
    // Deleting the tail from the linked list
    public static Node deleteFromTheEnd(Node head){
        Node ptr = head;
        while(ptr.next.next != null){
            ptr = ptr.next;
        }

        ptr.next = null;

        return head;
    }
    // Deleting the target node from the linked list
    public static Node deleteTheTarget(Node head, int value){
        Node ptr = head;
        while(ptr != null && ptr.next != null){
            if(ptr.next.value == value){
                ptr.next = ptr.next.next;
            }
            ptr = ptr.next;
        }
        return head;
    }

    //Linear Searching in the LinkedLists
    public static boolean nodeExists(Node head, int value){
        Node ptr = head;
        while(ptr != null && ptr.next != null){
            if(ptr.value == value){
                return true;
            }
            ptr = ptr.next;
        }
        return false;
    }

    //Length of a Linked List
    public static int lengthOfTheList(Node head){
        Node ptr = head;
        int length = 0;
        while(ptr != null){
          length++;
          ptr = ptr.next;
        }
        return length;
    }

    // Method To Delete a node without head reference
    public void deleteNode(Node nodeToDelete){
        while(nodeToDelete != null || nodeToDelete.next != null){
            nodeToDelete.value = nodeToDelete.next.value;
            nodeToDelete.next = nodeToDelete.next.next;
        }
    }
    
    public static void main(String[] args){
        Node h1 = new Node(1);
        h1.next = new Node(2);
        h1.next.next = new Node(3);
        h1.next.next.next = new Node(4);

        // traversal(h1);

        h1 = insertAtTheBeginning(h1);

        // traversal(h1);

        h1 = insertAtTheEnd(h1);

        // traversal(h1);

        h1 = insertAtThePosition(h1, 2, 100);

        // traversal(h1);

        h1 = deleteFromTheBeginning(h1);

        // traversal(h1);

        h1 = deleteFromTheEnd(h1);

        // traversal(h1);

        h1 = deleteTheTarget(h1, 4);

        // traversal(h1);

        System.out.println(nodeExists(h1, 2));

        System.out.println(lengthOfTheList(h1));
    
    }

}
