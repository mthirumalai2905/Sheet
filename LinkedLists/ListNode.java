package LinkedLists;

public class ListNode {
    ListNode next;
    ListNode prev;
    int value;

    public ListNode(int value){
        this.value = value;
        this.next = null;
        this.prev = null;
    }

    public static void traversalForward(ListNode head){
        ListNode ptr = head;
        while(ptr != null){
            System.out.print(ptr.value + "<->");
            ptr = ptr.next;
        }
        System.out.println("null");
    }

    public static void traversalBackward(ListNode tail){
        ListNode ptr = tail;
        while(ptr != null){
            System.out.print(ptr.value + "<->");
            ptr = ptr.prev;
        }
        System.out.println("null");
    }

    public static ListNode insertAtTheBeginning(ListNode head, int value){
        ListNode newNode = new ListNode(value);
        if(head != null){
            newNode.next = head;
            head.prev = newNode;
        }
        return newNode;
    }

    public static ListNode insertAtTheEnd(ListNode head, int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
          return newNode;
        }

        ListNode ptr = head;
        while(ptr.next != null){
            ptr = ptr.next;
        }

        ptr.next = newNode;
        newNode.prev = ptr;

        return head;
    }

    public static ListNode deleteFromTheBeginning(ListNode head){
        if(head == null){
            return null;
        }
        head = head.next;
        if(head != null){
            head.prev = null;
        }
        return head;
    }

    public static ListNode deleteFromTheEnd(ListNode head){
        if(head == null || head.next == null){
            return null;
        }

        ListNode ptr = head;
        while(ptr.next != null){
            ptr = ptr.next;
        }

        ptr.prev.next = null;

        return head;
    }

    public static void main(String[] args){
        ListNode h1 =new ListNode(1);
        h1.next = new ListNode(2);
        h1.next.prev = h1;
        h1.next.next = new ListNode(3);
        h1.next.next.prev = h1.next;

        //Traversing forward
        System.out.println("Forward Traversal");
        // traversalForward(h1);

        ListNode tail = h1;
        while(tail.next != null){
            tail = tail.next;
        }
        //Traversing backward
        System.out.println("Backward Traversal");
        // traversalBackward(tail);

        //inserting at the beginning
        h1 = insertAtTheBeginning(h1, 0);
        // traversalForward(h1);

        //inserting at the end
        h1 = insertAtTheEnd(h1, 100);
        traversalForward(h1);
    }

   
}
