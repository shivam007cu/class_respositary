import java.util.*;
class Afbauuu{
    Node root;
    class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            left = right = null;
        }
    }
        Afbauuu(){
            root = null;
        }
        void insert(int data){
            root = insertRec(root,data);
        }
        Node insertRec(Node root, int data){
            if(root == null){
                root = new Node(data);
                return root;
            }
            else if(data < root.data){
                root.left = insertRec(root.left,data);
            }
            else if(data > root.data){
                root.right = insertRec(root.right,data);
            }
            return root;
        }
        public int height(Node root){
            if(root == null){
                return 0;
            }
            else{
            int lh = height(root.left); 
            int rh = height(root.right);
            if(lh > rh){
                return lh+1;
            } else{
                return rh+1;
            }
        }
    }
     void afbauuu()  { 
           afbauuuRec(root); 
         } 
       void afbauuuRec(Node root) { 
        if (root != null) { 
            System.out.print(" "+root.data); 
            afbauuuRec(root.left);
           afbauuuRec(root.right);  
        } 
    } 
    
    public static void main(String args[]){
       Afbauuu tree = new Afbauuu();
        tree.insert(40);
        tree.insert(30);
        tree.insert(20);
        tree.insert(35);
        tree.insert(70);
        tree.insert(50);
        tree.insert(80);
        
        tree.afbauuu();
    }
}
        