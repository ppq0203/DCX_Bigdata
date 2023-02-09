package test.score;

import java.util.Scanner;

public class TestScore {

	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		int score = -1000;
		System.out.print("input score : ");
		// score=sc.nextInt();
		/*
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
		*/
		
		//score=>100 은 score>90에 포함되기때문에 의미없다 오히려 속도만 저해한다.
		System.out.println((score>90)?"A":((score>80)?"B":((score>70)?"C":((score>60)?"D":"F"))));
		
		//switch
		/*
		char op= '+';
		
		switch(op) {
		case '+' :
			System.out.println(score+10);
			break;
		case '-' :
			System.out.println(score-10);
			break;
		default :
			System.out.println(score);
			break;
		}
		*/
		
		//switch use calculator
		/*
		char op= '+';
		int opr1 = 1;
		int opr2 = 2;
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
		*/
		//grade use switch
		score = 10000;
		String grade = "";
		switch((score-1)/10) {
		case 9:
			grade ="A";
			break;
		case 8:
			grade ="B";
			break;
		case 7:
			grade ="C";
			break;
		case 6:
			grade ="D";
			break;
		default :
			switch(score/Math.abs(score)) {
			case -1:
				grade ="F";
				break;
			default :
				switch(score/100) {
				case 0:
					grade ="F";
					break;
				default :
					grade ="A";
					break;
				}
			}
		}
		System.out.println(grade+"학점");

		String[] classList = {"KOR","ENG","MATH"};
		String[] classList1 = new String[3];
		int[] scoreList = new int[] {90,80,70};
		
		for(int i = 0; i < classList.length; i++)
		{
			score = scoreList[i];
			System.out.println(classList[i]+" : " + ((score>90)?"A":((score>80)?"B":((score>70)?"C":((score>60)?"D":"F")))));
		}
		int i =0;
		while(i < classList.length)
		{
			score = scoreList[i];
			System.out.println(classList[i]+" : " + ((score>90)?"A":((score>80)?"B":((score>70)?"C":((score>60)?"D":"F")))));
			++i;
		}
	}

}
