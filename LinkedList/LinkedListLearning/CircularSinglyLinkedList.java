public class CircularSinglyLinkedList {

    public Node head;
    public Node tail;
    public int size;


    //creating circular singly linked list
    public Node createCircularSinglyLinkedList(int nodeValue){
        head = new Node();

        Node node = new Node();

        node.value = nodeValue;
        node.next = node;

        head = node;
        tail = node;

        size = 1;

        return head;

    }


    //inserting into circular singly linked list

    public void insertInCircularSinglyLinkedList(int nodeValue, int location){
        if (head == null){
            createCircularSinglyLinkedList(nodeValue);
            return;
        }else{

            Node node = new Node();
            node.value = nodeValue;

            if (location == 0){
                node.next = head;
                head = node;
                tail.next = node;
            } else if (location > size - 1) {
                tail.next = node;
                node.next = node;
                tail = node;
            }else{
                Node tempNode = head;
                for (int i = 0; i < location - 1; i++){
                    tempNode = tempNode.next;
                }
                node.next = tempNode.next;
                tempNode.next = node;
            }

            size++;
        }

    }

    //traversal into circular singly linked list

    public void traversalInCircularSinglyLinkedList(){
        if (head == null){
            System.out.println("linked list don't exist");
        }else{

            Node tempNode = head;

            for (int i = 0; i < size; i++){
                System.out.print(tempNode.value);
                if (i < size-1){
                    System.out.print(" --> ");
                }
                tempNode = tempNode.next;
            }

            System.out.println();
        }
    }


    //searching in circular singly linked list

    public boolean searchInLinkedList(int nodeValue){
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
            return false;
        }
    }


    // delete in circular singly linked list
    public void deletInCircularSinglyLinkedList(int location){
        if (head == null){
            System.out.println("the linked list don't exist");
            return;
        }else {
            if (location == 0){
                if (size == 1){
                    head = null;
                    tail = null;
                }else{
                    head = head.next;
                    tail.next = head;
                }
            } else if (location >= size-1) {
                if (size == 1){
                    head = null;
                    tail = null;
                }else{
                    Node tempNode = head;

                    for (int i = 0; i < size - 2; i++){
                        tempNode = tempNode.next;
                    }

                    tempNode.next = head;
                    tail = tempNode;
                }
            }else {
                Node tempNode = head;

                for (int i = 0; i < location - 1; i++ ){
                    tempNode = tempNode.next;
                }
                tempNode.next = tempNode.next.next;
            }

            size--;
        }
    }


    //delete entire circularSinglyLinkedList

    public void deleteEntireCircularSinglyLinkedList(){
        if (head == null){
            System.out.println("the linked list don't exist");
        }else{
            head = null;
            tail.next = null;
            tail= null;
            size = 0;
            System.out.println("the entire list is deleted");
        }
    }



}
