public class Main {
    public static void main(String[] args) {

//        Stack stack = new Stack(5);
//
//        System.out.println(stack.isEmpty());
//
//        System.out.println(stack.isFull());
//
//        stack.push(27);
//
//        stack.push(36);
//
//        stack.push(45);
//
//        stack.push(54);
//
//        stack.push(63);
//
//        System.out.println(stack.pop());
//
//        System.out.println(stack.pop());
//
//        System.out.println(stack.peek());
//
//        System.out.println(stack.peek());





        StackLL sll = new StackLL();


        sll.push(1);

        sll.push(2);

        sll.push(3);

        sll.push(4);

        sll.isEmpty();

        sll.traversal();


        System.out.println(sll.pop());


        sll.traversal();


        System.out.println(sll.peek());


        sll.traversal();

        System.out.println(sll.peek());



        sll.deleteStack();


        sll.traversal();










    }
}