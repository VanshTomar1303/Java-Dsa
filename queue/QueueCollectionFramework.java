package queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueCollectionFramework {
    public static void main(String[] args) {
        // Queue is an interface not a class.
        // It can be implemented with the help of these :-
        // 1.LinkedList
        // 2.ArrayDeque
        // Ques :- What are the difference between LinkedList and ArrayDeque for using Queue?

        //Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
