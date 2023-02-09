package problem;

public class Problem28 {

	public static void main(String[] args) {
		String str = "01001101";
		System.out.println(bToTen(str) + "(10)");
		str = "00101000";
		System.out.println(bToTen(str) + "(10)");
	}
	
	static int bToTen(String str)
	{
		int result = 0;
		for(int i = 0; i < str.length(); ++i)
		{
			result = result*2 + str.charAt(i)-'0';
		}
		return result;
	}
}
