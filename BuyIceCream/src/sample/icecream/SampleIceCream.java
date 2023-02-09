package sample.icecream;
/**<pre>
 * 심부름>>>
[요구사항] : 누가바라는 아이스크림을 사오는 프로그램
[분석]
컴퓨터 : 5,6살 꼬마 
목적 : 아이스크림 사오기
조건 : 편의점(cu::CU)에서 사온다...
데이터 : 	결과값 : "누가바"
				입력값 : 돈(1000원)
[설계] : 순차적 프로세스
[구현] : Java
-. Algorithm
(우리집:나, 꼬마)
1. 나는 꼬마에게 왼손 줘봐.
1-1. left(hand)
2. 나는 꼬마의 왼손에 1000원을 (쥐어)준다.
2-1. left = 1000 또는 left <- 1000
3. 나는 꼬마에게 (명령) "아이스크림(누가바)을 사와"라고 얘기한다.
3-1. buyIcecream(left)
3-2. right = [3]
(거리 : 꼬마)
4. 꼬마는 편의점(CU)에 도착한다.
4-1. new CU
5. 꼬마는 편의점(주인/점원)에 (명령)"아이스크림(누가바) 주세요(가져오세요)"라고 얘기한다.
5-1. [4번].getIcecream(left)
5-2. result = [5-1]
(편의점 : 편의점(주인/점원))
6. 편의점 주인은 매대(냉동고)에서 "누가바"라는 아이스크림을 가져온다.
6-1. "누가바"
7. 편의점 주인은 꼬마에게 오른손에 아이스크림을 준다(5번에 대한 답변).
7-1. return [6]
(우리집)
8. 나는 꼬마의 오른손에 있는 아이스크림을 꺼내 든다:출력
8-1. syso(right)

 * @author 김대현
 *</pre>
 */
public class SampleIceCream {

	public static void main(String[] args) {
		String hello = "Hello.....";
		// TODO Auto-generated method stub
		System.out.println(hello);
//(우리집:나, 꼬마)
//1. 나는 꼬마에게 왼손 줘봐;
Object left;
//2. 나는 꼬마의 왼손에 1000원을 (쥐어)준다.
left = 1000;
//3. 나는 꼬마에게 (명령) "아이스크림(누가바)을 사와"라고 얘기한다.

Object right = buyIcecream(left);

//(우리집)
//8. 나는 꼬마의 오른손에 있는 아이스크림을 꺼내 든다:출력
System.out.println(right);

	}

	private static Object buyIcecream(Object left) {
		// TODO Auto-generated method stub
	//(거리 : 꼬마)
	//4. 꼬마는 편의점(CU)에 도착한다.
	CU cu = new CU();
	//5. 꼬마는 편의점(주인/점원)에 (명령)"아이스크림(누가바) 주세요(가져오세요)"라고 얘기한다.
	Object result = cu.getIcecream(left);

	return result;
	}

}
