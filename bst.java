import java.nio.file.InvalidPathException;
import java.rmi.registry.RegistryHandler;

public class bst {
    public static void main(String[] args) {
        Node root=null;
        root=insert(root,351);
        root=insert(root,15);
        root=insert(root,351);
        root=insert(root,355);
        root=insert(root,324);
        root=insert(root,33);insert(root,35);
        root=insert(root,1);
        inorder(root);
        System.out.println();
        delete(root,50);
        inorder(root);
        System.out.println();
        delete(root, 351);
        inorder(root);
        
    }

    public static Node insert(Node root,int data){
        Node newNode = new Node(data);
        return insert(root,newNode);
    }

    public static Node insert(Node root,Node newNode){
        if(root==null){
            return newNode;
        }
        if(newNode.data>root.data){
            root.right=insert(root.right,newNode);
        }
        else{
            root.left=insert(root.left,newNode);
        }
        return root;
    }

    public static Node delete(Node root,int data){
        if(root==null){
            System.out.println("dats asdad");
            return root;
        }

        if(root.data<data){
            root.right=delete(root.right,data);
        return root;
        }
        else if(root.data>data){
           root.left= delete(root.left,data);
            return root;
        }

        if(root.left==null && root.right==null){
            root=null;
            return root;
        }
        else if(root.left==null){
            root=root.right;
            return root;
        }
        else if(root.right==null){
            root=root.left;
            return root;
        }
        else{
            Node replace=findmax(root.left);
            root.data=replace.data;
            root.left=delete(root.left,replace.data);
        }
        return root;
    }

    public static Node findmax(Node root){
        if(root==null){
            return null;
        }
        while(root.right!=null){
            root=root.right;
            return root;
        }
        return root;
    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static Node search(Node root,int data){
        if(root==null){
            return null;
        }

        if(root.data==data){
            System.out.print(root.data + " ");
        }

        if(data<root.data){
            search(root.left,data);
        }
        else{
            search(root.right,data);
        }
        return root;
    }


    public static int getDia(Node root){
    if(root==null){
        return null;
    }
    int lheight=height(root.left);
    int rheight=height(root.right);

    int ldia=getDia(root.left);
    int rdia=getDia(root.right);

    



    return Match.max(lheight+rheight+1,Math.max(ldia,rdia));
    }

    public static int height(Node root){
        if(root==null){
            return null;
        }

        return(1+Math.max(height(root.left)),(height(root.right)));
    }
}

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
    }
}


