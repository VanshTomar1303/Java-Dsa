package queue;

public class QueueWithArray {
    static class Queue{
        static int[] arr;
        static int size;
        static int rear = -1;
        public Queue(int n){
            arr = new int[n];
            size = n;
        }
        public static boolean isEmpty(){
            return rear == -1;
        }
        // enque
        public static void add(int num){
            if(rear == size-1){
                System.out.println("Full Queue");
                return;
            }
            rear++;
            arr[rear]=num;
        }
        //dequeue
        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            int front = arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }

            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);

        while (!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.remove();
        }
    }
}
