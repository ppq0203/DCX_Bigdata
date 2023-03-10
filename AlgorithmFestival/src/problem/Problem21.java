package problem;
/**
 * 아래와 같이 숫자가 담긴 1차원 배열이 주어졌을 때,
 * 두 개의 숫자를 뽑아 서로의 거리를 비교한 후
 * 거리가 가장 작은 숫자의 위치 (index)를 출력하시오.
 */
public class Problem21 {

	public static void main(String[] args) {
		int[] point = {92,32,52,9,81,2,68};
		int min_distance = 10000;	//가장작은 거리를 저장할 변수
		int distance = 0;			//두 숫자의 거리를 저장할 변수
		int index1 = 0;				//거리가 가장작은 숫자의 위치를 저장할 변수1
		int index2 = 0;				//거리가 가장작은 숫자의 위치를 저장할 변수2
		for(int i = 0; i < point.length; ++i)	//리스트의 개수만큼 반복
		{
			for(int j = i+1; j < point.length; ++j)	//i의 이후숫자들갯수만큼 반복
			{
				distance = ( point[i] > point[j] ) ? (point[i] - point[j]) : (point[j] - point[i]);	//pt[i] 가 pt[j]보다 크면 pt[i]-pt[j] 작으면 pt[j]-pt[i]
				if (distance < min_distance)	//두수의 거리가 지금까지 구해진 가장작은 거리보다 작으면
				{
					min_distance = distance;	//가장작은 거리 저장
					index1 = i;						//가장작은 숫자의 위치1저장
					index2 = j;						//가장작은 숫자의 위치2저장
				}
			}
		}
		System.out.println( "result = [" + index1 + ", " +index2 + "]" );
	}

}
