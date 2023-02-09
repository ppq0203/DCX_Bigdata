package problem;
/**
 * 아래와 같이 학생들의 성적정보가 문자열로 선언되어 있을 때 각 성적별 학생 수를 출력하시오.
 */
public class Problem13 {

	public static void main(String[] args) {
		String score = "A,A,B,C,D,A,C,D,D,D,F";
		int gradeA = 0;
		int gradeB = 0;
		int gradeC = 0;
		int gradeD = 0;
		int gradeF = 0;
		String[] scoreList = score.split(",");	//scoreList에 성적을 하나씩 저장 split(",")은 ,을 기준으로 배열은 나누는 함수
		// 위와같은경우 scoreList = {"A" , "A" , .... , "D", "F"} 형태로 저장됨
		for(int i = 0; i < scoreList.length; ++i)	//scoreList의 배열의 개수만큼 반복
		{
			if (scoreList[i].equals("A"))
				++gradeA;
			else if (scoreList[i].equals("B"))
				++gradeB;
			else if (scoreList[i].equals("C"))
				++gradeC;
			else if (scoreList[i].equals("D"))
				++gradeD;
			else // "F"
				++gradeF;
		}
		System.out.println("A : " + gradeA + "명");
		System.out.println("B : " + gradeB + "명");
		System.out.println("C : " + gradeC + "명");
		System.out.println("D : " + gradeD + "명");
		System.out.println("F : " + gradeF + "명");
	}

}
