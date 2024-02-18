package Lec_OOPs_Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BST {
	class Node {
		public Node(int i) {
			// TODO Auto-generated constructor stub
			data = i;
		}

		int data;
		Node left;
		Node right;
	}

	Node root;

	public void print() {
		print(root);
	}

	private void print(Node nn) {
		if (nn == null) {
			return;
		}
		String str = "";
		if (nn.left != null) {
			str = str + nn.left.data;
		}
		str = str + "=>" + nn.data + "<=";
		if (nn.right != null) {
			str = str + nn.right.data;
		}
		System.out.println(str);
		print(nn.left);
		print(nn.right);
	}

	public BST(int[] lvl, boolean b) {
		root = new Node(lvl[0]);
		int idx = 1;
		Queue<Node> Q = new LinkedList<>();
		Q.add(root);
		while (!Q.isEmpty()) {
			Node nn = Q.poll();
			if (idx < lvl.length && lvl[idx] != -1) {
				nn.left = new Node(lvl[idx]);
				Q.add(nn.left);
			}
			idx++;
			if (idx < lvl.length && lvl[idx] != -1) {
				nn.right = new Node(lvl[idx]);
				Q.add(nn.right);
			}
			idx++;
		}

	}

	public boolean isBST() {
		return isBST(root);
	}

	public int Max() {
		return Max(root);
	}

	private int Max(Node nn) {
		if (nn == null) {
			return Integer.MIN_VALUE;
		}
		if (nn.right == null) {
			return nn.data;
		}
		return Max(nn.right);
	}

	public int Min() {
		return Min(root);
	}

	private int Min(Node nn) {
		if (nn == null) {
			return Integer.MAX_VALUE;
		}
		if (nn.left == null) {
			return nn.data;
		}
		return Min(nn.left);
	}

	private boolean isBST(Node nn) {
		if (nn == null) {
			return true;
		}
		boolean L = isBST(nn.left);
		boolean R = isBST(nn.right);
		boolean self = Max(nn.left) < nn.data && nn.data < Min(nn.right);
		return L && R && self;
	}

	public boolean find(int ali) {
		return find(root, ali);
	}

	private boolean find(Node nn, int ali) {
		if (nn == null) {
			return false;
		}
		if (nn.data == ali) {
			return true;
		}
		if(nn.data <ali) {
			return find(nn.right,ali);
		}else {
			return find(nn.left,ali);
		}
	}
	public void add(int ali) {
		root = add(root,ali);
	}

	private Node add(Node nn, int ali) {
		if(nn==null) {
			return new Node(ali);
		}
		if(ali > nn.data) {
			nn.right = add(nn.right, ali);
		}else {
			nn.left = add(nn.left, ali);		
		}
		return nn;
	}
	public void remove(int ali) {
		root = remove(root,ali);
	}

	private Node remove(Node nn, int ali) {
		if(nn.data <ali) {
			nn.right = remove(nn.right,ali);
		}else if (nn.data > ali){
			nn.left = remove(nn.left,ali);
		}else {
			if(nn.left ==null && nn.right==null) {
				return null;
			}
			if(nn.left==null && nn.right!=null) {
				return nn.right;
			}
			if(nn.left!=null && nn.right==null) {
				return nn.left;
			}
			/////////////////////////////
			nn.data = Min(nn.right);
			nn.right = remove(nn.right, nn.data);
		}
		return nn;
	}
}
