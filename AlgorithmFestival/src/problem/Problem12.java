package problem;
/**
 * 정수 N을 입력받아 N*N 배열에
 * 다음과 같이 숫자를 저장하고 출력하시오.
 */
import java.util.Scanner;	//Scanner클래스를 사용하기 위해 import

public class Problem12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//input을 쉽게받기위해 사용하는 자바클래스
		int n = sc.nextInt();
		int[][] intArray = new int[n][n];
		for(int i = 0; i<n; ++i)			//1부터 n까지 n번 반복
		{
			for(int j =0; j <n; ++j)	//1부터 n까지 n번 반복
			{
				intArray[i][j] = (i+1)+j*n;	//	행이 증가할때마다 1씩증가 열이 증가할때마다 n씩증가 이므로 i+1 + j*n이다.
			}
		}
		// 배열값 출력하여 확인
		for(int i = 0; i<n; ++i)			//1부터 n까지 n번 반복
		{
			for(int j =0; j <n; ++j)	//1부터 n까지 n번 반복
			{
				System.out.print(intArray[i][j] + " ");
			}
			System.out.println();
		}
	}

}
