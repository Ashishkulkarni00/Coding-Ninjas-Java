package LinkedList1;

public class PrintIthNode {

	public static void printIth(LinkedListNode<Integer> head, int i) {
		int count = 0;
		LinkedListNode<Integer> temp = head;
		while (count != i && temp != null) {
			temp = temp.next;
			count++;
		}
		if (count == i && temp != null)
			System.out.println(temp.data);
	}

}
