public class LinearQueueArray {

    int[] arr;
    int beginningOfQueue;
    int topOfQueue;


    public LinearQueueArray(int size){

        this.arr = new int[size];

        this.topOfQueue = -1;

        this.beginningOfQueue = -1;


        System.out.println("queue of size " + size + " build here...");

    }


    //isFull() method


    public boolean isFull(){
        if (topOfQueue == arr.length - 1){
            return true;
        }else{
            return false;
        }
    }



    //isEmpty

    public boolean isEmpty(){
        if ((beginningOfQueue == -1) || (beginningOfQueue == arr.length)){
            return true;
        }else{
            return false;
        }
    }



    //enqueue

    public void enQueue(int value){
        if (isFull()){

            System.out.println("the queue is full");

        } else if (isEmpty()) {

            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("successfully inserted " + value + " inside the queue");
            
        }else{

            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("successfully inserted " + value + " inside the queue");

        }
    }


    //dequeue

    public int deQueue(){
        if (isEmpty()){
            System.out.println("the queue is empty");
            return -1;
        }else{

            int dequeueValue = arr[beginningOfQueue];
            beginningOfQueue++;

            if (beginningOfQueue > topOfQueue){
                topOfQueue = -1;
                beginningOfQueue = -1;
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



    //delete queue

    public void deleteQueue(){

        arr = null;
        System.out.println("the queue is successfully deleted");

    }








}
