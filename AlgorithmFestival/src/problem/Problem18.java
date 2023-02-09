package problem;
/**
 * 중복이 없이 숫자를 뽑는 로또 프로그램을 만드시오.
 */

public class Problem18 {

	public static void main(String[] args) {
		int randomNum = 0;
		int[] lotto = new int[6];
		boolean overlap = true;	//중복체크 변수
		for(int i = 0; i < 6; i++)		//6번 반복
		{
			overlap = true;			//while문이 처음에 작동하기위해 true 설정
			while(overlap)				//랜덤수가 이전 수들과 중복된 경우 반복한다.
			{
				overlap = false;		//새로나온 랜덤수가 중복이 아니라고 가정
				randomNum = (int)(Math.random() * 100);	//0~99 랜덤수 생성
				for(int j = 0; j < i; ++j)		//이미 추가된 숫자들과 비교하기위해 이미만든 숫자들수만큼 반복
				{
					if(lotto[j] == randomNum)	//이미 생성된숫자들과 랜덤수가 동일하면 수행
					{
						overlap = true;			//중복 = true
						break;						//for문 종료
					}
				}
			}
			lotto[i] = randomNum;	//중복되지않은 랜덤수를 리스트에 저장한다.
		}
		for(int i = 0; i < 6; ++i)
		{
			System.out.println("행운의숫자 : " + lotto[i]);
		}
	}

}
