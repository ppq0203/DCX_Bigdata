package festival.algorithm;

import java.util.Scanner;

public class Prob19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ܼ��Է� : ");
		int dan = sc.nextInt();
		System.out.println("��� ������ ��� : ");
		int num = sc.nextInt();
		System.out.println(dan+"��");
		for(int i = 1; i <= num; ++i)
			System.out.println(dan+"*"+i+"="+dan*i);

	}

}
