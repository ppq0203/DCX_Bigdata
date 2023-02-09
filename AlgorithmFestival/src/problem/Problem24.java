package problem;
/**
 * 다음과 같은 프로그램을 작성하시오.
 * N과 X를 입력받는다.
 * N개의 정수를 입력 받는다.
 * N개의 숫자 중 X보다 작은 수만 출력한다.
 */
import java.util.Scanner;	//Scanner클래스를 사용하기 위해 import

public class Problem24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//input을 쉽게받기위해 사용하는 자바클래스
		System.out.print("N 입력 >> ");
		int n = sc.nextInt();
		System.out.print("X 입력 >> ");
		int x = sc.nextInt();
		int num = 0 ;
		String output = "";
		for(int i = 1; i <= n; ++i)		//n번 반복
		{
			System.out.print(i+"번째 정수 입력 >> ");
			num = sc.nextInt();
			if(num < x)						//입력값이 x보다 작으면 output에 string형태로 추가
				output = output + " " + num;
		}
		System.out.println("결과 >>" + output);
	}

}
