package festival.algorithm;

import java.util.Scanner;

public class Prob02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ѽð��� �Է��ϼ��� : ");
		int time = sc.nextInt();
		int pay = time*5000;
		if(time>8)
			pay += (time-8)*2500;
		System.out.println("�� �ӱ��� " + pay + "�� �Դϴ�.");
	}

}
