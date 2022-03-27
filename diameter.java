public class diameter {
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

        System.out.println("calculate diameter");

       int ans= getDia(root);
       System.out.println(ans + " is the dia of this tree");
        
    }

    static void inorder(Node root){
        if(root==null){
            return ;
        }

        inorder(root.left);
        System.out.print(root.data+ " ");
        inorder(root.right);
    }


    public static int getDia(Node root){
        if(root==null){
            return 0;
        }

        int lheight=height(root.left);
        int rheight=height(root.right);

        int rdia=getDia(root.right);
        int ldia=getDia(root.left);

        return Math.max(lheight+rheight+1,Math.max(ldia,rdia));
    }

    public static int height(Node root){
        if(root==null){
            return 0;
        }

        return 1 + Math.max(height(root.left),height(root.right));
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




}


