package problem;
/**
 * (세 자리 수) * (세 자리 수)는 다음과 같이 계산된다.
 * (1), (2)번을 입력 받아 결과 화면처럼 (3), (4), (5), (6)번을
 * 출력하는 프로그램을 작성하시오
 */
import java.util.Scanner;	//Scanner클래스를 사용하기 위해 import

public class Problem26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//input을 쉽게받기위해 사용하는 자바클래스
		int sum = 0;
		int calc = 0;
		System.out.print("첫 번째 숫자 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 입력 >> ");
		int num2 = sc.nextInt();
		for(int i = 0; i < 3; ++i)
		{
			calc = num1*(num2%10);
			System.out.println(calc);
			for(int j = 0 ; j < i; ++j)
			{
				calc = calc*10;
			}
			sum = sum + calc;
			num2 = num2 / 10;
		}
		System.out.println(sum);
	}
}
