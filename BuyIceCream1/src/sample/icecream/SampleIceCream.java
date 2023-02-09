package sample.icecream;
/**<pre>
	심부름 >>>
	요구사항 : 누가바 아이스크림 사오는 프로그램
	분석
	컴퓨터 : 5,6살 꼬마
	목적 : 아이스크림 사오기
	조건 : 편의점(cu::CU)에서 사온다
	데이터 : 	결과값:"누가바"
				입력값: 돈(1000원)
	설계 : 순차적 프로세스
	[구혐] : Java
	-. Algorithm
	(우리집: 나, 꼬마)
	1. 나는 꼬마에게 왼손 줘바
	1-1. left(hand)
	2. 나는 꼬마의 왼손에 1000원을 (쥐어)준다.
	2-1 left = 1000
 * @author a
 * </pre>
 */
public class SampleIceCream {

	public static void main(String[] args) {
		String hello = "Hello...";
		System.out.println(hello);
		
//(우리집: 나, 꼬마)
//1. 나는 꼬마에게 왼손줘봐
Object left;
//2. 나는 꼬마의 왼손에 1000원을 준다.
//2-1 left = 1000 or left <- 1000
left = 1000;
//3. 나는 꼬마에게 (명령) "아이스크림(누가바)을 사와" 라고 이야기한다.
Object right = buyIcecream(left);
//(우리집)
//8. 나는 꼬마의 오른손에 있는 아이스크림을 꺼내든다: 출력
System.out.println(right);
	}
	
	private static Object buyIcecream(Object left)
	{

	//(거리 : 꼬마)
	//4. 꼬마는 편의점(CU)에 도착한다.
	CU cu = new CU();
	//5. 꼬마는 편의점(주인/점원)에 (명령)"아이스크림(누가바) 주세요(가져오세요)"라고 얘기한다.
	Object result = cu.getIcecream(left);

		return result;
	}

}
