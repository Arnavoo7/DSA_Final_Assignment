import java.util.ArrayDeque;
import java.util.Deque;

class Seventh{
    private Deque<Integer> frontDeque;
    private Deque<Integer> backDeque;

    public Seventh() {
        frontDeque = new ArrayDeque<>();
        backDeque = new ArrayDeque<>();
    }

    public void pushFront(int val) {
        frontDeque.offerFirst(val);
        balanceQueues();
    }

    public void pushMiddle(int val) {
        if (frontDeque.size() > backDeque.size()) {
            backDeque.offerFirst(frontDeque.pollLast());
        }
        frontDeque.offerLast(val);
    }

    public void pushBack(int val) {
        backDeque.offerLast(val);
        balanceQueues();
    }

    public int popFront() {
        if (isEmpty()) {
            return -1;
        }
        int val = frontDeque.isEmpty() ? backDeque.pollFirst() : frontDeque.pollFirst();
        balanceQueues();
        return val;
    }

    public int popMiddle() {
        if (isEmpty()) {
            return -1;
        }
        int val;
        if (frontDeque.size() >= backDeque.size()) {
            val = frontDeque.pollLast();
        } else {
            val = backDeque.pollFirst();
        }
        balanceQueues();
        return val;
    }

    public int popBack() {
        if (isEmpty()) {
            return -1;
        }
        int val = backDeque.isEmpty() ? frontDeque.pollLast() : backDeque.pollLast();
        balanceQueues();
        return val;
    }

    private boolean isEmpty() {
        return frontDeque.isEmpty() && backDeque.isEmpty();
    }

    private void balanceQueues() {
        if (frontDeque.size() > backDeque.size() + 1) {
            backDeque.offerFirst(frontDeque.pollLast());
        } else if (backDeque.size() > frontDeque.size()) {
            frontDeque.offerLast(backDeque.pollFirst());
        }
    }

    public static void main(String[] args) {
        Seventh queue = new Seventh();
        queue.pushFront(1);
        queue.pushBack(2);
        queue.pushMiddle(3);
        System.out.println(queue.popFront());
        System.out.println(queue.popMiddle());
        System.out.println(queue.popBack());
    }
}
