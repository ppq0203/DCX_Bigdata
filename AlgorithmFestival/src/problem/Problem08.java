package problem;
/**
 * 정수를 입력받아 1의 자리에서 반올림 한 결과를 출력하시오.
 */
import java.util.Scanner;	//Scanner클래스를 사용하기 위해 import

public class Problem08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//input을 쉽게받기위해 사용하는 자바클래스
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();	//숫자갑 입력받음
		if(num%10 < 5)
			num = num/10*10;	//int는 소숫점을 버리므로 10을나누고 10을곱하면 1의자리를 버린다.
		else	//(num%10>=5)
			num = num/10*10+10;	//1의 자리를 버린뒤 10을 더한다.
		
		System.out.println("반올림 수 : " + num);
	}

}
