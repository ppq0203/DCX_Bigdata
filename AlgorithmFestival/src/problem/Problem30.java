package problem;

import java.util.Scanner;

public class Problem30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("==== 알파벳 빈도수 구하기 ====\n입력>> ");
		int[] alpabetCount = new int['z'-'a'];
		char c;
		String inputStr = sc.nextLine();
		for (int i = 0; i < inputStr.length(); ++i)
		{
			c = inputStr.charAt(i);
			if(c >= 'a' && c <= 'z')
			{
				++alpabetCount[c-'a'];
			}
			else if (c >= 'A' && c <= 'Z')
			{
				++alpabetCount[c-'A'];				
			}
		}
		for(int i = 0; i < 'z'-'a'; ++i)
		{
			System.out.println((char)('a'+i) + " : " + alpabetCount[i]);
		}
	}

}
