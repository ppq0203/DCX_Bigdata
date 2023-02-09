package test.appoint;

import test.date.Date;
/**
 * 배열 : Array
 * [] : 보조 데이터 타입 - 모든 데이터타입에 붙여 같은 타입의 여러 데이터를 갖는 변수를 선언.
 * ex) int[] intArray;  intArray = new int[10];
 *      String[] strArray = {"개구리", "올챙이", "두꺼비"}; //배열 초기화
 *      intArray[0] = 1;
 *      String s = strArray[1];
 *      다차원 배열
 *      int[][][] iArray = new int[1][2][]; iArray[0][0] = int[5];
 *      
 * @author Anyware
 *
 */
public class TestAppoint2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Appoint appoint = new Appoint(2002, 2, 14, 17, 30, "애슐리", "가족", "생일잔치");
//		appoint.print();
//		Date birth = new Date(2002, 2, 14);
//		birth.print();
//		
//		//상속 :  Date 객체(값, new)
//		//           ↑ (is a)
//		//       Appoint 객체
//		Date d = new Date();
//		Appoint a = new Appoint();
//		d = a; //이 코드가 주석이 되면 java.lang.ClassCastException라는 RuntimeException 발생
////		try {
////			a = (Appoint) d;
////			a.getPlace();
////		} catch (java.lang.ClassCastException e) {
////			System.out.println("변환 불가");
////		} 
//		// new로 만들어진 객체의 실제 타입 : Runtime data type (↔ Compile data type, 선언시 타입)
//		if (d instanceof Appoint) {
//			a = (Appoint) d;
//			System.out.println(a.getPlace());
//		}
//		
		Date[] date = new Date[10];
		for (int i = 0; i < date.length; i++) {
			double random = Math.random(); // 0.0 <= x < 1.0, psudo random
			int randInt = (int) (random* 100); // 0 ~ 99
			if (randInt%2 == 0) {
				date[i] = new Date();
			} else {
				date[i] = new Appoint();
			}
		}// for end
		for (Date date2 : date) {
			date2.print();
			// class cast는 꼭!!! instanceof와 함께...
			if (date2 instanceof Appoint) {
				Appoint app = (Appoint) date2;
				System.out.println(app.getSubject());
			}
		}
	}

}







