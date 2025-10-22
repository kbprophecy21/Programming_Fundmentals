import java.util.Scanner;

/**
 * Driver: KyleBrewerAssignment2C
 * - Read 10 integers from user
 * - Populate ArrayList, LinkedList, Stack, Queue
 * - Demonstrate ALL required methods + custom outputs
 */
public class KyleBrewerAssignment2C {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < input.length; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            input[i] = sc.nextInt();
        }

        // ==== Create structures ====
        KyleBrewerArrayList<Integer> arr = new KyleBrewerArrayList<>();
        KyleBrewerLinkedList<Integer> link = new KyleBrewerLinkedList<>();
        KyleBrewerStack<Integer> stack = new KyleBrewerStack<>();
        KyleBrewerQueue<Integer> queue = new KyleBrewerQueue<>();

        // ==== Populate using add ====
        for (int v : input) {
            // TODO: demonstrate various methods:
            // - For lists: add(v), add(index, v), get, set, indexOf, lastIndexOf, remove, size, isEmpty, contains
            // - For stack: push, peek, pop
            // - For queue: enqueue, peek, dequeue
            throw new UnsupportedOperationException("Populate + demos: TODO");
        }

        // ==== Sample demo calls (uncomment after implementing methods) ====
        // arr.KyleBrewerOutput();   // prints ARRAYLIST=...
        // link.KyleBrewerOutput();  // prints LINKEDLIST=...
        // stack.KyleBrewerOutput(); // prints STACK=...
        // queue.KyleBrewerOutput(); // prints QUEUE=...

        sc.close();
    }
}
