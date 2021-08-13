package LinkedList1;

public class PrintReverseLinkedList {

	public static void printReverseRecursive(LinkedListNode<Integer> root) {
		if (root == null)
			return;
		printReverseRecursive(root.next);
		System.out.print(root.data + " ");

	}

}
