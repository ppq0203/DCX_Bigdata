package problem;
/**
 * 두 개의 정수를 매개변수로 받아 앞의 정수가
 * 뒤의 정수로 나누어지는지를 반별하는 메소드 isDivide()를
 * 작성하세요. 이때, 나누어지면 true,
 * 나누어지지 않으면 false을 반환함.
 */
public class Problem11 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		boolean result = isDivide(num1, num2);
		System.out.println("결과 확인 : " + result);
		num1 = 10;
		num2 = 3;
		result = isDivide(num1, num2);
		System.out.println("결과 확인 : " + result);
	}
	
	static boolean isDivide(int num1, int num2)	//메소드 생성
	{
		boolean result = (num1%num2==0);	//num1이 num2로 나누어지면 true 나누어지지않으면 false
		return result;
	}

}
