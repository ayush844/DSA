public class BinaryTreeArray {

    String[] arr;
    int lastUsedIndex;

    public BinaryTreeArray(int size){
        arr = new String[size+1];
        lastUsedIndex = 0;
        System.out.println("blank tree of size " + size + " has been created");
    }


    Boolean isFull(){
        return (arr.length-1 == lastUsedIndex);
    }

    //insert
    void insert(String value){
        if (!isFull()){
            arr[lastUsedIndex+1] = value;
            lastUsedIndex++;
            System.out.println("value " + value + " is added to the tree");
        }else{
            System.out.println("tree is already full");
        }
    }


    //preorder traversal
    void preOrderTraversal(int root){
        if (root > lastUsedIndex){
            return;
        }
        System.out.print(arr[root] + "  ");
        preOrderTraversal(2*root);
        preOrderTraversal(2*root+1);
    }


    //post order traversal
    void postOrderTraversal(int root){
        if (root > lastUsedIndex){
            return;
        }
        postOrderTraversal(2*root);
        postOrderTraversal(2*root+1);
        System.out.print(arr[root] + "  ");
    }


    //inOrder traversal
    void inOrderTraversal(int root){
        if (root > lastUsedIndex){
            return;
        }
        inOrderTraversal(2*root);
        System.out.print(arr[root] + "  ");
        inOrderTraversal(2*root+1);
    }

    //levelOrderTraversal
    void levelOrderTraversal(){
        for (int i = 1; i <= lastUsedIndex; i++){
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }


    //searching
    int search(String value){
        for(int i = 1; i <= lastUsedIndex; i++){
            if (arr[i] == value){
                System.out.println("value found at index " + i);
                return i;
            }
        }
        System.out.println("value not found in the tree");
        return -1;
    }


    void deleteNode(String value){
        int i;
        Boolean found = false;
        for(i = 1; i <= lastUsedIndex; i++){
            if (arr[i] == value){
                found = true;
                break;
            }
        }

        if (!found){
            System.out.println("value is not present in the tree");
            return;
        }

        arr[i] = arr[lastUsedIndex];
        lastUsedIndex--;
        System.out.println("value is deleted successfully");
    }


    //delete binary tree
    void deleteBT(){
        try {
            arr = null;
            System.out.println("tree deleted successfully");
        }catch (Exception e){
            System.out.println("there was an error deleting the tree");
        }
    }





}
