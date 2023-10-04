public class CircularQueueArray {

    int[] arr;
    int beginningOfQueue;
    int topOfQueue;
    int size;



    public CircularQueueArray(int size){

        this.arr = new int[size];
        this.size = size;
        this.beginningOfQueue = -1;
        this.topOfQueue = -1;
        System.out.println("the circular queue is created of size " + size);

    }


    //isEmpty()

    public boolean isEmpty(){
        if (topOfQueue == -1){
            return true;
        }else{
            return false;
        }
    }


    //isFull()

    public boolean isFull(){
        if (topOfQueue + 1 == beginningOfQueue){
            return true;
        } else if (beginningOfQueue == 0 && topOfQueue == size-1) {
            return true;
        }else{
            return false;
        }
    }



    //enQueue

    public void enqueue(int value){

        if (isFull()){
            System.out.println("the circular queue is already full");
        }else if (isEmpty()){
            beginningOfQueue = 0;
            topOfQueue++;
            arr[beginningOfQueue] = value;
            System.out.println("the value " + value + " is inserted inside the queue at starting");
        }else{

            if (topOfQueue == size-1){
                topOfQueue = 0;
            }else{
                topOfQueue++;
            }

            arr[topOfQueue] = value;

            System.out.println("the value " + value + " is inserted inside the queue");

        }

    }



    //deQueue

    public int deQueue(){
        if (isEmpty()){

            System.out.println("the queue is empty");
            return -1;

        }else{

            int dequeueValue = arr[beginningOfQueue];
            arr[beginningOfQueue] = Integer.MIN_VALUE;

            if (beginningOfQueue == topOfQueue){
                topOfQueue = -1;
                beginningOfQueue = -1;
            } else if (beginningOfQueue == size-1) {
                beginningOfQueue = 0;
            }else{
                beginningOfQueue++;
            }

            return dequeueValue;

        }
    }



    //peek

    public int peek(){
        if (isEmpty()){
            System.out.println("the queue is empty");
            return -1;
        }else{
            return arr[beginningOfQueue];
        }
    }



    //deleteQueue

    public void deleteQueue(){
        arr = null;
        System.out.println("The circular queue is deleted successfully");
    }










}
