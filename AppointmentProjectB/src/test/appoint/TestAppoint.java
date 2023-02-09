package test.appoint;
import test.date.Date;

public class TestAppoint {

	public static void main(String[] args) {
		Appoint appoint = new Appoint(2002, 2, 14, 17, 30, "애슐리", "가족", "생일잔치");
		appoint.print();
		Date birth = new Date(2002,2,14);
		birth.print();
	}

}
