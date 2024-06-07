package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Node {
    int data;
    Node left;
    Node right;
    public Node(int key){
        data = key;
    }

    public static void preorder(Node root){
          if(root == null)
          return;

          System.out.println(root.data + " ");
          preorder(root.left);
          preorder(root.right);
        
    }

    public static void inorder(Node root){
        if(root == null)
        return;

        inorder(root.left);
        System.out.println(root.data + " ");
        inorder(root.right);
    }

    public static void postOrder(Node root){
        if(root == null)
          return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data + " ");
    }

    public static void  iterativeInorder(Node root){
        Stack<Node> stack = new Stack<>();
        Node current = root;

        while(current != null || !stack.isEmpty()){
            stack.push(current);
            current = current.left;
        }

        current = stack.pop();
        System.out.print(current.data + " ");

        current = current.right;
    }

    public static void preOrderIterative(Node root){
        if(root == null){
            return;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            Node current = stack.pop();
            System.out.print(current.data + " ");

            if(current.right != null){
                stack.push(current.right);
            }
            if(current.left != null){
                stack.push(current.left);
            }
        }
    }

    public static void postOrderIterative(Node root){
        if(root == null){
            return;
        }

        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();

        s1.push(root);

        while(!s1.isEmpty()){
            Node node = s1.pop();
            s2.push(node);

            if(node.left != null){
                s1.push(node.left);
            }
            if(node.right != null){
                s1.push(node.right);
            }

            while(!s2.isEmpty()){
                Node node2 = s2.pop();
                System.out.print(node.data + " ");

            }
        }
    }

    //Level Order Traversal
    public static void levelOrderTraversal(Node root){
        if(root == null)
        return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            Node current = queue.poll();
            System.out.print(current.data + " ");

            if(current.left != null){
                queue.add(current.left);
            }
            if(current.right != null){
                queue.add(current.right);
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(5);

        preorder(root);
    }
}
