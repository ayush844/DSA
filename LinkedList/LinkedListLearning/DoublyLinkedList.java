public class DoublyLinkedList {

    public DoublyNode head;
    public DoublyNode tail;
    public int size;



    public DoublyNode createDoublyLinkedList(int nodeValue){

        head = new DoublyNode();

        DoublyNode node = new DoublyNode();

        node.value = nodeValue;
        node.next = null;
        node.prev = null;

        head = node;
        tail = node;

        size = 1;

        return head;

    }


    //inserting a value in linked list

    public void insertInDoublyLinkedList(int nodeValue, int location){
        if (head == null){
            createDoublyLinkedList(nodeValue);
        }else{

            DoublyNode node = new DoublyNode();
            node.value = nodeValue;

            if (location == 0){
                head.prev = node;
                node.next = head;
                node.prev = null;
                head = node;
            } else if (location >= size) {
                tail.next = node;
                node.prev = tail;
                node.next = null;
                tail = node;
            }else{

                DoublyNode tempNode = head;

                for (int i = 0; i < location-1; i++){
                    tempNode = tempNode.next;
                }

                node.next = tempNode.next;
                tempNode.next = node;
                node.prev = tempNode;
                node.next.prev = node;
            }

            size++;
        }
    }


    //traversal in linked list
    public void traversalInLinkedList(){
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

    //reverse traversal in linked list
    public void reverseTraversalInLinkedList(){
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


    //searching in doubly linked list
    public boolean searchInDoublyLinkedList(int nodeValue){
        if (head == null){
            System.out.println("The linked list don't exist");
            return false;
        }else{
            DoublyNode tempNode = head;

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

    //delete a node in doubly linked list
    public void deletDoublyLinkedList(int location){
        if (head == null){
            System.out.println("the doubly linked list don't exist");
        }else{
            if (location == 0){
                if (size == 1){
                    head = null;
                    tail = null;
                }else{
                    head = head.next;
                    head.prev = null;
                }
            }else if (location >= size - 1){
                if (size == 1){
                    head = null;
                    tail = null;
                }else{
                    tail = tail.prev;
                    tail.next = null;
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



    //delete entire linked list

    public void deleteEntireLinkedList(){
        if (head == null){
            System.out.println("the linked list don't exist");
        }else{
            DoublyNode tempNode = head;

            for (int i = 0; i < size; i++){
                tempNode.prev = null;
                tempNode = tempNode.next;
            }

            head = null;
            tail = null;

            size = 0;
            System.out.println("the entire linked list is deleted");

        }
    }




}
