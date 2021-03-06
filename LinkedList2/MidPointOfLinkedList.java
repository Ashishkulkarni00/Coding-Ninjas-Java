package LinkedList2;

public class MidPointOfLinkedList {

	public static int printMiddel(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> slow = head, fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}

}
