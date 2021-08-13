package LinkedList1;

public class FindANode {

	public static int indexOfNIter(LinkedListNode<Integer> head, int n) {
		if (head == null)
			return -1;
		LinkedListNode<Integer> temp = head;
		int count = 0;
		while (temp != null && temp.data != n) {
			temp = temp.next;
			count++;
		}
		if (temp != null)
			return count;
		else
			return -1;

	}

}
