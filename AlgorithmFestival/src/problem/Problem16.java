package problem;
/**
 * 8자리 정수를 입력받아 반복문을 활용하여
 * 입력받은 정수의 합을 구하여
 * 출력하는 프로그램을 작성하시오.
 */
import java.util.Scanner;	//Scanner클래스를 사용하기 위해 import

public class Problem16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//input을 쉽게받기위해 사용하는 자바클래스
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 0; i < 8; ++i)	//8자리 정수 8번 반복
		{
			sum = sum + num%10;	//1의 자리값 덧셈
			num = num/10;	//num을 10으로 나눔
		}
		System.out.println(sum);
	}

}
