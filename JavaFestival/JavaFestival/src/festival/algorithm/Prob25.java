package festival.algorithm;

import java.util.Scanner;

public class Prob25 {

	public static void main(String[] args) {
		int[] dash_count = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
		System.out.print("ù�ڸ� 0�� ������ ���ڸ� �Է����ּ��� >> ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int dash_sum = 0;
		while(num > 0)
		{
			dash_sum += dash_count[num%10];
			num /= 10;
		}
		System.out.println("���('-')�� �� �� >> " + dash_sum);
	}

}