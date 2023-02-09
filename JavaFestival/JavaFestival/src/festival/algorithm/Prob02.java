package festival.algorithm;

import java.util.Scanner;

public class Prob02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("일한시간을 입력하세요 : ");
		int time = sc.nextInt();
		int pay = time*5000;
		if(time>8)
			pay += (time-8)*2500;
		System.out.println("총 임금은 " + pay + "원 입니다.");
	}

}
