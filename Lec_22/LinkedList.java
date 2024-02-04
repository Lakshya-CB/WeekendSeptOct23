package Lec_22;

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
			System.out.println(temp.data + "=>");
			temp = temp.next;
		}
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
		Node temp = head;
		for (int cnt = 1; cnt <= idx; cnt++) {
			temp = temp.next;
		}
		return temp.data;
	}
	public Node getAtNode(int idx) {
		Node temp = head;
		for (int cnt = 1; cnt <= idx; cnt++) {
			temp = temp.next;
		}
		return temp;
	}

	public int getFirst() {
		return head.data;
	}

	public int getLast() {
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		return temp.data;
	}
	
	public void addFirst(int ali) {
		Node nn = new Node(ali);
		nn.next= head;
		head = nn;
	}
	public void addLast(int ali) {
		Node nn = new Node(ali);
		Node last = getAtNode(size()-1);
		last.next = nn;
	}
	public void addAt(int idx, int ali) {
		Node nn = new Node(ali);
		Node prev= getAtNode(idx-1);
		Node after = prev.next;
		prev.next = nn;
		nn.next = after;
	}
	public int removeFirst() {
		int ans = head.data;
		head = head.next;
		return ans;
	}
	public int removeLast() {
		Node secondLast = getAtNode(size()-2);
		int ans = secondLast.next.data;
		secondLast.next = null ;
		return ans;
	}
	public int removeAt(int idx) {
		Node prev  =  getAtNode(idx-1);
		Node nn = prev.next;
		Node after = nn.next;
		prev.next = after;
		return nn.data;
	}
	
}
