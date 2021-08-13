package LinkedList2;

public class FindANodeInLinkedList {

	public static int indexOfNRec(LinkedListNode<Integer> head, int n) {
		return helper(head, 0, n);
	}

	public static int helper(LinkedListNode<Integer> head, int index, int n) {
		if (head == null)
			return -1;
		if (head.data == n)
			return index;
		int ans = helper(head.next, index + 1, n);
		return ans;
	}

}
