package festival.algorithm;

import java.util.Scanner;

public class Prob25 {

	public static void main(String[] args) {
		int[] dash_count = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요 >> ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int dash_sum = 0;
		while(num > 0)
		{
			dash_sum += dash_count[num%10];
			num /= 10;
		}
		System.out.println("대시('-')의 총 합 >> " + dash_sum);
	}

}
