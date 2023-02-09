package problem;
/**
 * 다음과 같은 결과를 출력하세요
 * 콘솔 폰트에따라 이상하게 나올수도있으니 잘못된것이 아님.
 */
public class Problem22 {

	public static void main(String[] args) {
		for(int i = 0; i < 5; ++i)		//i=0~4반복
		{
			for(int j = 4; j >= 0; --j)//j=4~0반복
			{
				if( j <= i )	//j가 i 보다 같거나 작으면 *출력
				{
					System.out.print("*");
				}
				else			//j가 i보다크면 공백 출력
				{
					System.out.print(" ");					
				}
			}
			System.out.println();
		}
	}

}
