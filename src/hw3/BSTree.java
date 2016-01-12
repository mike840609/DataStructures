package hw3;

class TreeNode { // 樹節點類別
	int data; // 節點資料
	TreeNode left; // 參考左子樹
	TreeNode right; // 參考右子樹

	// 建構子
	public TreeNode(int data) {
		this.data = data;
		this.left = this.right = null;
	}
}

public class BSTree { // 二元搜尋樹類別
	public TreeNode head; // 參考樹的根節點
	// 建立空的二元搜尋樹

	public BSTree() {
		head = null;
	}

	// 方法: 檢查二元搜尋樹是否是空的
	boolean isBSTreeEmpty() {
		if (head == null)
			return true;
		else
			return false;
	}

	// 方法: 在二元搜尋樹插入節點
	public void insertBSTreeNode(int data) {
		if (head == null) { // 建立根節點
			head = new TreeNode(data);
			return;
		}
		// 建立二元搜尋樹
		TreeNode current = head;
		while (true) {
			// 在左子樹
			if (data < current.data) {
				// 左子樹為空
				if (current.left == null) {
					current.left = new TreeNode(data);
					return;
				} else
					current = current.left; // 若左子樹有值則把current指標移植左節點在繼續往下找

			} else { // 在右子樹
				if (current.right == null) {
					current.right = new TreeNode(data);
					return;
				} else
					current = current.right;
			}
		}
	}

	// 方法: 顯示二元搜尋樹的節點資料
	public void printBSTree() {
		inOrder(this.head);
		System.out.println();
	}

	// 方法1: 前序走訪的遞迴方法
	public void preOrder(TreeNode node) {
		if (node != null) {
			// 顯示節點資料
			System.out.print("[" + node.data + "]");
			preOrder(node.left); // 走訪左子樹
			preOrder(node.right); // 走訪右子樹
		}
	}

	// 方法2: 中序走訪的遞迴方法
	public void inOrder(TreeNode node) {
		if (node != null) {
			inOrder(node.left); // 走訪左子樹
			// 顯示節點資料
			System.out.print("[" + node.data + "]");
			inOrder(node.right); // 走訪右子樹
		}
	}

	// 方法3: 後序走訪的遞迴方法
	public void postOrder(TreeNode node) {
		if (node != null) {
			postOrder(node.left); // 走訪左子樹
			postOrder(node.right); // 走訪右子樹
			// 顯示節點資料
			System.out.print("[" + node.data + "]");
		}
	}

	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int i;
		int[] array = { 23, 57, 8, 45, 12, 33, 56, 6, 77, 37 };

		BSTree obj = new BSTree();

		System.out.print("The ten nodes are :");
		// 使用迴圈以插入方式建立樹狀結構
		for (i = 0; i < array.length; i++) {
			System.out.print("[" + array[i] + "]");
			obj.insertBSTreeNode(array[i]);
		}
		System.out.println();
		System.out.println("Node  added  complete.");

		System.out.print("InOrder:");
		obj.inOrder(obj.head);
		System.out.println();

		System.out.print("PreOrder:");
		obj.preOrder(obj.head);
		System.out.println();

		System.out.print("PostOrder:");
		obj.postOrder(obj.head);
		System.out.println();

		// I = insert node
		// d = delete node
		// s = search node
		while (true) {
			System.out.println("輸入動作");
			String option = sc.next();
			 
			if (option.equals("i")) {
				System.out.println("輸入值");
				int value = sc.nextInt();
				obj.insertBSTreeNode(value);
			}
			else if(option.equals("q")){
				System.out.println("Inorder Traversal 走訪");
				obj.inOrder(obj.head);
			}
			
		}
	}
}