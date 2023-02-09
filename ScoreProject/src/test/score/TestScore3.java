package test.score;

import java.io.IOException;
import java.nio.ByteBuffer;

/** main(String[] args){
 * 		System.in.read();
 * }
 * 
 * @author Anyware
 *
 */
public class TestScore3 {

	public static void main(String[] args) throws IOException {
		// System.in.read()
		// 5 -> 53, 1 -> 49(코드값), (char) 49 -> 1::char
		// 1,    2,   3,   4,   5
		// 49, 50, 51, 52, 53
		System.out.println("연산자, 첫번째 숫자, 두번째 숫자를 띄워서 입력하세요.");
		char op = '+';		int opr1 = 1;		int opr2 = 2;
		
	//read() split
//		String inputstr = "";
//		char c;
//		while ((c=(char)System.in.read()) != '\n')
//		{
//			inputstr += c;
//		}
//		System.out.println("사용자 입력 데이터 :: " + inputstr);
//		int i = 0;
//		String[] oprSet = inputstr.split("\\s+");
//
//		String opStr = oprSet[0];
//		String opr1Str = oprSet[1];
//		String opr2Str = oprSet[2];
	//_read() split end
		
	//read()
		String[] inputList = new String[] {"", "", ""};
		char c;
		// white space filter and input 3 data		
		int i = -1;
		while (true)
		{
			if (Character.isWhitespace((c = (char)System.in.read()))) {
				i++;
				if (i > 2) break;
				while(Character.isWhitespace((c = (char)System.in.read()) ));
			}
			if(i < 0) i=0;
			inputList[i] += c;
			System.out.print("i, c: " + i +","+c);
		}
		
		String opStr = inputList[0];
		String opr1Str = inputList[1];
		String opr2Str = inputList[2];
		
		op = opStr.charAt(0);
		opr1 = Integer.parseInt(opr1Str);
		opr2 = Integer.parseInt(opr2Str);
	//_read() end
		
		//switch를 이용하여 계산기 만들기
		//main(String[] args) -> args[0], args[1], args[2],...
		op = opStr.charAt(0);
		// String -> int :: all String...
		opr1 = Integer.parseInt(opr1Str);
		opr2 = Integer.parseInt(opr2Str);
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







