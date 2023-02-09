package test.date;
/**
 * 일정관리 프로그램
 * -핵심모듈 : 날짜 - 객체화 : 클래스를 만들기
 * -Date class
 *  - 연/월/일
 *  - year/month/day
 *  - 추상화 : 프로그램에서 사용할(하는) 데이터 중 일부를 한 개념(class)으로 묶는 것
 * @author Anyware
 *
 */
public class TestDate2 {

	public static void main(String[] args) {
		Date today = new Date();
		today.setYear(44); 							
		today.setMonth(-100); 					
		today.setMonth(500); 			
		today.setDay(300); 					
		today.setMonth(2); 							
		System.out.println(today);
		//birth
		int yearBirth = 2002; 						//-infinity ~ infinity
		int monthBirth = 2; 						//1 ~ 12
		int dayBirth = 14; 							//1 ~ 31
		System.out.println(yearBirth + "년"  + monthBirth + "월" + dayBirth + "일");
		
	}

}
