package Lec_OOPs_Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
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

	public BinaryTree(int[] pre, int[] in) {
		root = create(pre, 0, pre.length - 1, in, 0, in.length - 1);
	}

	private Node create(int[] pre, int ps, int pe, int[] in, int is, int ie) {
		if (ps > pe || is > ie) {
			return null;
		}
		Node nn = new Node(pre[ps]);
		int f = -1;
		int L_size = 0;
		for (int i = is; i <= ie; i++) {
			if (in[i] == pre[ps]) {
				f = i;
				break;
			}
			L_size++;
		}
		nn.left = create(pre, ps + 1, ps + L_size, in, is, f - 1);
		nn.right = create(pre, ps + L_size + 1, pe, in, f + 1, ie);
		return nn;
	}

	public int size() {
		return size(root);
	}

	private int size(Node nn) {
		if (nn == null) {
			return 0;
		}
		int L = size(nn.left);
		int R = size(nn.right);
		return L + R + 1;
	}

	public int Ht() {
		return Ht(root);
	}

	int max_Dia = 0;

	private int Ht(Node nn) {
		if (nn == null) {
			return -1;
		}
		int L = Ht(nn.left);
		int R = Ht(nn.right);
		int self = L + R + 2;
		max_Dia = Math.max(max_Dia, self);
		return Math.max(L, R) + 1;
	}

	public int Dia() {
		return Dia(root);
	}

	private int Dia(Node nn) {
		if (nn == null) {
			return 0;
		}
		int L = Dia(nn.left);
		int R = Dia(nn.right);

		int self = Ht(nn.left) + Ht(nn.right) + 2;

		return Math.max(self, Math.max(L, R));
	}

	class HtDiaP {
		int Dia = 0;
		int Ht = -1;
	}

	private HtDiaP Dia2(Node nn) {
		if (nn == null) {
			return new HtDiaP();
		}
		HtDiaP L = Dia2(nn.left);
		HtDiaP R = Dia2(nn.right);

		HtDiaP ans = new HtDiaP();
		ans.Ht = Math.max(L.Ht, R.Ht) + 1;

		int self = L.Ht + R.Ht + 2;
		ans.Dia = Math.max(self, Math.max(L.Dia, R.Dia));
		return ans;
	}

	public boolean isBalanced() {
		return isBalanced2(root).isB;
	}

	private boolean isBalanced(Node nn) {
		if (nn == null) {
			return true;
		}
		boolean L = isBalanced(nn.left);
		boolean R = isBalanced(nn.right);
		boolean self = Math.abs(Ht(nn.left) - Ht(nn.right)) <= 1;
		return L && R && self;
	}

	class isBalHtP {
		int Ht = -1;
		boolean isB = true;
	}

	private isBalHtP isBalanced2(Node nn) {
		if (nn == null) {
			return new isBalHtP();
		}
		isBalHtP L = isBalanced2(nn.left);
		isBalHtP R = isBalanced2(nn.right);
		boolean self = Math.abs(L.Ht - R.Ht) <= 1;
		isBalHtP ans = new isBalHtP();
		ans.isB = L.isB && R.isB && self;
		ans.Ht = Math.max(L.Ht, R.Ht) + 1;
		return ans;
	}

	public BinaryTree(int[] pre) {
		root = createPre(pre);
	}

	int pidx = 0;

	private Node createPre(int[] pre) {
		if (pidx >= pre.length || pre[pidx] == -1) {
			pidx++;
			return null;
		}
		Node nn = new Node(pre[pidx]);
		pidx++;
		nn.left = createPre(pre);
		nn.right = createPre(pre);
		return nn;
	}

	public void lvl() {
		Queue<Node> Q = new LinkedList<>();
		Q.add(root);
		while (!Q.isEmpty()) {
			Node nn = Q.poll();
			System.out.println(nn.data);
			if (nn.left != null) {
				Q.add(nn.left);
			}
			if (nn.right != null) {
				Q.add(nn.right);
			}

		}
	}

	public void lvl2() {
		Queue<Node> Q = new LinkedList<>();
		Q.add(root);
		int curr_lvl = 1;
		while (!Q.isEmpty()) {
			for (int cnt = 1; cnt <= curr_lvl; cnt++) {
				Node nn = Q.poll();
				System.out.print(nn.data + " ");
				if (nn.left != null) {
					Q.add(nn.left);
				}
				if (nn.right != null) {
					Q.add(nn.right);
				}
			}
			System.out.println();
			curr_lvl = Q.size();
		}
	}

	public BinaryTree(int[] lvl, boolean b) {
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
}
