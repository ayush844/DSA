public class SinglyLinkedList {

    public Node head;
    public Node tail;
    public int size;


    //creating a linked list
    public Node createSinglyLinkedList(int value){
        head = new Node();

        Node node = new Node();

        node.next = null;
        node.value = value;

        head = node;
        tail = node;

        size = 1;

        return head;

    }

    //inserting value in linked list
    public void insertSinglyLinkedList(int nodeValue, int location){

        Node node = new Node();
        node.value = nodeValue;

        if (head == null){
            createSinglyLinkedList(nodeValue);
            return;
        }

        if (location == 0) {

            node.next = head;
            head = node;

        } else if (location >= size) {

            node.next = null;
            tail.next = node;
            tail = node;

        }else{
            int index = 0;
            Node tempNode = head;

            while (index < location - 1){
                tempNode = tempNode.next;
                index++;
            }

            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }

        size++;
    }

    //traversal in linked list

    public void traversalInLinkedList(){

        if (head == null){
            System.out.println("the linked list does not exist");
        }else{

            Node node = head;

            for (int i = 0; i < size; i++){
                System.out.print(node.value);
                if (i < size - 1){
                    System.out.print(" --> ");
                }
                node = node.next;
            }
        }

        System.out.println();

    }

    //searchInSinglyLinkedList

    public boolean searchSiglyLinkedList(int nodeValue){

        if (head == null){
            System.out.println("linked list don't exist");
            return false;
        }else{

            Node tempNode = head;

            for (int i = 0; i < size; i++){
                if (tempNode.value == nodeValue){
                    System.out.println("the value is found at index " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }

            System.out.println("value not found");
            return false;

        }

    }


    //delete in singly linked list
    public void deleteSinglyLinkedList(int location){

        if (head == null){
            System.out.println("the linked is not present");
        }else{

            Node tempNode = head;

            if (location == 0){
                if (size == 1){
                    head = null;
                    tail = null;
                }else{
                    head = tempNode.next;
                }
            } else if (location >= size - 1) {

                if (size == 1){
                    head = null;
                    tail = null;
                }else{
                    for (int i = 0; i < size - 2; i++){
                        tempNode = tempNode.next;
                    }
                    tempNode.next = null;
                    tail = tempNode;
                }
            }else {
                for (int i = 0; i < location - 1; i++){
                    tempNode = tempNode.next;
                }
                tempNode.next = tempNode.next.next;
            }

            size--;

        }

    }


    //delete entire linked list

    public void deleteEntireLinkedList(){
        head = null;
        tail = null;
        System.out.println("the entire linked list is deleted");
    }


}
