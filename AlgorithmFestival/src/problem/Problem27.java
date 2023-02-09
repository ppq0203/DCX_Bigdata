package problem;

import java.util.Scanner;

public class Problem27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 채점하기 ====");
		String grading = sc.nextLine();
		int point = 0;
		int sum = 0;
		for(int i = 0; i < grading.length(); ++i)
		{
			switch (grading.charAt(i))
			{
				case 'o':
					sum += ++point;
					break;
				case 'x':
					point = 0;
					break;
			}
		}
		System.out.println(sum);
	}

}
