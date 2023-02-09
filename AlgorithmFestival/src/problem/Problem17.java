package problem;
/**
 * 숫자를 입력 받아 3의 배수인 숫자를
 * 출력하는 프로그램을 작성하세요.
 */
import java.util.Scanner;	//Scanner클래스를 사용하기 위해 import

public class Problem17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//input을 쉽게받기위해 사용하는 자바클래스
		String output = "";
		int num;
		for(int i = 1; i <= 10; ++i)	//10번 반복
		{
			System.out.print(i+"번 째 정수 입력>>");
			num = sc.nextInt();
			if(num%3==0)
			{
				output = output + " " + num;	//3의 배수의경우 string에 저장함
			}
		}
		System.out.println("3의 배수 :" +output);
	}

}
