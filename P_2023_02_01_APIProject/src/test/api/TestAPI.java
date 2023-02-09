package test.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * API : Application Programming Interface
 *  cf) library
 * 종류 : 2종(객체함수, 클래스함수)
 * 객체함수 : 일반함수
 * 사용법 : Date d = new Date(); d.getYear();
 * 클래스함수 : static로 지정된 함수
 * 사용법 : Integer i; Integer.parseInt("1");
 * 
 * @author Anyware
 *
 */
public class TestAPI {

	public static void main(String[] args) throws IOException {
		String s = "120";
		//s -> int형으로 변환(캐스트는 안됨)
		// 리터럴의 개념을 바탕으로 변환함수를 리터럴클래스에서 찾는다.
		int i = Integer.decode(s);
		System.out.println(i);
		s = "hello";
		// s -> char형으로 변환(캐스트 안됨)
		// 문자열 -> 문자의 배열(≠char[])
		// 문자의 배열 중 몇번째 것?(인덱스 : index, idx)
		char c = s.charAt(0);
		s = "+,2,3";
		// 2 + 3을 연산하세요.
		// 순서를 한글로 쓰고, 
		// 해당 변수(op, opr1, opr2)을 선언해서
		// s를 윗줄의 변수에 담아(변환) 
		// 연산하고 출력.
		/*
		 * 1. op = ?; opr1 = ?; opr2 = ?
		 * 2. s -> op; s -> opr1; s -> opr2;
		 * 3. result = opr1 + op + opr2;// int, char, int
		 *   3-1. op가 '+'라면... 코드...
		 * 4. syso(result); 
		 */
		s = ""; // 사용자 입력을 받을 겁니다.
		// 목적 : readln() : String, readLine() : String
		// 입력 : System.in
//		System.in : InputStream
//		BufferedReader.readLine() : String
//		InputStreamReader(InputStream in) 
		System.out.println("입력하세요(ex. +,5,6)");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		s = br.readLine();
		
		 char op = '+';
		 int opr1 = 2;
		 int opr2 = 3;
		 op = s.charAt(0);
		//"+,2,3" -> "2"
		 String opr1Str = "2";
		 
		 opr1Str = s.substring(2, 3);
		 opr1 = Integer.parseInt(opr1Str); 
		 String opr2Str = s.substring(4, 5);
		 opr2 = Integer.parseInt(opr2Str);
		 int result = 0;
		 if (op == '+') {
			result = opr1 + opr2;
		}
		 System.out.println(result);
		 
	}

}




