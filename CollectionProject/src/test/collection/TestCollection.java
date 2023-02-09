package test.collection;

import java.util.ArrayList;

import test.appoint.Appoint;
import test.date.Date;

public class TestCollection {

	public static void main(String[] args) {
		int year = 2000; int month = 1; int day = 1; 
		int hour = 12; int minute = 20; String place = "우리집";	String person = "애인"; 
		String subject = "식사";
		ArrayList date = new ArrayList();
		for (int i = 0; i < 10; i++) {
			double random = Math.random(); // 0.0 <= x < 1.0, psudo random
			int randInt = (int) (random* 100); // 0 ~ 99
			if (randInt%2 == 0) {
				date.add(new Date(++year, ++month, ++day));
			} else {
				date.add(new Appoint(year, month, day, ++hour, (minute += 10), place+1,
						person+1, subject+1));
			}
		}// for end
		for (Object date2 : date) {
			Date dateElement = (Date) date2;
			dateElement.print();
			// class cast는 꼭!!! instanceof와 함께...
			if (date2 instanceof Appoint) {
				Appoint app = (Appoint) date2;
				subject = app.getSubject();
			}
		}
	}

}
