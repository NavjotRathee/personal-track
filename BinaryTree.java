import java.util.*;

class Node {
    int data;
    Node left, right;
 
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 
class BinaryTree {
 
    
    Node buildTree()
    {
        int data;
        Scanner s = new Scanner(System.in);

        data = s.nextInt();

        if (data == -1)
            return null;
 
       
        Node tNode = new Node(data);

        tNode.left = buildTree();
        tNode.right = buildTree();
 
        return tNode;
    }
    
    void printPreorder(Node node)
    {
        if (node == null) {
            return;
        }
 

        System.out.print(node.data + " ");
        
        printPreorder(node.left);
 
        printPreorder(node.right);
    }
 
      int editPrint(Node root){
          if(root==null){
              return 0;
          }
        //if(root.left==null && root.right==null){
            //return 0;

        //}
        
            root.data+=editPrint(root.left)+ (editPrint(root.right));
           // editPrint(root.left);
            //editPrint(root.right);
            return root.data;
        
    }
     void printLeaf(Node root){
        if(root==null){
            return;
        }
        if(root.left == null && root.right==null){
            System.out.print(root.data) ;
        }
        else{
            printLeaf(root.left);
            printLeaf(root.right);
            return;
        }
        
    }


    public static void main(String args[])
    {
        BinaryTree tree = new BinaryTree();
        
        Node root = tree.buildTree();
 
        System.out.println("The treeLeaves given by you are: ");
        tree.printPreorder(root);
        System.out.println();
       // tree.printLeaf(root);
        tree.editPrint(root);
        tree.printPreorder(root);
    }
}

// 10 11 -1 13 14 -1 -1 -1 12 -1 15 16 -1 -1 17 -1 -1