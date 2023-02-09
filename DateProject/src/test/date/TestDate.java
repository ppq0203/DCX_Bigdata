package test.date;
/**
 * 일정관리 프로그램
 * -핵심모듈 : 날짜
 *  - 연/월/일
 *  - year/month/day
 * -test -> today, birthDay
 * 
 * @author Anyware
 *
 */
public class TestDate {

	public static void main(String[] args) {
		//today
		int year = 2023; //-infinity ~ infinity
		int month = 1; //1 ~ 12
		int day = 30; //1 ~ 31
		System.out.println(year + "년"  + month + "월" + day + "일");
		//birth
		int yearBirth = 2002; //-infinity ~ infinity
		int monthBirth = 2; //1 ~ 12
		int dayBirth = 14; //1 ~ 31
		System.out.println(yearBirth + "년"  + monthBirth + "월" + dayBirth + "일");
		
	}

}
