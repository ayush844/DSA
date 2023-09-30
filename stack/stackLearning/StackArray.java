public class StackArray {

    int[] arr;
    int topOfStack;

    public StackArray(int size){

        this.arr = new int[size];

        this.topOfStack = -1;

        System.out.println("the stack is created with size of " + size );

    }


    //isEmpty()

    public boolean isEmpty(){

        if (topOfStack == -1){
            return true;
        }else{
            return false;
        }

    }



    //isFull()

    public boolean isFull(){

        if (topOfStack == arr.length - 1){
            return true;
        }else {
            return false;
        }

    }



    //push

    public void push(int value){

        if (isFull()){
            System.out.println("the stack is already full");
        }else {
            arr[topOfStack + 1] = value;
            topOfStack++;
            System.out.println("the value " + value + " is inserted at index " + topOfStack);
        }

    }


    //pop

    public int pop(){
        if (isEmpty()){
            System.out.println("the stack is empty");
            return -1;
        }else {
            int topStack = arr[topOfStack];
            topOfStack--;
            return topStack;
        }
    }


    //peek

    public int peek(){
        if(isEmpty()){
            System.out.println("the stack is empty");
            return -1;
        }else {
            return arr[topOfStack];
        }
    }


    //delete

    public void deleteStack(){
        arr = null;
        System.out.println("the stack is successfully deleted");
    }



}
