package festival.algorithm;

public class Prob28 {

	public static void main(String[] args) {
		String str = "01001101";
		binary_to_ten(str);
		str = "00101000";
		binary_to_ten(str);
	}
	
	public static void binary_to_ten(String str)
	{
		int ten = 0;
		for(int i = 0; i < str.length(); ++i)
		{
			ten *=2;
			ten += (str.charAt(i)-'0');
		}
		System.out.println(str +"(2) = "+ ten + "(10)");
	}

}
