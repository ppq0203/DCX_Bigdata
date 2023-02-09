package problem;

import java.util.Scanner;

public class Problem29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, sum;
		for(int i = 0; i < 5; ++i)
		{
			a = (int)(Math.random()*10);
			b = (int)(Math.random()*10);
			System.out.print(a + " + " + b + " = ");
			sum = sc.nextInt();
			if(sum == a+b)
			{
				System.out.println("SUCCESS!");
				--i;
			}
			else
			{
				System.out.println("Fail...");
			}
		}
		System.out.println("GAME OVER!");
	}
}
