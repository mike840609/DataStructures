package test1;
import java.util.Random;

public class test1 {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		// 陣列宣告
		String[] player = new String[3];
		String[] com = new String[3];

		//計次
		int Pwin = 0;
		int Cwin = 0;
		int Draw = 0;

		System.out.println("GAME STRAT");
		for (int i = 0; i < 3; i++) {
			Random ran = new Random();

			System.out.println("玩家出拳:");
			player[i] = sc.next();

			int x = ran.nextInt(3);
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

		}

		System.out.print("com[");
		for (String element : com) {
			System.out.print(element + " ");
		}
		System.out.print("]");

		System.out.println();

		System.out.print("player[");
		for (String element : player) {
			System.out.print(element + " ");
		}
		System.out.print("]");
		System.out.println();
		System.out.print("Output:");
		for (int i = 0; i < 3; i++) {
			if (com[i].equals("剪刀")) {

				if (player[i].equals("剪刀")) {
					System.out.print("平手 ");
					Draw++;
				} else if (player[i].equals("布")) {
					System.out.print("你輸了 ");
					Cwin++;
				} else {
					System.out.print("你贏了 ");
					Pwin++;
				}
			} else if (com[i].equals("石頭")) {
				if (player[i].equals("剪刀")) {
					System.out.print("你輸了 ");
					Cwin++;
				} else if (player[i].equals("布")) {
					System.out.print("你贏了 ");
					Pwin++;
				} else {
					System.out.print("平手 ");
					Draw++;
				}
			} else {
				if (player[i].equals("剪刀")) {
					System.out.print("你贏了 ");
					Pwin++;
				} else if (player[i].equals("布")) {
					System.out.print("平手 ");
					Draw++;
				} else {
					System.out.print("你輸了 ");
					Cwin++;
				}
			}
		}
		System.out.println("");
		System.out.print("Output:Player"+Pwin+"Com"+Cwin+"Draw"+Draw);

		if(Pwin>Cwin){
			System.out.print("You win!!");
		}
		else if (Pwin<Cwin){
			System.out.print("You lose!!");
		}
		else{
			System.out.print(" No winner");
		}
	}

}
