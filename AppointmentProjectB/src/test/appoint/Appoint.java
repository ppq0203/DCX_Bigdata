package test.appoint;

import test.date.Date;

public class Appoint extends Date {
	private int hour, minute;
	private String place, member, promiseName;
	@Override
	public String toString() {
		return "Appoint [" + super.toString() + ", hour=" + hour + ", minute=" + minute
				+ ", place=" + place + ", member=" + member + ", promiseName=" + promiseName + "]";
	}

	/**
	 * @param year
	 * @param month
	 * @param day
	 * @param hour
	 * @param minute
	 * @param place
	 * @param member
	 * @param promiseName
	 */
	public Appoint(int year, int month, int day, int hour, int minute, String place, String member,
			String promiseName) {
		super(year, month, day);
		this.hour = hour;
		this.minute = minute;
		this.place = place;
		this.member = member;
		this.promiseName = promiseName;
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public String getPlace() {
		return place;
	}

	public String getMember() {
		return member;
	}

	public String getPromiseName() {
		return promiseName;
	}
	
	public void setHour(int hour) {
		this.hour = hour;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public void setMember(String member) {
		this.member = member;
	}

	public void setPromiseName(String promiseName) {
		this.promiseName = promiseName;
	}

	public void print() {
		System.out.println(toString());
	}
}
