package problem;

import java.util.Scanner;

public class Problem31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력  : ");
		int n = sc.nextInt();
		int factorial = 1;
		while(n>0)
			factorial *= n--;
		System.out.println("출력 : " + factorial);
	}

}
