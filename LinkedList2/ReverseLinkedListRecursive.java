package LinkedList2;

public class ReverseLinkedListRecursive {

	public static LinkedListNode<Integer> reverse_R(LinkedListNode<Integer> head) {
		if (head == null)
			return head;
		if (head.next == null)
			return head;
		LinkedListNode<Integer> tail = head.next;
		LinkedListNode<Integer> smallhead = reverse_R(head.next);
		tail.next = head;
		head.next = null;
		return smallhead;

	}

}
