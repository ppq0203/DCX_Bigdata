package problem;
/**
 * 사용자에게 입력받아 배열의 인덱스의 수 만큼 별을 출력해보세요.
 */
import java.util.Scanner;	//Scanner클래스를 사용하기 위해 import

public class Bonus04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//input을 쉽게받기위해 사용하는 자바클래스
		int listSize = 5;						//리스트의 크기 지정 
		int[] intList = new int[listSize];	//리스트 크기만큼 배열생성
		for(int i = 0; i < listSize; ++i)		//리스트 크기만큼 반복
		{
			System.out.print(i+"번째 별의 수 : ");
			intList[i] = sc.nextInt();		//입력받은값 리스트에 저장
		}
		for(int i = 0; i < listSize; ++i)		//리스트의 크기만큼 반복
		{			
			System.out.print(intList[i] + " : ");
			for(int j = 0; j < intList[i]; ++j)	//입력받은 값만큼 반복
			{
				System.out.print("*");		//반복횟수만큼 *찍기
			}
			System.out.println(); 			//줄바꿈
		}

	}

}
