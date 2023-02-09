package test.date;
/**
 * 날짜 클래스를 만들기
 * -Date class
 *  - 연/월/일
 *  - year/month/day
 *  day : 각 월마다 말일이 다르다.
 *  1월 - 31일, 2월 - 28일, 3월....
 *  하나의 변수 : lastDayOfMonth
 *  값은 12개
 *  ---> 배열 :: lastDayOfMonth = {31, 28, }
 * @author Anyware
 *
 */
public class Date {

	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	@Override
	public String toString() {
		return year + "년"  + getMonth() + "월" + getDay() + "일";
	}
	public int getMonth() {
		return month;
	}
	/**
	 * private으로 보호된 this.month에 외부의 값을 지정하는 인터페이스
	 * 
	 * @param month : 1미만은 1로 자동 변환, 12초과는 12로 자동 변환
	 */
	public void setMonth(int month) {
		// 오류 발생 : 외부에서 -100
		if (month < 1) {
			month = 1;
		}
		// 오류 발생 : 외부에서 500
		if (month > 12) {
			month = 12;
		}
		if (month == 2)
			lastDayOfMonth[1] = checkLunar();	
		this.month = month;
		setDay(day); 							//setDay(this.day);
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {		
		if (day < 1) {
			day = 1;
		}else if (day > lastDayOfMonth[month-1]) {
			day = lastDayOfMonth[month-1];
		}
		this.day = day;
	}
	/**
	 * 윤년을 검사해서 2월의 마지막 값을 지정
	 * 기본 2월 28일
	 * 4년으로 나눠서 떨어질 경우 29
	 * 100년으로 나눠서 떨어질 경우 28
	 * 400년으로 나눠서 떨어질 경우 29
	 * 
	 * @return 2월의 마지막날
	 */
	private int checkLunar()
	{
		return ( (year!=0 && (year&3) ==0 && (year%100!=0 || year%400 ==0) ) ?29:28 );
//		return ( year!=0&&(( (year&3) ==0&&year%100!=0)||year%400 ==0) ?29:28 );
//		return (year%4!=0? 28:
//					(year%100!=0? 29:
//						(year%400!=0? 28 :29 ) ) );
//		return (year%400==0?29:
//			(year%100==0?28:
//				(year%4==0?29:28 ) ) );
		
	}
	/**
	 * 날짜 클래스의 연도 : -무한대 ~ 무한대(-infinity ~ infinity)
	 */
	public int year;
	/**
	 * 날짜 클래스의 월 : 1 ~ 12
	 */
	private int month;
	/**
	 * 날짜 클래스의 일자 : 1 ~ 31
	 */
	private int day;
	private int[] lastDayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public void print() {
		System.out.println(toString());
		
	}
	
}
