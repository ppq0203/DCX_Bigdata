package problem;
/**
 * 정수 n을 입력받아
 * 1, 2, 4, 7, 11 과 같은 수열의 n번째 항까지 출력하시오.
 */
import java.util.Scanner;	//Scanner클래스를 사용하기 위해 import

public class Problem15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//input을 쉽게받기위해 사용하는 자바클래스
		int progression = 1;			//수열 값을 저장할 변수
		System.out.print("n 입력 : ");
		int n = sc.nextInt();			//정수 n 입력
		for(int i = 0; i < n; ++i)		//n번 반복
		{
			progression = progression + i;		//1씩 증가하는값을 더하는 수열
			System.out.print(progression + " ");
		}
	}

}
