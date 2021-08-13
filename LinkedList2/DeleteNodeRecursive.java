package LinkedList2;

public class DeleteNodeRecursive {

	public static LinkedListNode<Integer> deleteIthNodeRec(LinkedListNode<Integer> head, int i) {
		if (head == null)
			return head;
		if (i == 0)
			return head.next;
		head.next = deleteIthNodeRec(head.next, i - 1);
		return head;

	}

}
