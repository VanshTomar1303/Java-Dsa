package queue;

public class CircularQueueUsingArray {
    static class Queue{
        static int[] arr;
        static int size;
        static int rear = -1,front = -1;
        public Queue(int n){
            arr = new int[n];
            size = n;
        }
        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }
        public static boolean isFull(){
            return (rear+1)%size == front;
        }
        // enque
        public static void add(int num){
            if(isFull()){
                System.out.println("Full Queue");
                return;
            }
            if(front==-1){
                front=0;
            }
            rear = (rear+1)%size;
            arr[rear]=num;
        }
        //dequeue
        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            int result = arr[front];
            if(rear==front){
                rear = front = -1;
            }else{
                front = (front+1) % size;
            }
            return result;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }

            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);


        while (!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.remove();
        }
    }
}
