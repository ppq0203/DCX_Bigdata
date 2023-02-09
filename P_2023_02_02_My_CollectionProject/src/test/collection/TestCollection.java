package test.collection;

import java.util.ArrayList;
import java.util.List;

import test.appoint.Appoint;
import test.date.Date;

public class TestCollection {

	public static void main(String[] args) {
		int year = 2000;
		int month = 1;
		int day = 1;
		int hour = 1;
		int minute = 0;
		String place = "house";
		String person = "family";
		String subject = "dinner";
		
		List<Date> date = new ArrayList<Date>();
//		Date[] date = new Date[10];
		for (int i = 0; i < 10; i++) {
			double random = Math.random(); // 0.0 <= x < 1.0, psudo random
			int randInt = (int) (random* 100); // 0 ~ 99
			if (randInt%2 == 0) {
				date.add(new Date(++year, ++month, ++day));
			} else {
				date.add(new Appoint(++year, ++month, ++day, ++hour, (minute+=5), place+i, person+i, subject+i));
			}
		}// for end
		for (Date date2 : date) {
			date2.print();
			// class cast는 꼭!!! instanceof와 함께...
			if (date2 instanceof Appoint) {
//				Appoint app = (Appoint) date2;
//				System.out.println(app.getSubject());
			}
		}
	}

}