

/*class Tree{
int data;
    Tree left;
    Tree right;
    Tree(int d){
        data=d;
        left=null;
        right=null;
    }
}

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/


class LinkedListToBinaryTree
{
    //Function to make binary tree from linked list.
    public static Tree convert(Node head, Tree node) {
        // add code here.}
        ArrayList<Integer> list = new ArrayList<>();
        while(head != null){
            list.add(head.data);
            head = head.next;
        }
        
        node = formTree(list,list.size(),0,node);
        return node;
    }
    public static Tree formTree(ArrayList<Integer> list,int n,int i,Tree root){
        
        if (i >= n) {
            return null;
        }
        
        root = new Tree(list.get(i));
        
        root.left = formTree(list,n, 2 * i + 1,root);
        root.right = formTree(list,n, 2 * i + 2,root);
        
        return root;
    }
}  
