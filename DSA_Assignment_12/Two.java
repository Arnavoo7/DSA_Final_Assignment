class LinkedListNode  {
    int val;
    LinkedListNode  next;

    public LinkedListNode (int val) {
        this.val = val;
    }
}


public class Two{
    public static boolean hasLoop(LinkedListNode  head) {
        LinkedListNode  slowPtr = head;
        LinkedListNode  fastPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;

            if (slowPtr == fastPtr) {
                return true; // Loop detected
            }
        }

        return false; // No loop found
    }

    public static void main(String[] args) {
        LinkedListNode  head = new LinkedListNode (1);
        head.next = new LinkedListNode (8);
        head.next.next = new LinkedListNode (3);
        head.next.next.next = new LinkedListNode (4);

        // Creating a loop by connecting the tail to the second node
        head.next.next.next.next = head.next;

        boolean hasLoop = hasLoop(head);
        System.out.println("Does the linked list have a loop? " + hasLoop);
    }
}