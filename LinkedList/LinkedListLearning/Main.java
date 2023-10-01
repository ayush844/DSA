public class Main {
    public static void main(String[] args) {

        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();

        cdll.createCircularDoublyLinkedList(69);

        cdll.insertInCircularDoublyLinkedList(23, 0);
        cdll.insertInCircularDoublyLinkedList(45, 6);
        cdll.insertInCircularDoublyLinkedList(54, 2);
        cdll.insertInCircularDoublyLinkedList(72, 1);
        cdll.insertInCircularDoublyLinkedList(89, 2);


        cdll.traversalInDoublyCircularLinkedList();

        cdll.reverseTraversalInDoublyCircularLinkedList();

        System.out.println(cdll.size);

        cdll.deleteANodeInCircularDoublyLinkedList(0);

        cdll.traversalInDoublyCircularLinkedList();

        cdll.deleteANodeInCircularDoublyLinkedList(2);

        cdll.traversalInDoublyCircularLinkedList();

        cdll.deleteANodeInCircularDoublyLinkedList(3);

        cdll.traversalInDoublyCircularLinkedList();

        System.out.println(cdll.size);

        cdll.deleteEntireCircularDoublyLinkedList();

        System.out.println(cdll.size);

        cdll.traversalInDoublyCircularLinkedList();
    }
}