package hw3;

import java.util.ArrayList;
import java.util.Arrays;

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

	// 方法 刪除節點 未完成  未用到
	// 改用陣列方法完成節點刪除
	public void deleteNode(int target) {
		TreeNode del_node;
		del_node = head;
		
		// 跟樹根做比較 大則往又跑 小則往左找 	
		while (true) {
			// 在左子樹
			if (target < del_node.data) {
				// 左子樹為空
				if (del_node.left.data == target) {
					del_node.left = null;
					return;
				}
				else if(del_node.right.data == target){
					del_node.right = null;
					return;
				}
				else
					del_node = del_node.left; // 若左子樹有值則把current指標移植左節點在繼續往下找

			} else { // 在右子樹
				if (del_node.right == null) {
					del_node.right = new TreeNode(target);
					return;
				} else
					del_node = del_node.right;
			}
		}

	}

	// 方法 階層搜尋
	public void layerSearch(int data, TreeNode node) {
		
		


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

		// int[] array = { 23, 57, 8, 45, 12, 33, 56, 6, 77, 37 };
		// arrayList Initialize
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(23);
		array.add(57);
		array.add(8);
		array.add(45);
		array.add(12);
		array.add(33);
		array.add(56);
		array.add(6);
		array.add(77);
		array.add(37);

		BSTree obj = new BSTree();

		System.out.print("The ten nodes are :");
		// 使用array迴圈以插入方式建立樹狀結構
		// for (i = 0; i < array.length; i++) {
		// System.out.print("[" + array[i] + "]");
		// obj.insertBSTreeNode(array[i]);
		// }

		// 改用arrayListc後 迴圈 寫法
		for (i = 0; i < array.size(); i++) {
			System.out.print("[" + array.get(i) + "]");
			obj.insertBSTreeNode(array.get(i));
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
			System.out.println(
					" i=>insert node\n q=>Inorder Traversal\n s=>layer search\n d=>delete node\n anykey=> print all node");
			String option = sc.next();

			if (option.equals("i")) {
				System.out.println("輸入值");
				int value = sc.nextInt();
				obj.insertBSTreeNode(value);
				array.add(value);
			}

			else if (option.equals("q")) {
				System.out.println("Inorder Traversal 走訪");
				obj.inOrder(obj.head);
				System.out.println("");
			}

			else if (option.equals("s")) {
				System.out.println("節點階層搜尋");
				System.out.println("輸入搜尋節點：");
				int value = sc.nextInt();
				obj.layerSearch(value, obj.head);
			}

			else if (option.equals("d")) {
				System.out.println("節點刪除");
				System.out.println("輸入刪除節點：");
				int value = sc.nextInt();
				// obj.deleteNode(value);
				if (array.contains(value)) {
					array.remove(array.indexOf(value));
					ArrayList<Integer> temp = array;
					for (i = 0; i < temp.size(); i++) {
						System.out.print("[" + temp.get(i) + "]");
						obj.insertBSTreeNode(temp.get(i));
					}
				} else {
					System.out.println(value + " Not found");
				}
			}

			else {
				for (i = 0; i < array.size(); i++) {
					System.out.print("[" + array.get(i) + "]");
				}
				System.out.println("");
			}
		}
	}
}