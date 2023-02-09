package problem;
/**
 * 10진수 정수를 입력받아
 * 2진수로 변환해서 출력하시오.
 */
import java.util.Scanner;	//Scanner클래스를 사용하기 위해 import

public class Problem20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//input을 쉽게받기위해 사용하는 자바클래스
		
		System.out.println("숫자입력>>");
		int num = sc.nextInt();
		String binaryNum = "";
		while(num > 0)	//num 이 0보다 클때 반복
		{
			binaryNum = num%2+ " " + binaryNum;	//	2로 나눈 나머지를 뒤에서부터 저장 10의 경우 0 10 010 1010 순서로 저장된다.
			num = num/2;	// 2로 나눠 자릿수를 이동한다.
		}
		System.out.println(binaryNum);
	}

}
