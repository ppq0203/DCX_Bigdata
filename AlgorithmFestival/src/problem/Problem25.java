package problem;
/**
 * 그림과 같이 대시('_')문자로 구성된 형태의 숫자를
 * 주어진 숫자와 같이 출력하고 싶을 때 사용되게 되는
 * 대시의 개수를 출력하는 프로그램을 작성하라
 */
import java.util.Scanner;	//Scanner클래스를 사용하기 위해 import

public class Problem25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//input을 쉽게받기위해 사용하는 자바클래스
		int[] dashNum = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};		//각 숫자마다 대시 문자의 개수
		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요 >> ");
		int num = sc.nextInt();
		int dashSum = 0;
		while(num > 0)	//	num이 0이 될때까지 반복
		{
			dashSum = dashSum + dashNum[num%10];	//1의자리에 해당하는 숫자의 dash개수 합산
			num = num/10;										//num을 10으로 나눔
		}
		System.out.println("대시('-')의 총 합 >> "+dashSum);
		
	}

}
