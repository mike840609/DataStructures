package hw1;

import java.util.Random;
//import java.io.*;

public class hw1
{

	public static void main(String[] args)
	{
		// 讀取輸入
		java.util.Scanner sc = new java.util.Scanner(System.in);
		// 陣列宣告
		String[] player = new String[3];
		String[] com = new String[3];

		// 計次 
		int Pwin = 0;
		int Cwin = 0;
		int Draw = 0;

		System.out.println("GAME STRAT");

		for (int i = 0; i < 3; i++)
		{
			// 亂數物件
			Random ran = new Random();

			System.out.println("輸入第" + (i + 1) + "次剪刀石頭布");
			// 將輸入值讀入陣列
			player[i] = sc.next();

			// 亂數產生3以內得值 x判斷電腦出什麼
			int x = ran.nextInt(3);

			// 電腦出的判斷
			switch (x)
			{
				case 0:
					System.out.println("電腦出布");
					com[i] = "布";
					break;
				// break跳出switch
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

		// foreach用法
		// com陣列列印
		for (String element : com)
		{
			System.out.print(element + " ");
		}

		System.out.print("]");

		System.out.println();

		System.out.print("player[");
		for (String element : player)
		{
			System.out.print(element + " ");
		}
		System.out.print("]");
		System.out.println();
		
		System.out.print("Output:");
		for (int i = 0; i < 3; i++)
		{
			//外迴圈判斷電腦出什麼 內迴圈判斷輸贏
			if (com[i].equals("剪刀"))
			{

				if (player[i].equals("剪刀"))
				{
					System.out.print("平手 ");
					Draw++;
				}
				else if (player[i].equals("布"))
				{
					System.out.print("你輸了 ");
					Cwin++;
				}
				else
				{
					System.out.print("你贏了 ");
					Pwin++;
				}
			}
			
			
			
			else if (com[i].equals("石頭"))
			{
				if (player[i].equals("剪刀"))
				{
					System.out.print("你輸了 ");
					Cwin++;
				}
				else if (player[i].equals("布"))
				{
					System.out.print("你贏了 ");
					Pwin++;
				}
				else
				{
					System.out.print("平手 ");
					Draw++;
				}
			}
			
			
			
			//電腦出布
			else
			{
				if (player[i].equals("剪刀"))
				{
					System.out.print("你贏了 ");
					Pwin++;
				}
				else if (player[i].equals("布"))
				{
					System.out.print("平手 ");
					Draw++;
				}
				else
				{
					System.out.print("你輸了 ");
					Cwin++;
				}
			}
		}
		
		System.out.println("");
		System.out.print("Output:Player" + Pwin + "Com" + Cwin + "Draw" + Draw);

		if (Pwin > Cwin)
		{
			System.out.print("You win!!");
		}
		else if (Pwin < Cwin)
		{
			System.out.print("You lose!!");
		}
		else
		{
			System.out.print(" No winner");
		}
	}

}
