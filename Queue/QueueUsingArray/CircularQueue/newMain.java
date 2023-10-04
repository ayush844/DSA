public class newMain {

    public static void main(String[] args) {
        CircularQueueArray cqa = new CircularQueueArray(5);

        System.out.println(cqa.isEmpty());

        System.out.println(cqa.isFull());

        cqa.enqueue(12);

        cqa.enqueue(23);

        cqa.enqueue(34);

        cqa.enqueue(45);

        cqa.enqueue(56);

        cqa.enqueue(67);

        System.out.println(cqa.deQueue());

        System.out.println(cqa.deQueue());

        System.out.println(cqa.peek());

        System.out.println(cqa.peek());

        cqa.deleteQueue();


    }

}
