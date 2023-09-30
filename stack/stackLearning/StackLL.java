public class StackLL {

    LinkedList linkedList;

    public StackLL(){
        linkedList = new LinkedList();
    }


    //push method

    public void push(int nodeValue){
        linkedList.insertInLinkedList(nodeValue, 0);
        System.out.println("inserted value " + nodeValue + " in stack");
    }


    //isEmpty
    public boolean isEmpty(){
        if (linkedList.head == null){
            System.out.println("the stack is emty");
            return true;
        }else {
            return false;
        }
    }



    public void traversal(){
        linkedList.traversalSinglyLinkedList();
    }


    //pop

    public int pop(){
        int result = -1;
        if (isEmpty()){
            System.out.println("the stack is emty");
        }else {
            result = linkedList.head.value;
            linkedList.deletionOfNode(0);
        }
        return result;
    }



    //peek

    public int peek(){
        if (isEmpty()){
            System.out.println("the stack is empty");
            return -1;
        }else{
            return linkedList.head.value;
        }
    }



    //delete

    public void deleteStack(){
        linkedList.head = null;
        System.out.println("the stack is deleted");
    }







}
