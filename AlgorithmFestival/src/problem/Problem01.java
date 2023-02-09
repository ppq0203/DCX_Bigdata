package problem;
/**
 * 현재몸무게와 목표몸무게를 각각 입력 받고
 * 주차 별 감량몸무게를 입력받아 목표 달성시
 * 축하 메세지를 띄우는 프로그램을 구현하시오	
 */
import java.util.Scanner;	//Scanner클래스를 사용하기 위해 import

public class Problem01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		//input을 쉽게받기위해 사용하는 자바클래스
		System.out.print("현재몸무게 : ");
		int nowWeight = sc.nextInt();					//현재 몸무게를 int값으로 input 받음
		System.out.print("목표몸무게 : ");		
		int goalWeight = sc.nextInt();					//목표 몸무기를 int값으로 input 받음
		
		int week = 1;											//몇주차인지 나타내기위한 값
		int reduceWeight = 0;								//감량 몸무게를 입력받기위한 변수 선언
		while(nowWeight > goalWeight)					//목표 몸무게를 달성할때까지 반복
		{
			System.out.print(week+"주차 감량 몸무게 : ");
			reduceWeight = sc.nextInt();					//목표 몸무기를 input 받음
			nowWeight = nowWeight - reduceWeight;	//현재몸무게를 감량한 값만큼 갱신함
			week++;	//+1주
		}
		System.out.println(nowWeight+"kg 달성!! 축하합니다!");
	}

}
