package festival.algorithm;

import java.util.Scanner;

public class Prob24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("N 입력 >> ");
		int n = sc.nextInt();
		System.out.print("X 입력 >> ");
		int x = sc.nextInt();
		
		for(int i = 1; i <= n; ++i)
		{
			System.out.print(i + "번째 정수 입력 >> ");
		}

	}

}
