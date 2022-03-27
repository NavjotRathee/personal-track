import java.util.*;

class Main {
    public static void main(String[] args){
        Node root = getTree();
        System.out.println("Printing PreOrder using recursion");
        preOrder(root);
        System.out.println("");
        System.out.println("Printing PreOrder using iteration");
        preOrderIterative(root);
        System.out.println("");
        System.out.println("Printing Inorder");
        inOrder(root);
        System.out.println("");
        System.out.println("Printing PostOrder");
        postOrder(root);
        System.out.println("");
        System.out.println("Printing Level order");
        levelOrder(root);
        System.out.println("");
        System.out.println("Count of leaf nodes " + countLeafNodes(root));
        System.out.println("Height of tree " + findHeight(root));
        System.out.println("Diameter of tree " + findDiameter(root).diameter);
        System.out.println("");
        System.out.println("Printing all the paths and sum ");
        printPathsAndSum(root);
        System.out.println("");
        System.out.println("Printing Zig Zag level order");
        zigZagLevelOrder(root);
        System.out.println("");
        CountResult result = getOddEvenSum(root, 0);
        System.out.println("Even sum paths = " + result.even);
        System.out.println("Odd sum paths = " + result.odd);
    }

    private static Node getTree(){
        Node root = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(5);
        Node node5 = new Node(6);
        Node node6 = new Node(7);
        Node node7 = new Node(8);
        Node node8 = new Node(9);

        root.left = node1;
        root.right = node2;

        node1.left = node3;
        node1.right = node4;

        node2.left = node5;
        node2.right = node6;

        node3.left = node7;
        node3.right = node8;
        return root;
    }

    private static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    private static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

     private static void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    private static void preOrderIterative(Node root){
        if(root == null){
            return;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(root);
        Node curr = null;

        while(!stack.isEmpty()){
            curr = stack.pop();
            System.out.print(curr.data + " ");
            if(curr.right != null){
                stack.push(curr.right);
            }
            if(curr.left != null){
                stack.push(curr.left);
            }
        }

    }

    private static int countLeafNodes(Node root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        return countLeafNodes(root.left) + countLeafNodes(root.right);
    }

    private static int findHeight(Node root){
        if(root == null){
            return 0;
        }

        int leftHt = findHeight(root.left);
        int rightHt = findHeight(root.right);
        return Math.max(leftHt, rightHt) + 1;
    }

    private static Result findDiameter(Node root){
        if(root == null){
            return new Result(0, 0);
        }
        
        Result leftResult = findDiameter(root.left);
        Result rightResult = findDiameter(root.right);

        int maxDiaFromSubTrees = Math.max(leftResult.diameter, rightResult.diameter);
        int diameter = Math.max(maxDiaFromSubTrees, leftResult.ht + rightResult.ht + 1);
        int ht = Math.max(leftResult.ht, rightResult.ht) + 1;

        return new Result(diameter,ht);
    }

    private static void levelOrder(Node root){
        if(root == null){
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while(!queue.isEmpty()){
            Node node = queue.remove();

            if(node == null){
                System.out.println("");
                if(!queue.isEmpty()){
                    queue.add(null);
                }
                continue;
            }

            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }

            System.out.print(node.data + " ");
        }
    }


    private static void printPathsAndSum(Node root){
        ArrayList<Integer> pathList = new ArrayList<>();
        Integer currSum = 0;
        printPathsAndSum(root, pathList, currSum);
    }

    private static void printPathsAndSum(Node root, ArrayList<Integer> pathList, Integer currSum ){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            System.out.print("Sum of path ");
            for(Integer data: pathList){
                System.out.print(data + "->");
            }
            System.out.print(root.data);
            System.out.println(" = " + (currSum + root.data));
            return;
        }
        currSum += root.data;
        pathList.add(root.data);
        printPathsAndSum(root.left, pathList, currSum);
        printPathsAndSum(root.right, pathList, currSum);
        pathList.remove(pathList.size() - 1);
    }


    private static void zigZagLevelOrder(Node root){
        if(root == null){
            return;
        }

        Stack<Node> currStack = new Stack<>();
        Stack<Node> nextLevelStack = new Stack<>();
        boolean rightToLeft = false; 
      
        currStack.push(root);

        while(!currStack.isEmpty()){
            Node node = currStack.pop();

            System.out.print(node.data + " ");
           
            if(rightToLeft){
                if(node.right != null){
                    nextLevelStack.push(node.right);
                }   
                if(node.left != null){
                    nextLevelStack.push(node.left);
                }
            }else{
                if(node.left != null){
                    nextLevelStack.push(node.left);
                }
                if(node.right != null){
                    nextLevelStack.push(node.right);
                }
            }

            if(currStack.isEmpty()){
                rightToLeft = !rightToLeft;

                //swap the stacks
                Stack<Node> temp = new Stack<>();
                temp = currStack;
                currStack = nextLevelStack;
                nextLevelStack = temp;
                
                System.out.println("");
            }

        }
    }

    private static CountResult getOddEvenSum(Node root, Integer currSum){
        if(root == null){
            return new CountResult(0,0);
        }
        if(root.left == null && root.right == null){
            currSum += root.data;
            if(currSum%2 == 0){
                return new CountResult(0,1);
            }
            return new CountResult(1,0);
        }

        CountResult leftResult = getOddEvenSum(root.left, currSum + root.data);
        CountResult rightResult = getOddEvenSum(root.right, currSum + root.data);
        return new CountResult(leftResult.odd + rightResult.odd, leftResult.even + rightResult.even);
    }


}

class CountResult {
    public int odd;
    public int even;

    public CountResult(int odd, int even){
        this.odd = odd;
        this.even = even;
    }
}


class Result {
    public int diameter;
    public int ht;

    public Result(int diameter, int ht){
        this.diameter = diameter;
        this.ht = ht;
    }
}


class Node {
    int data;
    public Node left;
    public Node right;

    public Node(int data){
        this.data = data;
    }
}