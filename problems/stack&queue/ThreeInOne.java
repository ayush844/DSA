 public class ThreeInOne {
        private int numberOfStacks = 3;
        private int stackCapacity;
        private int[] values;
        public int[] sizes;

        public ThreeInOne(int stackSize) {
            stackCapacity = stackSize;
            values = new int[numberOfStacks * stackCapacity];
            sizes = new int[numberOfStacks];
        }

        // isFull
        public boolean isFull(int stackNum) {
            if (sizes[stackNum] == stackCapacity){
                return true;
            }else{
                return false;
            }
        }

        // isEmpty
        public boolean isEmpty(int stackNum) {
            if (sizes[stackNum] == 0){
                return true;
            }else{
                return false;
            }
        }


        // indexOfTop - this is helper method for push, pop and peek methods
        private int indexOfTop(int stackNum) {

            if (stackNum == 0 && isEmpty(0)){
                return 0;
            }

            int offset = stackNum * stackCapacity;
            int index = offset + sizes[stackNum];
            return index;
        }


        // push
        public void push(int stackNum, int value) {
            if (isFull(stackNum)){
                System.out.println("the given stack number is already full");
            }else{
                int topIndex = indexOfTop(stackNum);
                values[topIndex] = value;
                sizes[stackNum]++;
            }
        }

        // pop
        public int pop(int stackNum) {
            if (isEmpty(stackNum)){
                System.out.println("The stack is empty");
                return -1;
            }else{
                int topIndex = indexOfTop(stackNum);
                int value = values[topIndex];
                values[topIndex] = 0;
                sizes[stackNum]--;
                return value;
            }
        }

        // peek

        public int peek(int stackNum) {
            if (isEmpty(stackNum)){
                System.out.println("The stack is empty");
                return -1;
            }else{
                int topIndex = indexOfTop(stackNum);
                int value = values[topIndex];
                return value;
            }
        }

}
