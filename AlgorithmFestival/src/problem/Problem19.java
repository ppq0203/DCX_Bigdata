package problem;
/**
 * 단 수와 곱해지길 원하는 수를
 * 입력하여 이와 같이 출력되게 하시오
 */
import java.util.Scanner;	//Scanner클래스를 사용하기 위해 import

public class Problem19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//input을 쉽게받기위해 사용하는 자바클래스
		
		System.out.println("단수입력 : ");
		int dan = sc.nextInt();		//단수 저장
		System.out.println("어느 수 까지 출력 : ");
		int num = sc.nextInt();		//어느수 저장
		
		System.out.println(dan + "단");
		for(int i = 1; i <= num; ++i)	//i 1부터 ~ num까지 반복
		{
			System.out.println(dan + "*" + i + "=" + (i*dan) );
		}
	}

}
