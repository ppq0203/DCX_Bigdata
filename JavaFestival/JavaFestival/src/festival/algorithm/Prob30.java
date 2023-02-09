package festival.algorithm;

import java.util.Scanner;

public class Prob30 {

	public static void main(String[] args) {
		int word_num = 'z'-'a';
		int[] word_count = new int[word_num];
		Scanner sc = new Scanner(System.in);
		System.out.println("==== ���ĺ� �󵵼� ���ϱ� ====");
		System.out.print("�Է�>> ");
		String input = sc.nextLine();
		for(int i =0; i < input.length(); i++)
		{
			if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z')
				word_count[input.charAt(i)-'a']++;
			else if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z')
				word_count[input.charAt(i)-'A']++;
		}
		
		for(int i = 0; i < word_num; ++i)
			System.out.println((char)('a'+i) + " : " + word_count[i]);
	}

}
