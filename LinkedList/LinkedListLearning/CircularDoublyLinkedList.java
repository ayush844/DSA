public class CircularDoublyLinkedList {

    public DoublyNode head;
    public DoublyNode tail;
    public int size;

    public DoublyNode createCircularDoublyLinkedList(int nodeValue){
        head = new DoublyNode();
        DoublyNode node = new DoublyNode();

        node.value = nodeValue;
        node.next = node;
        node.prev = node;

        head = node;
        tail = node;

        size = 1;

        return head;
    }


    //insert into circularDoublyLinkedList
    public void insertInCircularDoublyLinkedList(int nodeValue, int location){
        if (head == null){
            createCircularDoublyLinkedList(nodeValue);
        }else{
            DoublyNode node = new DoublyNode();
            node.value = nodeValue;
            if (location == 0){
                head.prev = node;
                node.next = head;
                head = node;
                tail.next = node;
            } else if (location >= size) {
                tail.next = node;
                node.prev = tail;
                node.next = head;
                tail = node;
            }else{
                DoublyNode tempNode = head;
                for (int i = 0; i < location - 1; i++){
                    tempNode = tempNode.next;
                }
                DoublyNode nextNode = tempNode.next;
                nextNode.prev = node;
                tempNode.next = node;
                node.prev = tempNode;
                node.next = nextNode;
            }
            size++;
        }
    }


    //traversal in doubly circular linked list

    public void traversalInDoublyCircularLinkedList(){
        if (head == null){
            System.out.println("the linked list don't exist");
        }else{
            DoublyNode tempNode = head;

            for (int i = 0; i < size; i++){
                System.out.print(tempNode.value);
                if (i < size - 1){
                    System.out.print(" --> ");
                }
                tempNode = tempNode.next;
            }

            System.out.println();

        }
    }

    //reverse traversal in doubly circular linked list

    public void reverseTraversalInDoublyCircularLinkedList(){
        if (head == null){
            System.out.println("the linked list don't exist");
        }else{
            DoublyNode tempNode = tail;

            for (int i = 0; i < size; i++){
                System.out.print(tempNode.value);
                if (i < size - 1){
                    System.out.print(" --> ");
                }
                tempNode = tempNode.prev;
            }
            System.out.println();
        }
    }


    //searching in circular doubly linked list

    public boolean searchCircularDoublyLinkedList(int nodeValue){
        if (head == null){
            System.out.println("the linked list don't exist");
            return false;
        }else{
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++){
                if (tempNode.value == nodeValue){
                    System.out.println("value is found at index " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
            System.out.println("the value is not present inside the index");
            return false;
        }
    }

    //deleting a node in circular doubly linked list

    public void deleteANodeInCircularDoublyLinkedList(int location){
        if (head == null){
            System.out.println("the linked list don't exist");
        }else{
            if (location == 0){
                if (size == 1){
                    head.next = null;
                    head.prev = null;
                    head = null;
                    tail = null;
                }else{
                    tail.next = head.next;
                    head = head.next;
                    head.prev = tail;
                }
            } else if (location >= size-1) {
                if (size == 1){
                    head.next = null;
                    head.prev = null;
                    head = null;
                    tail = null;
                }else{
                    tail = tail.prev;
                    tail.next = head;
                    head.prev = tail;
                }
            }else{
                DoublyNode tempNode = head;
                for (int i = 0; i < location - 1; i++){
                    tempNode = tempNode.next;
                }
                DoublyNode nextNode = tempNode.next;
                tempNode.next = nextNode.next;
                nextNode.next.prev = tempNode;
            }
            size--;
        }
    }


    //deleting an entire circular doublyLinked list

    public void deleteEntireCircularDoublyLinkedList(){
        if (head == null){
            System.out.println("the linked list don't exist");
        }else{
            DoublyNode tempNode = head;
            for (int i = 0 ; i < size; i++){
                tempNode.prev = null;
                tempNode = tempNode.next;
            }
            tail.next = null;
            head = null;
            tail = null;

            System.out.println("the entire linked list is deleted");
        }
        size = 0;
    }



}
