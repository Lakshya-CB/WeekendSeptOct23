package Lec_OOPs_Trees;

public class client_Tree {
	public static void main(String[] args) {
		int[] pre = { 10, 20, 40, 50, 30, 60 };
		int[] in = { 40, 20, 50, 10, 30, 60 };
		int[] lvl = {10,20,30,40,50,-1,60,-1,-1,70,80,-1,-1,-1,-1,100};
		BinaryTree BT = new BinaryTree(lvl,true);
//		BT.print();
		BT.lvl2();
	}
}
