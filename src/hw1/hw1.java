package hw1;

import java.util.Random;
//import java.io.*;

public class hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Scanner sc = new java.util.Scanner(System.in);
		// 陣列宣告
		String[] player = new String[3];
		String[] com = new String[3];

		// practice
		// game
		System.out.println("GAME STRAT");
		for (int i = 0; i < 3; i++) {

			Random ran = new Random();
			int x = ran.nextInt(3);
			// System.out.println(x);
			// 0 1 2
			switch (x) {
			case 0:
				System.out.println("電腦出布");
				com[i] = "布";
				break;
			case 1:
				System.out.println("電腦出剪刀");
				com[i] = "剪刀";
				break;
			case 2:
				System.out.println("電腦出石頭");
				com[i] = "石頭";
				break;
			}
			
			System.out.println("輸入第" + (i + 1) + "次剪刀石頭布");
			player[i] = sc.next();
		}

		
		System.out.println("電腦" + " ");
		for (String element : com) {
			System.out.print(element + " ");
		}

		System.out.println();
		System.out.println("玩家" + " ");
		for (String element : player) {
			System.out.print(element + " ");
		}
		System.out.println();
		System.out.println("比賽結果:");
		for (int i = 0; i < 3; i++) {
			if (com[i].equals("剪刀")) {

				if (player[i].equals("剪刀")) {
					System.out.print("平手");
				} else if (player[i].equals("布")) {
					System.out.print("你輸了");
				} else {
					System.out.print("你贏了");
				}
			} else if (com[i].equals("石頭")) {
				if (player[i].equals("剪刀")) {
					System.out.print("你輸了");
				} else if (player[i].equals("布")) {
					System.out.print("你贏了");
				} else {
					System.out.print("平手");
				}
			} else {
				if (player[i].equals("剪刀")) {
					System.out.print("你贏了");
				} else if (player[i].equals("布")) {
					System.out.print("平手");
				} else {
					System.out.print("你輸了");
				}
			}
		}
	}
}
