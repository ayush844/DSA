public class QueueLinkedList {

    LinkedList list;

    public QueueLinkedList(){
        list = new LinkedList();
        System.out.println("the queue is successfully created");
    }


    //isEmpty
    public boolean isEmpty(){
        if (list.head == null){
            return true;
        }else{
            return false;
        }
    }


    //enqueue
    public void enqueue(int value){
        list.insertInLinkedList(value, list.size);
        System.out.println("value inserted successfully");
    }



    //dequeue
    public int dequeue(){
        int value = -1;
        if (isEmpty()){
            System.out.println("the queue is empty");
        }else{
            value = list.head.value;
            list.deletionOfNode(0);
        }
        return value;
    }



    //peek
    public int peek(){
        int value = -1;
        if (isEmpty()){
            System.out.println("the queue is empty");
        }else{
            value = list.head.value;
        }
        return value;
    }


    //delete
    public void deleteQueue(){
        list.head = null;
        list.tail = null;
        System.out.println("the queue is deleted");
    }







}
