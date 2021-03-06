package LinkedList2;

public class EvenAfterOddLinkedList {

	public static LinkedListNode<Integer> sortEvenOdd(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> eh = null, et = null, oh = null, ot = null;
		while (head != null) {
			if (head.data % 2 == 0) {
				if (eh == null && et == null) {
					eh = head;
					et = head;

				} else {
					et.next = head;
					et = head;

				}
				head = head.next;
			} else {
				if (oh == null && ot == null) {
					oh = head;
					ot = head;
				} else {
					ot.next = head;
					ot = head;
				}
				head = head.next;
			}
		}
		if (oh != null) {
			ot.next = eh;
		} else {
			return eh;
		}
		if (eh != null) {
			et.next = null;
		}
		return oh;
	}
}
//or

//there can be only one public class in one java file here this solution class must be public because this is another solution to the same problem

class Solution {
	public static LinkedListNode<Integer> sortEvenOdd(LinkedListNode<Integer> head) {
		if (head == null)
			return head;
		if (head.next == null)
			return head;

		LinkedListNode<Integer> smallHead = sortEvenOdd(head.next);
		LinkedListNode<Integer> temp = smallHead;
		if (head.data % 2 == 0) {
			if (temp.data % 2 == 0) {
				head.next = temp;
				return head;
			}
			while (temp.next != null && temp.next.data % 2 != 0) {
				temp = temp.next;
			}
			// if(temp.next==null){
			// head.next=temp;
			// return head;}

			LinkedListNode<Integer> t1 = temp.next;
			temp.next = head;
			head.next = t1;
			return smallHead;
		} else {
			head.next = smallHead;

			return head;
		}
	}
}
