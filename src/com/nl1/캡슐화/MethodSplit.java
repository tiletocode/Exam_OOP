package com.nl1.캡슐화;

import java.util.Scanner;
public class MethodSplit {
	static int[] arr = new int[3];
	
    public static void main(String[] args) {
		boolean loop = true;
		
		while(loop)
		{
			int m = menu();
			switch (m) {
				case 1 -> inputScore();
				case 2 -> outputScore();
				case 3 -> {
					System.out.println("프로그램 종료.");
					loop = false;
				}
				default -> System.out.println("잘못된 값을 입력하셨습니다. 메뉴는 1~3까지입니다.");
			}
		}
	}
	
	static void inputScore() {
		Scanner sc = new Scanner(System.in);

		System.out.println("      -성적 입력-");
		System.out.println();

		for (int i = 0; i < 3; i++) {
			do {
				System.out.printf("국어%d : ", i + 1);
				arr[i] = sc.nextInt();

				if (arr[i] < 0 || 100 < arr[i]) {
					System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");
				}
			} while (arr[i] < 0 || 100 < arr[i]);
		}

		System.out.println("────────────────────────");
		sc.close();
		
	}
	static void outputScore() {
		int total = 0;
		float avg;

		for(int i = 0; i < 3; i++)
				{
					total += arr[i];
				}
				avg = total / 3.0f;
				
				System.out.println("      -성적 출력-");
				System.out.println();
				
				for(int i = 0; i < 3; i++)
				{
					System.out.printf("국어 %d : %3d\n", i+1, arr[i]);
				}
				System.out.printf("총점 : %3d\n", total);
				System.out.printf("평균 : %6.2f\n", avg);
				System.out.println("────────────────────────");
	}
	static int menu() {
			Scanner sc = new Scanner(System.in);
			System.out.println("      -메인 메뉴-");
			System.out.println("\t1. 성적입력 ");
			System.out.println("\t2. 성적출력 ");
			System.out.println("\t3. 종료 ");
			System.out.println("\t선택> ");
			int menu = sc.nextInt();
			sc.close();
			return menu;
	}
}
