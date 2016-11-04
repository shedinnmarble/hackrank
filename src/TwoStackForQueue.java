import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoStackForQueue {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }

    public static class MyQueue<T> {
        Stack<T> stackNewestOnTop = new Stack<T>();
        Stack<T> stackOldestOnTop = new Stack<T>();
        public void enqueue(T value) { // Push onto newest stack
            //move the first one empty.
                while (!stackNewestOnTop.isEmpty()){
                    //put all the value in second
                    stackOldestOnTop.push(stackNewestOnTop.pop());
                }
                stackOldestOnTop.push(value);
        }
        private void shiftElemenets(){
            if(stackNewestOnTop.isEmpty()){
                while (!stackOldestOnTop.isEmpty()){
                    stackNewestOnTop.push(stackOldestOnTop.pop());
                }
            }
        }
        public T peek() {
                shiftElemenets();
                return stackNewestOnTop.peek();
        }

        public T dequeue() {
            shiftElemenets();
            return stackNewestOnTop.pop();
        }
    }
}
