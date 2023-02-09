package test.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;

public class TestAPI {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Integer i = 1, e;
		e = i.parseInt("22");
		int k = i.decode("32");
		"hello".toCharArray();
		System.out.println(e + " " + i + " " + k);
		
		System.out.println("입력하세요(ex. +,5,6)");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = "+,2,3";
		s = br.readLine();
		
		String[] s_split = s.split(",");
		
		char op = s_split[0].charAt(0);
		// String -> int :: all String...
		int opr1 = Integer.parseInt(s_split[1]);
		int opr2 = Integer.parseInt(s_split[2]);
		System.out.print("계산기 : " + opr1 + op + opr2 + " = "); // 100 / 5
		switch (op) {
		case '+':
			System.out.println(opr1 + opr2);
			break;

		case '-':
			System.out.println(opr1 - opr2);
			break;
		case 'x':
			System.out.println(opr1 * opr2);
			break;

		case '/':
			System.out.println(opr1 / opr2);
			break;
		}
	}

}
