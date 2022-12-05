package com.kh.rhj;

import java.util.Random;
import java.util.Scanner;

public class GameFunction {
	Game game;
	
	public GameFunction() {
		game = new Game();
	}

	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�١ڡ١ڡ١� ȥ�� ��� �١ڡ١ڡ١�");
		System.out.println();
		System.out.println("1. �� ������ �ۼ��غ���");
		System.out.println("2. �� ������ ����");
		System.out.println("3. �����ϱ�");
		System.out.println("4. ȥ�ڳ�� ��");
		System.out.println();
		System.out.print("������ �����ұ�? : ");
//		System.out.println("�١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١�");
		int menu = sc.nextInt();
		return menu;
	}

	public void inputProfile() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�١ڡ١ڡ١� �� �������� �ۼ��غ���!�١ڡ١ڡ١�");
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.print("�����ϴ� ���� : ");
		String food = sc.next();
		System.out.print("�����ϴ� ���� : ");
		String color = sc.next();
		game.setName(name);
		game.setFood(food);
		game.setColor(color);
	}

	public void printProfile() {
		System.out.println("�١ڡ١ڡ١� �� ������ ���� �١ڡ١ڡ١�");
		System.out.println("�� �̸��� " + game.getName() +"�� ^^*");
		System.out.println("�����ϴ� ������ " + game.getFood() + "�̰�");
		System.out.println("�����ϴ� ������ " + game.getColor() + "�̾ߤ���");
		System.out.println();

	}

	public void gameChoice() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١� ������ ����� �١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١�");
		System.out.println();
		System.out.println("1�� : ���� �յ� ���߱�    2�� : �ζ� ��ȣ �ڵ� ������");
		System.out.println();
		System.out.print("������ �����ұ�? : ");
		int menu = sc.nextInt();
		if (menu == 1) {
			Scanner sc1 = new Scanner(System.in);
			Random rand = new Random();
			System.out.println("�١ڡ١ڡ١� ���� �� �� ���߱� ���ӡ١ڡ١ڡ١�");
			System.out.print("���ڸ� �Է����ּ���. (1. �ո� / 2. �޸�) : ");
			int choice = sc.nextInt();
			int computer = rand.nextInt(2) + 1;
			System.out.println(".");
			System.out.println(".");
			System.out.println(".");
			System.out.println("��ǻ�ʹ� " + computer + " ��/�� ����׿�!");

			if (choice == computer) {
				System.out.println("������ϴ�!");
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�!");

			}
		} else {
			System.out.println("�١ڡ١ڡ١� �ζ� ��ȣ�� �ڵ����� ��÷�մϴ� �١ڡ١ڡ١�");
			System.out.println(".");
			System.out.println(".");
			System.out.println(".");
			int[] lotto = new int[6];
			Random rand = new Random();
			for (int i = 0; i < lotto.length; i++) {
				lotto[i] = rand.nextInt(45) + 1;
				for (int j = 0; j < i; j++) {
					if (lotto[i] == lotto[j]) {
						i--;
						break;
					}
				}
			}
			for (int i = 0; i < lotto.length; i++) {
				for (int j = i + 1; j < lotto.length; j++) {
					if (lotto[i] > lotto[j]) {
						int temp = lotto[i];
						lotto[i] = lotto[j];
						lotto[j] = temp;
					}

				}

			}
			for (int i = 0; i < lotto.length; i++) {
				System.out.printf(lotto[i] + " ");
			}
			System.out.printf("¥��~" + "%n");
			System.out.println();
		}
	}

//	public void coinGame() {
//		Scanner sc = new Scanner(System.in);
//		Random rand = new Random();
//		System.out.println("�١ڡ١ڡ١� ���� �� �� ���߱⸦ �����ϼ̳׿�! �١ڡ١ڡ١�");
//		System.out.println("�١ڡ١ڡ١� �����غ����! �١ڡ١ڡ١�");
//		System.out.println(".");
//		System.out.println(".");
//		System.out.println(".");
//		System.out.print("���ڸ� �Է����ּ���. (1. �ո� / 2. �޸�) : ");
//		int choice = sc.nextInt();
//		int computer = rand.nextInt(2) + 1;
//		System.out.println("��ǻ�ʹ� ... " + computer + " �� ����׿�!");
//
//		if (choice == computer) {
//			System.out.println("������ϴ�!");
//		} else {
//			System.out.println("Ʋ�Ƚ��ϴ٤̤�");
//
//		}
//	}

//	public void lottoGame() {
//		System.out.println("�١ڡ١ڡ١� �ζ� ��ȣ�� �ڵ����� ��÷�մϴ�~ �١ڡ١ڡ١�");
//		System.out.println(".");
//		System.out.println(".");
//		System.out.println(".");
//		int[] lotto = new int[6];
//		Random rand = new Random();
//		for (int i = 0; i < lotto.length; i++) {
//			lotto[i] = rand.nextInt(45) + 1;
//			for (int j = 0; j < i; j++) {
//				if (lotto[i] == lotto[j]) {
//					i--;
//					break;
//				}
//			}
//		}
//		for (int i = 0; i < lotto.length; i++) {
//			for (int j = i + 1; j < lotto.length; j++) {
//				if (lotto[i] > lotto[j]) {
//					int temp = lotto[i];
//					lotto[i] = lotto[j];
//					lotto[j] = temp;
//				}
//
//			}
//
//		}
//		for (int i = 0; i < lotto.length; i++) {
//			System.out.print(lotto[i] + " ");
//		}
//		System.out.println();
//	}

	public void goodByeMsg() {
		System.out.println("ȥ�� ��⸦ �����ϴ�. Bye~");
	}

	public void exceptionMsg() {
		System.out.println("1 ~ 4������ ���ڸ� �Է����ּ���");
	}
}
