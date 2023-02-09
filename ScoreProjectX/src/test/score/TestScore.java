package test.score;

public class TestScore {

	public static void main(String[] args) {
		int score = 90;

		if (score > 90) {
			System.out.println("A학점");
		}else if (score > 80) {
			System.out.println("B학점");
		}else if (score > 70) {
			System.out.println("C학점");
		}else if (score > 60) {
			System.out.println("D학점");
		}else if (score >= 100) {
			System.out.println("A학점");
		}else{
			System.out.println("F학점");
		}
		
		// 3항 연산자 변경
		String result = "";
		result = (score > 90) ? "A학점" : 
				   ((score > 80) ? "B학점" : 
				   ((score > 70) ? "C학점" : 
				   ((score > 60) ? "D학점" :
				   ((score >= 100) ? "A학점" : "F학점"))));
		System.out.println(result);
		
		//switch
		char c = '+';
		switch (c) {
		case '+': 			System.out.println(score + 10);
			break;
		case '-':			System.out.println(score - 10);
			break;
		default:			System.out.println(score);
			break;
		}

		//switch를 이용하여 계산기 만들기
		char op = '+';		int opr1 = 1;		int opr2 = 2;
		switch (op) {
		case '+':
			System.out.println(opr1 + opr2);
			break;

		case '-':
			System.out.println(opr1 - opr2);
			break;
		case '*':
			System.out.println(opr1 * opr2);
			break;

		case '/':
			System.out.println(opr1 / opr2);
			break;
		}
		

		//switch를 이용하여 학점 출력하기
		score = (score-1) / 10;
		switch (score) {
		case 10: // 100점도 A학점
		case 9:
			System.out.print('A');
			break;

		case 8: 
			// 81 ~ 90점 -> score / 10  :: 8 ~ 9
			// 90점 -> 89로, 81 -> 80 :: score - 1
			System.out.print('B');
			break;

		case 7: 
			System.out.print('C');
			break;

		case 6: 
			System.out.print('D');
			break;

		default:
			System.out.print('F');
		}
		System.out.println(" 학점");
		
		//반복문
		//국어, 영어, 수학 점수에 대해 학점을 출력
		// 90,  80,  95
		String[] classList  = {"국어", "영어", "수학"}; //배열의 초기화  //		String[] classList1 = new String[3];
		int[] scoreList = new int[] {90, 80, 95};
		// 반복해서 학점을 출력
		for (int i = 0; i < scoreList.length; i++) {
			score = scoreList[i];
			System.out.println("과목 : " + classList[i]);
			result = (score > 90) ?"A학점":
							((score > 80) ?"B학점":
								((score > 70) ?"C학점":
									((score > 60) ?"D학점":"F학점")));
			System.out.println(result);
		}// for
		// while(비교){반복할 문장들}
		// 초기값 while(비교){반복할 문장들; 증감치;}

		int i = 0;
		while ( i < scoreList.length) {
			score = scoreList[i];
			System.out.println("과목 : " + classList[i]);
			result = (score > 90) ?"A학점":
							((score > 80) ?"B학점":
								((score > 70) ?"C학점":
									((score > 60) ?"D학점":"F학점")));
			System.out.println(result);
			i++;
		}
		
	}
}







