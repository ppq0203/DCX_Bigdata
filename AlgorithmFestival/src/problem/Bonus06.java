package problem;

public class Bonus06 {

	public static void main(String[] args) {
		int base = 2;
		int n = 3;
		int result = powerN(base, n);
		System.out.println("결과 확인 : " + result);
		base = 3;
		n = 3;
		result = powerN(base, n);
		System.out.println("결과 확인 : " + result);
		base = 10;
		n = 2;
		result = powerN(base, n);
		System.out.println("결과 확인 : " + result);
	}
	
	static int powerN(int base, int n)
	{
		int result = 1;
		while(n-->0)
		{
			result*=base;
		}
		return result;
	}
}
