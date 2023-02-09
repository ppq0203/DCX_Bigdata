package problem;
/**
 * 일한 시간을 입력받아 총 임금을 계산하는 시급계산기입니다.
 * 시급은 5000원이며 8시간보다 초과 근무한 시간에 대해 1.5배의 시급이 책정됩니다.
 */
import java.util.Scanner;	//Scanner클래스를 사용하기 위해 import

public class Problem02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//input을 쉽게받기위해 사용하는 자바클래스
		System.out.print("일한시간을 입력하세요 : ");
		int workTime = sc.nextInt();					//일한시간을 int값으로 input 받음
		int pay = 0;										//임금 합계를 저장할 데이터
		pay = workTime*5000;							//임금은 근무시간*5000원임
		if (workTime > 8)									//8시간 초과 근무하면 50%를 추가로 지급해야하므로
			pay = pay + (workTime-8)*2500;		//초과근무한시간만큼*2500원을 추가로 지급한다.
		System.out.print("총 임금은 : " + pay + "원 입니다.");		
	}

}
