package problem;
/**
 * num1, num, op (+,-,*,/)를 매개변수로 받아 num1
 * 과 num2를 op에 맞게 연산한 결과값을
 * 반환해주는 cal 메소드를 작성하세요.
 */

public class Bonus03 {

	public static void main(String[] args) {
		int num1 = 50;
		int num2 = 15;
		char op = '-';
		System.out.println(cal(num1, num2, op));
		op = '*';
		System.out.println(cal(num1, num2, op));
	}
	
	static int cal(int num1, int num2, char op)
	{
		int result = 0;
		switch (op)
		{
			case '+':	//op가 '+'면 +연산
				result = num1+num2;
				break;
			case '-':		//op가 '-'면 -연산
				result = num1-num2;
				break;
			case '*':	//op가 '*'면 *연산
				result = num1*num2;
				break;
			case '/':		//op가 '/'면 +/연산
				result = num1/num2;
				break;		
		}
		return result;
	}
}
