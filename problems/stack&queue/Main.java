public class Main {
    public static void main(String[] args) {

        ThreeInOne newStack = new ThreeInOne(3);

//        System.out.println(newStack.isEmpty(0));
//        System.out.println(newStack.isEmpty(1));
//
//        System.out.println(newStack.isFull(0));
//        System.out.println(newStack.isFull(1));

        newStack.push(0,23);
        newStack.push(0,33);
        newStack.push(0,45);
        newStack.push(1,45);
        newStack.push(1,73);


//        System.out.println(newStack.isEmpty(0));
//        System.out.println(newStack.isEmpty(1));
//        System.out.println(newStack.isEmpty(2));
//
//        System.out.println(newStack.isFull(0));
        newStack.peek(0);
//        System.out.println(newStack.isFull(0));
//        System.out.println(newStack.isFull(1));



    }
}