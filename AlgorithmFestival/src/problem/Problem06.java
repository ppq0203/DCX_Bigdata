package problem;
/**
 * (77*1) + (76*2) + .... + (1*77)를 계산하여 결과를 출력하시오.
 */
public class Problem06 {

	public static void main(String[] args) {
		int sum = 0;	//계산값을 저장할 변수 선언
		for(int i = 1; i <= 77; ++i)	// i를 1~77까지 반복
		{
			sum = sum + ((78-i) * i);	//i가 1이므로 77-i가 아닌 78-i로 시작함 78-i는 77~1까지 i는 1~77까지 반복함
		}
		System.out.println(sum);
	}

}
