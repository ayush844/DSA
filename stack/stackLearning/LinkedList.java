public class LinkedList {

    public Node head;
    public Node tail;
    public int size;


    public Node createSinglyLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;

        return head;
    }


    //insert method linked list
    public void insertInLinkedList(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;

        if (head == null){
            createSinglyLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        }else{
            Node tempNode = head;
            for (int i = 0; i < location-1; i++){
                tempNode = tempNode.next;
            }

            Node nextNode = tempNode.next;

            tempNode.next = node;
            node.next = nextNode;
        }

        size++;
    }



    //singly linked list traversal

    public void traversalSinglyLinkedList(){
        if (head == null){
            System.out.println("SLL does not exist");
        }else{
            Node tempNode = head;
            for (int i = 0; i < size; i++){
                System.out.print(tempNode.value);
                if(i < size-1){
                    System.out.print(" --> ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println();
    }




    //search for a node

    public boolean searchNode(int nodeValue){
        if (head != null){
            Node tempNode = head;
            for (int i = 0; i < size; i++){
                if (tempNode.value == nodeValue){
                    System.out.println("Found the node at location: " + i + "\n");
                    return true;
                }
                tempNode = tempNode.next;
            }

            System.out.println("node not found");
            return false;
        }else {
            System.out.println("the list don't exist");
            return false;
        }
    }




    //deleting a node from singly linked list

    public void deletionOfNode(int location){
        if (head == null){
            System.out.println("SLL does not exist");
            return;
        } else if (location == 0) {
            head = head.next;
            size--;
            if (size == 0){
                tail = null;
            }
        } else if (location >= size-1) {
            Node tempNode = head;
            for (int i = 0; i < size-1; i++){
                tempNode = tempNode.next;
            }
            if (tempNode == head){
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        }else{
            Node tempNode = head;
            for (int i = 0; i < location-1; i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }





    //delete entire singly linked list

    public void deleteSLL(){
        head = null;
        tail = null;
        System.out.println("the sll deleted successfully");
    }













}
