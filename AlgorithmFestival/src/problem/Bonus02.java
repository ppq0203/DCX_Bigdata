package problem;
/**
 * 가운데 글자 구하기
 * getMiddle메소드는 하나의 단어를 입력 받습니다.
 * 단어를 입력 받아서 가운데 글자를 반환하도록 getMiddle메소드를 만들어보세요.
 * 단어의 길이가 짝수일 경우 가운데 두글자를 반환하면 됩니다.
 * 예를드러 입력받은 단어가 power이라면 w를 반환하면 되고,
 * 입력받은 단어가 power이라면 w를 반환하면 되고,
 * 입력받은 단어가 test라면 es를 반환하면 됩니다.
 */

public class Bonus02 {

	public static void main(String[] args) {
		System.out.println(getMiddle("power"));
		System.out.println(getMiddle("test"));		
	}

	static String getMiddle(String str)
	{
		int length = str.length();
		String outString = "";
		if(length%2 == 0)		//str의 길이가 짝수일때
		{
			outString = outString + str.charAt(length/2-1) + str.charAt(length/2);	//length/2-1번 과 length/2번 번호를 갖는 char들 저장
		}
		else						//str의 길이가 홀수일때
		{
			outString = outString + str.charAt(length/2);									//length/2번 번호를 갖는 char 저장
		}
		return outString;
	}
}
