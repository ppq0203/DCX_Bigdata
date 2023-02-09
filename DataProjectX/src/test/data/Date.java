package test.data;
/**
 * make date class
 * -Date class
 *  -year/month/day
 *  day : each month different last day
 *  1-31, 2-28, 3....
 */


public class Date {
	/**
	 * date class's day : 1~31
	 */
	private int day;
	/**
	 * date class's month : 1~12
	 */
	private int month;
	/**
	 * date class's year : -infinity~infinity
	 */
	public int year;
	private int[] lastDayOfMonth = {31, 28 ,31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		//err input -100
		if (month < 1) {
			month = 1;
		}
		//err input 100
		else if (month > 12) {
			month = 12;
		}
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		//err input -100
		if (day < 1) {
			day = 1;
		}
		//err input 100
		else if (day > lastDayOfMonth[month-1]) {
			day = lastDayOfMonth[month-1];
		}
		this.day = day;
	}
	
}
