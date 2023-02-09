package festival.algorithm;

import java.util.Scanner;

public class Prob31 {

	public static void main(String[] args) {
		System.out.print("입력 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long fact = num;
		while(--num>0)
		{
			fact *= num;
		}
		System.out.println("출력 : " + fact);
	}

}
