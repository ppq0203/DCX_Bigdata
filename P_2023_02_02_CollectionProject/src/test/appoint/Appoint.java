package test.appoint;

import test.date.Date;

public class Appoint extends Date {
	private int hour, minute;
	private String place, person, subject;
	@Override
	public String toString() {
		return "Appoint ["+super.toString()+", hour=" + hour + ", minute=" + minute
				+ ", place=" + place + ", person=" + person + ", subject=" + subject + "]";
	}
	public Appoint(int year, int month, int day, int hour, int minute, String place,
			String person, String subject) {
		super(year, month, day);
		this.hour = hour;
		this.minute = minute;
		this.place = place;
		this.person = person;
		this.subject = subject;
	}
	public Appoint() {
		// TODO Auto-generated constructor stub (*)
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
	public String getPerson() {
		return person;
	}
	public String getSubject() {
		return subject;
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
	public void setPerson(String person) {
		this.person = person;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

}
