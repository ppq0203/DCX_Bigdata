package problem;
/**
 * 아래와 같은 2차원 배열을 왼쪽으로 90도 회전하여 출력하시오.
 */
public class Problem23 {public Problem23() {
	// TODO Auto-generated constructor stub
}
	public static void main(String[] args) {
		int[][] intArray = {
									{1,2,3,4,5},
									{6,7,8,9,10},
									{11,12,13,14,15},
									{16,17,18,19,20},
									{21,22,23,24,25}
								  };
		int[][] rotationArray = new int[5][5];
		for (int i = 0; i < 5; ++i)
		{
			for (int j = 0; j < 5; ++j)
			{
				rotationArray[4-j][i] = intArray[i][j];
			}
		}
		for (int i = 0; i < 5; ++i)
		{
			for (int j = 0; j < 5; ++j)
			{
				System.out.print(rotationArray[i][j] + " ");
			}
			System.out.println();
		}
	}

}
