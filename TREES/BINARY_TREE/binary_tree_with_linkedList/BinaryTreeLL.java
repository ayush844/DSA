import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {

    BinaryNode root;

    public BinaryTreeLL(){
        this.root = null;
    }


    //preorder traversal
    void preOrderTraversal(BinaryNode node){
        if (node == null){
            return;
        }
        System.out.print(node.value + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }


    //inorder traversal
    void inOrderTraversal(BinaryNode node){
        if (node == null){
            return;
        }

        inOrderTraversal(node.left);
        System.out.print(node.value + " ");
        inOrderTraversal(node.right);
    }

    //postorder traversal
    void postOrderTraversal(BinaryNode node){
        if (node == null){
            return;
        }

        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.value + " ");
    }


    //levelOrder traversal
    void levelOrderTraversal(){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);

        while (!queue.isEmpty()){

            BinaryNode presentNode = queue.remove();

            System.out.print(presentNode.value + " ");

            if (presentNode.left != null){
                queue.add(presentNode.left);
            }

            if (presentNode.right != null){
                queue.add(presentNode.right);
            }
        }

        System.out.println();
    }


    //search method in tree

    public void searchTree(String value){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);

        while (!queue.isEmpty()){

            BinaryNode presentNode = queue.remove();
            if (presentNode.value == value){
                System.out.println("value "+ value + " is found in the tree");
                return;
            }
            if (presentNode.left!=null){
                queue.add(presentNode.left);
            }
            if (presentNode.right != null){
                queue.add(presentNode.right);
            }
        }

        System.out.println("value "+ value + " is not found in the tree");
    }



    // inserting a node

    public void insertNode(String value){

        BinaryNode node = new BinaryNode();
        node.value = value;

        if (root == null){
            root = node;
            System.out.println("inserted new node at root");
            return;
        }


        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);


        while (!queue.isEmpty()){

            BinaryNode presentNode = queue.remove();

            if (presentNode.left == null){
                presentNode.left = node;
                System.out.println("node added as a children on left of a parent node");
                return;
            }else if(presentNode.right == null){
                presentNode.right = node;
                System.out.println("node added as a children on right of a parent node");
                return;
            }else{
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }

        }

    }


    //get deepest node

    public BinaryNode getDeepestNode(){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode presentNode = null;
        while (!queue.isEmpty()){

            presentNode = queue.remove();

            if (presentNode.left != null){
                queue.add(presentNode.left);
            }

            if (presentNode.right != null){
                queue.add(presentNode.right);
            }
        }
        return presentNode;
    }


    //delete deepest node

    public void deleteDeepestNode(){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode previousNode, presentNode = null;
        while (!queue.isEmpty()){
            previousNode = presentNode;
            presentNode = queue.remove();
            if (presentNode.left == null) {
                previousNode.right = null;
                return;
            }else if (presentNode.right == null){
                presentNode.left = null;
                return;
            }else{
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }
        }
    }


    //delete given node
    void deleteGivenNode(String value){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);

        while (!queue.isEmpty()){

            BinaryNode presentNode = queue.remove();
            if (presentNode.value == value){
                presentNode.value = getDeepestNode().value;
                deleteDeepestNode();
                System.out.println("node is deleted successfully");
                return;
            }
            if (presentNode.left!=null){
                queue.add(presentNode.left);
            }
            if (presentNode.right != null){
                queue.add(presentNode.right);
            }
        }

        System.out.println("the node does not exist in this binary tree");

    }



    //delete binary tree

    void deleteBinaryTree(){
        root = null;
        System.out.println("the binary tree is deleted successfully");
    }




}
