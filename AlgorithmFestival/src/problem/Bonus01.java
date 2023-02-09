package problem;
/**
 * A,B숫자를 입력 받는다.
 * A-B를 출력한다.
 * A와 B가 모두 0을 입력받으면 프로그램이 종료된다.
 */
import java.util.Scanner;	//Scanner클래스를 사용하기 위해 import

public class Bonus01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//input을 쉽게받기위해 사용하는 자바클래스
		int a = 0;
		int b = 0;
		while(true)								//무한반복
		{
			System.out.print("A 입력 >> ");
			a = sc.nextInt();						//A 입력값 저장
			System.out.print("B 입력 >> ");
			b = sc.nextInt();						//B 입력값 저장
			if(a==0 && b==0)						//A,B모두 0이면
				break;								//반복문종료
			System.out.println("결과 >> " + (a-b) ); //A-B출력
		}
	}

}
