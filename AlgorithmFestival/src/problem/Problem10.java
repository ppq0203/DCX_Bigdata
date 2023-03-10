package problem;
/**
 * 8칸 크기의 배열을 선언하고 랜덤수로 초기화 한 후
 * 가장 큰 수와 작은 수를 각각 출력하시오.
 */

public class Problem10 {

	public static void main(String[] args) {
		int[] intList = new int[8];				//8칸크기의 int배열 선언
		int min = 1000;								//가장작은수를 저장하기위한 변수
		int max = -1000;								//가장 큰수를 저장하기 위한 변수
		System.out.print("배열에 있는 모든 값 : ");
		for(int i = 0; i < intList.length; i++)
		{
			intList[i] = (int)(Math.random()*100);	//int배열을 0~99사이 숫자로 초기화
			System.out.print(" " + intList[i]);
			if (min > intList[i])	//랜덤수가 가장 작은 수보다 작으면 
				min = intList[i];	//가장 작은 수 저장
			if (max < intList[i])	//랜덤수가 가장 큰 수보다 크면
				max = intList[i];	//가장 큰 수 저장
		}		
		System.out.println();
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);
	}

}
