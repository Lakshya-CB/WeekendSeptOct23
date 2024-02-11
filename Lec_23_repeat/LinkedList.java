package Lec_23_repeat;

import java.util.Stack;

public class LinkedList {
	class Node {
		public Node(int ali) {
			// TODO Auto-generated constructor stub
			data = ali;
		}

		int data;
		Node next;
	}

	Node head;

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "=>");
			temp = temp.next;
		}
		System.out.println();
	}

	public int size() {
		int s = 0;
		Node temp = head;
		while (temp != null) {
//			System.out.println(temp.data+"=>");
			s++;
			temp = temp.next;
		}
		return s;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public int getAt(int idx) {
		if (idx < 0 || idx >= size()) {
			throw new RuntimeException("bhai kya deekh rha hai?");
		}
		Node temp = head;
		for (int cnt = 1; cnt <= idx; cnt++) {
			temp = temp.next;
		}
		return temp.data;
	}

	public Node getAtNode(int idx) {
		if (idx < 0 || idx >= size()) {
			throw new RuntimeException("bhai kya deekh rha hai?");
		}
		Node temp = head;
		for (int cnt = 1; cnt <= idx; cnt++) {
			temp = temp.next;
		}
		return temp;
	}

	public int getFirst() {
		if (isEmpty()) {
			throw new RuntimeException("bhai kya deekh rha hai?");
		}
		return head.data;
	}

	public int getLast() {
		if (isEmpty()) {
			throw new RuntimeException("bhai kya deekh rha hai?");
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		return temp.data;
	}

	public void addFirst(int ali) {
		Node nn = new Node(ali);
		nn.next = head;
		head = nn;
	}

	public void addLast(int ali) {
		if (isEmpty()) {
			addFirst(ali);
			return;
		}
		Node nn = new Node(ali);
		Node last = getAtNode(size() - 1);
		last.next = nn;
	}

	public void addAt(int idx, int ali) {
		if (idx < 0 || idx > size()) {
			throw new RuntimeException("bhai kya kar rha hai?");

		}
		if (idx == 0) {
			addFirst(ali);
		} else if (idx == size()) {
			addLast(ali);
		} else {
			Node nn = new Node(ali);
			Node prev = getAtNode(idx - 1);
			Node after = prev.next;
			prev.next = nn;
			nn.next = after;
		}
	}

	public int removeFirst() {
		if (isEmpty()) {
			throw new RuntimeException("bhai kya deekh rha hai?");
		}
		int ans = head.data;
		head = head.next;
		return ans;
	}

	public int removeLast() {
		if (isEmpty()) {
			throw new RuntimeException("bhai kya deekh rha hai?");
		}
		if (size() == 1) {
			return removeFirst();
		}
		Node secondLast = getAtNode(size() - 2);
		int ans = secondLast.next.data;
		secondLast.next = null;
		return ans;
	}

	public int removeAt(int idx) {
		if (idx < 0 || idx >= size()) {
			throw new RuntimeException("bhai kya kar rha hai?");

		}
		if (idx == 0) {
			return removeFirst();
		} else if (idx == size() - 1) {
			return removeLast();
		}
		Node prev = getAtNode(idx - 1);
		Node nn = prev.next;
		Node after = nn.next;
		prev.next = after;
		return nn.data;
	}

	public void rev() {
		Node curr = head;
		Node prev = null;
		while (curr != null) {
			Node after = curr.next;
//			System.out.println(curr.data);
			curr.next = prev;
			prev = curr;
			curr = after;
		}
		head = prev;
	}

	public void rev2() {
		rev(head);
	}

	private Node rev(Node nn) {
		if (nn.next == null) {
			head = nn;
			return nn;
		}
		Node spTail = rev(nn.next);
		spTail.next = nn;
		nn.next = null;
		return nn;
	}

	public void revK(int k) {
		Stack<Node> S = new Stack<>();
		Node curr = head;
		Node nHead = null;
		Node nTail = null;
		while (curr != null) {
			Node after = curr.next;
//			System.out.println(curr.data);
			S.add(curr);
			if (S.size() == k) {
				while (!S.isEmpty()) {
//					pop karo nn and new Linked List mein add
					Node nn = S.pop();
					if (nHead == null) {
						nHead = nn;
						nTail = nn;
						nTail.next = null;
					} else {
						nTail.next = nn;
						nTail = nn;
						nTail.next = null;
					}
				}

			}
			curr = after;
		}
		head = nHead;
	}

	public int getMid() {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
//D		while(fast.next!=null && fast!=null) {

			fast = fast.next.next;
			slow = slow.next;
		}
		return slow.data;
	}
	public boolean detectCycle() {
		// floyd cycle
		Node slow = head;
		Node fast = head;
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow==fast) {
				return true;
			}
		}
		return false;
	}
	public int lenCycle() {
		Node slow = head;
		Node fast = head;
		while(true) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow==fast) {
				break;
			}
		}
		Node jhanda = slow;
		Node nn = jhanda;
		int size =0;
		while(true) {
			nn = nn.next;
			size++;
			if(nn== jhanda) {
				return size;
			}
			
		}
	}
	public void cycleBreak() {
		Node slow = head;
		Node fast = head;
		while(true) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow==fast) {
				break;
			}
		}
		Node jhanda = slow;
		Node A = head;
		Node B =  jhanda;
		while(A.next!= B.next) {
			A = A.next;
			B = B.next;
		}
		B.next = null;
	}

}
//public ListNode reverseKGroup(ListNode head, int k) {
//    ListNode nn = head;
//    for(int cnt = 0;cnt<k;cnt++){
//        if(nn==null){
//            return head;
//        }
//        nn = nn.next;
//    }
//    ListNode spHead = reverseKGroup(nn,k);
//    ListNode curr = head;
//    ListNode prev = null;
//    for(int cnt =0;cnt<k;cnt++){
//        ListNode after = curr.next;
//        curr.next= prev;
//        prev= curr;
//        curr = after;
//    }
//    head.next = spHead;
//    return prev;
//}