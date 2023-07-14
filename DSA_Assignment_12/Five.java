class ListNode6 {
    int val;
    ListNode next;

    public ListNode6(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Five {
    public static void removeLoop(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        ListNode slowPtr = head;
        ListNode fastPtr = head;
        ListNode loopNode = null;

        // Detect the loop using Floyd's cycle detection algorithm
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;

            if (slowPtr == fastPtr) {
                loopNode = slowPtr;
                break;
            }
        }

        // If a loop is found, remove it
        if (loopNode != null) {
            // Move one pointer to the head and keep the other at the meeting point
            ListNode ptr1 = head;
            ListNode ptr2 = loopNode;

            // Handle the case where the loop starts at the head of the linked list
            if (ptr1 == ptr2) {
                while (ptr2.next != ptr1) {
                    ptr2 = ptr2.next;
                }
            } else {
                while (ptr1.next != ptr2.next) {
                    ptr1 = ptr1.next;
                    ptr2 = ptr2.next;
                }
            }

            // Set the next pointer of the last node in the loop to null
            ptr2.next = null;
        }
    }

    public static void printLinkedList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(8);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        System.out.println("Original linked list:");
        printLinkedList(head);

        removeLoop(head);


        // Print the first value of the modified linked list
        if (head != null) {
            System.out.println("First value of modified linked list: " + head.val);
        }
    }
}
