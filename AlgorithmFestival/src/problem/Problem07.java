package problem;
/**
 * 행 개수를 입력 받아 다음과 같이 삼각형을 출력하시오.
 */
import java.util.Scanner;	//Scanner클래스를 사용하기 위해 import

public class Problem07 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);	//input을 쉽게받기위해 사용하는 자바클래스
		
		System.out.print("행 개수 : ");
		int rowNum = sc.nextInt();					//행 개수를 입력받음
		for(int i = rowNum; i > 0; --i)					//행 개수만큼 반복함 ex) 7~1 까지 7번반복
		{
			for(int j = 0; j < i; j++)						//i번만큼 반복함
			{
				System.out.print("*");					//별찍기
			}
			System.out.println(); 						//줄바꿈
		}
	}

}
