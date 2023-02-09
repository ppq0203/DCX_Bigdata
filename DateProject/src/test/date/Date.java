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
	/**
	 * 생성자
	 * 이름 : 클래스와 동일
	 * 다형성 : 여러개 만들 수 있음 <- ()가 다르면 가능.
	 * 사용법 : new명령으로 객체 메모리를 생성할 때만 사용가능.
	 * super() : 부모의 생성자
	 * this() : 자신의 생성자
	 * super() 와 this()는 꼭!!! 생성자 코드블럭의 첫째줄만 코딩가능!
	 * 
	 * @param year
	 * @param month
	 * @param day
	 */
	public Date(int year, int month, int day) {
		this.setYear(year);
		this.setMonth(month);
		this.setDay(day);
	}
	public Date() {
//		month = 1; day = 1;
		this(1900, 1, 1);
	}
	@Override
	public String toString() {
		return getYear() + "년"  + getMonth() + "월" + getDay() + "일";
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
		this.month = month;
		if(month == 2) lastDayOfMonth[1] = checkLunar(); // 2월의 경우만 수행 (*)
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
//		System.out.println("checkLunar() :: " + checkLunar());
	}
	/**
	 * 윤년을 검사해서 2월의 마지막 값을 지정 : lastDayOfMonth[1]
	 * 기본 2월 28일
	 * 4년으로 나눠서 떨어질 경우 29
	 * 100년으로 나눠서 떨어질 경우 28
	 * 400년으로 나눠서 떨어질 경우 29
	 * 
	 * @return 2월의 마지막날
	 */
	private int checkLunar()
	{	
		int result = 28;
		 // 0년 + 4년마다 + 100년마다 + 400년마다 를 하나의 if(논리연산)으로 합치기.(*)
		if ((((getYear() % 4) == 0)&&((getYear() % 100) != 0)||((getYear() % 400) == 0))&&(getYear() != 0)) 
//			if (((getYear() % 4) == 0)&&((getYear() % 100) != 0)||((getYear() % 400) == 0))  // 0년 + 4년마다 + 100년마다 + 400년마다 를 하나의 if(논리연산)으로 합치기.(*)
//			if (((getYear() % 4) == 0)&&!((getYear() % 100) == 0)&&((getYear() % 400) != 0))  // 0년 + 4년마다 + 100년마다 + 400년마다 를 하나의 if(논리연산)으로 합치기.(*)
		{	result = 29;
		}else 
		{	result = 28;
		}
		return result;
//		return (getYear() == 0)?28:result; // 0년에 대한 처리
	}
	public int getYear() {
		return year;
	}
	public String toStringYear() {
		return ""+year;
	}
	public void setYear(int year) {
		this.year = year;
		setMonth(month);
	}
	/**
	 * 날짜 클래스의 연도 : -무한대 ~ 무한대(-infinity ~ infinity)
	 */
	private int year = 1900;
	/**
	 * 날짜 클래스의 월 : 1 ~ 12
	 */
	private int month;
	float f = 0.0F;
	/**
	 * 날짜 클래스의 일자 : 1 ~ 31
	 */
	private int day;
	private int[] lastDayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public void print() {
		System.out.println(this);
	}
	
}
