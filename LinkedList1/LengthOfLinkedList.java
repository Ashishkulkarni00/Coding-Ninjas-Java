package LinkedList1;

public class LengthOfLinkedList {

	public static int length(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> temp = head;
		int count = 1;
		while (temp.next != null) {
			temp = temp.next;
			count++;
		}
		return count;

	}
}
