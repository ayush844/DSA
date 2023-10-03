public class Main {
    public static void main(String[] args) {

        LinearQueueArray newQueue = new LinearQueueArray(3);

        System.out.println(newQueue.isFull());

        System.out.println(newQueue.isEmpty());

        newQueue.enQueue(23);

        newQueue.enQueue(34);

        newQueue.enQueue(45);

        newQueue.enQueue(56);

//        int result1 = newQueue.deQueue();
//        System.out.println(result1);
//
//        int result2 = newQueue.deQueue();
//        System.out.println(result2);

        System.out.println(newQueue.peek());


        newQueue.deleteQueue();



    }
}