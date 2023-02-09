package festival.algorithm;

public class Prob13 {

	public static void main(String[] args) {
		String score = "A,A,B,C,D,A,C,D,D,D,F";
		
		String[] grade_name = {"A", "B", "C", "D", "F"};
		int[] grade = new int[5];
		
		for(String element : score.split(","))
		{
			for(int i = 0; i < 5; i++)
			{
				if(grade_name[i].equals(element))
					grade[i]++;
			}
		}
		
		for(int i = 0; i < 5; ++i)
		{
			System.out.println(grade_name[i] + " : " + grade[i] + "��");
		}
	}

}
