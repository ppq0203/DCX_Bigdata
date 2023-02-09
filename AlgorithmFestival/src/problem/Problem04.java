package problem;
/**
 * 거스름돈을 입력 받아 내어줘야 하는 지폐의 개수를 출력하는 프로그램을 작성하시오.
 * 단, 최대단위는 10000원, 최소단위는 100원
 */
import java.util.Scanner;	//Scanner클래스를 사용하기 위해 import

public class Problem04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//input을 쉽게받기위해 사용하는 자바클래스
		System.out.print("총금액 입력 : ");
		int total_money = sc.nextInt();						//총 금액을 int값으로 입력받음
		System.out.println("잔돈 : "+total_money + "원");
		int _10000won = total_money/10000;				//10000원의 개수 저장
		total_money = total_money%10000;				//10000원으로 바꾸지않은 나머지 금액 저장
		System.out.println("10000원 : "+_10000won + "개");
		int _5000won = total_money/5000;					//나머지 금액에서 5000원 개수 저장
		total_money = total_money%5000;					//5000원으로 바꾸지않은 나머지 금액 저장
		System.out.println("5000원 : "+_5000won + "개");
		int _1000won = total_money/1000;					//나머지 금액에서 1000원 개수 저장
		total_money = total_money%1000;					//1000원으로 바꾸지않은 나머지 금액 저장
		System.out.println("1000원 : "+_1000won + "개");
		int _500won = total_money/500;					//나머지 금액에서 500원 개수 저장
		total_money = total_money%500;					//500원으로 바꾸지않은 나머지 금액 저장
		System.out.println("500원 : "+_500won + "개");
		int _100won = total_money/100;					//나머지 금액에서 100원 개수 저장
		total_money = total_money%100;					//100원으로 바꾸지않은 나머지 금액 저장 (의미없음)
		System.out.println("100원 : "+_100won + "개");
		
	}

}
