package problem;
/**
 * 5개의 정수를 입력 받아
 * 오름차순 정렬하여 출력하는 프로그램을 구현하시오.
 */
import java.util.Scanner;	//Scanner클래스를 사용하기 위해 import

public class Bonus05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//input을 쉽게받기위해 사용하는 자바클래스
		int listSize = 5;							//5개의 정수를 입력받기위해 사이즈를 5로 설정
		int[] intList = new int[listSize];		//크기가 listSize인 int배열 생성
		int temp = 0;
		for(int i = 0; i < listSize; ++i)			//listSize만큼 반복
		{
			System.out.print((i+1)+"번째 수 입력 : ");
			intList[i] = sc.nextInt();			//5번 숫자 입력
		}
		
		for(int i = 0; i < listSize; ++i)			//0부터 4까지 반복
		{
			for(int j = i+1; j < listSize; ++j)	//i+0 부터 4까지 반복
			{
				if (intList[i]>intList[j])			//항상 i<j 이고 i번의 숫자가 j번의 숫자보다 크면 두 수의 값을 바꾼다.
				{
					temp = intList[i];
					intList[i] = intList[j];
					intList[j] = temp;
				}
			}
		}
		System.out.println("정렬 후");
		for(int i = 0; i < listSize; ++i)
		{
			System.out.print(intList[i]+" ");
		}

	}

}
