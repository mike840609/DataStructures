package hw2;

//import java.io.*;
//import java.util.Scanner;
import java.util.InputMismatchException;

//node class
class node {
	public String value;
	public node next;
}

public class hw2 {
	// 第一個結點名稱為first，最後一個結點名稱為previous
	node ptr, first, current, previous;
	static java.util.Scanner sc = new java.util.Scanner(System.in);

	// constructor
	hw2() {
		first = new node();
		first.next = first;
	}

	// 插入尾端
	public void newNode() {
		ptr = new node();

		System.out.println("===================new node================");
		ptr.value = sc.next();
		// System.out.println("================================");
		previous = first;
		current = first.next;

		// 插入串列尾端

		// 直到尾端會跳出(1)
		// while ((current != first)) {
		// previous = current;
		// current = current.next;
		// }
		// ptr.next = current;
		// previous.next = ptr;
		//
		// System.out.println("\n ================新增節點完成================\n");

		// 插入串列頭端(2)
		previous = first;
		current = first.next;
		// 執行替換動作
		previous.next = ptr;
		ptr.next = current;
		System.out.println("\n ================新增節點完成================\n");

	}

	// 加入節點於指定位置
	public void insert() {
		System.out.print("欲插入的節點的資料:");
		ptr = new node();
		ptr.value = sc.next();
		
		if(first.next == null){
			System.out.println("串列是空的");
		}
		else{
			System.out.print("欲插入的節點:");
			String temp = sc.next();
			previous = first;
			current = first.next;
			
			//節點後有值 && 當前節點不等於輸入節點
			//繼續走訪
			//找到或找完會跳出迴圈
			while((current.next!=first)&&(!temp.equals(current.next))){
				previous = current;
				current =current.next; 
			}
			
			if(current != null){
				previous.next = ptr;
				ptr.next=current;
				System.out.print("插入節點完成");
			}
			else{
				System.out.print("欲插入節點不存在");
			}
		}
		

	}

	// 刪除第一個節點
	public void delete() {
		// first.value == null
		// System.out.println(first.next.value);
		// System.out.println(first.next.next.value);

		if (first.next == first) {
			System.out.println("\n 空串列\n");
		} else {
			System.out.println("\n 刪除第一個節點\n");
			previous = first;
			current = first.next;
			// 執行替換動作
			previous.next = current.next;
			current = null;
			System.out.println("\n 完成刪除節點\n");

		}

	}

	public void display() {
		// int count =0;
		if (first.next == first) {
			System.out.println("no node");
		} else {
			System.out.println("================列印環狀串列==========");
			current = first.next;
			do {
				System.out.print(current.value + "=>");
				current = current.next;
			} while (current != first);
			System.out.print(first.next.value);// 印出環狀串列最後鏈接到的節點
			System.out.println("");
			System.out.printf("==========================\n\n");
		}
	}

	public static void main(String[] args) {
		int option = 0;
		hw2 obj = new hw2();
		do {
			System.out.println("================操作選單============");
			System.out.println("================1.新增節點==========");
			System.out.println("================2.插入節點==========");
			System.out.println("================3.刪除節點==========");
			System.out.println("================4.查看串列==========");
			System.out.println("================5.離開程式==========");
			System.out.print("choice: ");

			try {
				option = sc.nextInt();
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.out.print("not a correct number.\n");
				System.out.print("try again.\n");
			}
			switch (option) {
			case 1:
				obj.newNode();
				break;
			case 2:
				obj.insert();
				break;
			case 3:
				obj.delete();
				break;
			case 4:
				obj.display();
				break;
			case 5:
				System.exit(0);

			}

		} while (true);

	}

}
