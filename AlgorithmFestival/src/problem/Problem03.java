package problem;
/**
 * 1-2+3-4+....+99-100을 계산하여 답을 출력하시오.
 */
public class Problem03 {

	public static void main(String[] args) {
		int sum = 0;			//계산값을 저장하기 위한 값
		for (int i = 1; i <= 100; i++)
		{
			if(i%2 == 1)
			{
				sum = sum+i;	//i가 홀수이면 +덧셈
				System.out.print(i + " ");
			}
			else
			{
				sum = sum-i;	//i가 짝수이면 -뺄셈
				System.out.print(-i + " ");
			}
		}
		System.out.println("\n결과 : " + sum);	// \n은 줄바꿈임 결과출력
	}

}
