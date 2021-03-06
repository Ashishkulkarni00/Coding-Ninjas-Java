package LinkedList1;

class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;
	public LinkedListNode(T data) {
		this.data = data;
		this.next = null;
	}
}

public class AppendLastNNodesToFirst {

	public static LinkedListNode<Integer> append(LinkedListNode<Integer> root, int n) {

		LinkedListNode<Integer> temp = root;
		int count = 0;
		while (temp != null) {
			temp = temp.next;
			count++;
		}
		int newcount = count - n;
		count = 0;
		LinkedListNode<Integer> temp1 = root;
		while (count < newcount - 1) {
			temp1 = temp1.next;
			count++;
		}
		LinkedListNode<Integer> temp2 = temp1.next;
		LinkedListNode<Integer> temp3 = temp1.next;
		while (temp2.next != null) {
			temp2 = temp2.next;
		}
		temp2.next = root;
		temp1.next = null;
		return temp3;

	}

}
