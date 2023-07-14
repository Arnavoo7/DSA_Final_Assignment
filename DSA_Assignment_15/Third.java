import java.util.*;

class Third{
    Queue<Integer> q1;
    Queue<Integer> q2;

    public Third() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int value) {
        // Add the new element to the empty queue
        q2.add(value);

        // Move all elements from the main queue (q1) to the temporary queue (q2)
        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }

        // Swap the references of q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        if (q1.isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }

        // Remove and return the top element from the main queue (q1)
        return q1.poll();
    }

    public static void main(String[] args) {
        Third stack = new Third();

        stack.push(2);
        stack.push(3);
        System.out.print(stack.pop() + " ");
        stack.push(4);
        System.out.print(stack.pop());
    }
}


