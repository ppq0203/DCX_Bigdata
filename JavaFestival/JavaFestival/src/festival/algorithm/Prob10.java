package festival.algorithm;

public class Prob10 {

	public static void main(String[] args) {
		int[] list = new int[8];
		int min = 10000;
		int max = -1;
		for(int i = 0; i < 8; ++i)
		{
			list[i] = (int)(Math.random()*100);
			min = min>list[i]?list[i]:min;
			max = max<list[i]?list[i]:max;
		}
		System.out.print("�迭�� �ִ� ��� �� : ");
		for(int i=0; i < 8; ++i)
			System.out.print(" " + list[i]);
		System.out.println();
		System.out.print("���� ū �� : ");
		System.out.println(max);
		System.out.print("���� ���� �� : ");
		System.out.println(min);
	}

}
