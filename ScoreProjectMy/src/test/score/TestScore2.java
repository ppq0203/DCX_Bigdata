package test.score;

public class TestScore2 {

	public static void main(String[] args) {
		int score =90;
		try {
			score = Integer.parseInt(args[0]);
		}catch(java.lang.NumberFormatException e) {
			e.printStackTrace();
		}
		if (score > 90)
			System.out.println("A");
		else if (score > 80)
			System.out.println("B");
		else if (score > 70)
			System.out.println("C");
		else if (score > 60)
			System.out.println("D");
		else
			System.out.println("F");
		
		//switch use calculator
		char op= '+';
		int opr1 = 1;
		int opr2 = 2;
		// args[3] = "+-*/"
		
		op = args[3].charAt(2);
		opr1 = Integer.parseInt(args[1]);
		opr2 = Integer.parseInt(args[2]);
		switch(op) {
		case '+' :
			System.out.println(opr1+opr2);
			break;
		case '-' :
			System.out.println(opr1-opr2);
			break;
		case '*' :
			System.out.println(opr1*opr2);
			break;
		case '/' :
			System.out.println(opr1/opr2);
			break;
		default :
			break;
		}
	}

}
