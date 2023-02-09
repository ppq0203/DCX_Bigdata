package sample.icecream;
/**<pre>
	�ɺθ� >>>
	�䱸���� : ������ ���̽�ũ�� ����� ���α׷�
	�м�
	��ǻ�� : 5,6�� ����
	���� : ���̽�ũ�� �����
	���� : ������(cu::CU)���� ��´�
	������ : 	�����:"������"
				�Է°�: ��(1000��)
	���� : ������ ���μ���
	[����] : Java
	-. Algorithm
	(�츮��: ��, ����)
	1. ���� �������� �޼� ���
	1-1. left(hand)
	2. ���� ������ �޼տ� 1000���� (���)�ش�.
	2-1 left = 1000
 * @author a
 * </pre>
 */
public class SampleIceCream {

	public static void main(String[] args) {
		String hello = "Hello...";
		System.out.println(hello);
		
//(�츮��: ��, ����)
//1. ���� �������� �޼����
Object left;
//2. ���� ������ �޼տ� 1000���� �ش�.
//2-1 left = 1000 or left <- 1000
left = 1000;
//3. ���� �������� (���) "���̽�ũ��(������)�� ���" ��� �̾߱��Ѵ�.
Object right = buyIcecream(left);
//(�츮��)
//8. ���� ������ �����տ� �ִ� ���̽�ũ���� �������: ���
System.out.println(right);
	}
	
	private static Object buyIcecream(Object left)
	{

	//(�Ÿ� : ����)
	//4. ������ ������(CU)�� �����Ѵ�.
	CU cu = new CU();
	//5. ������ ������(����/����)�� (���)"���̽�ũ��(������) �ּ���(����������)"��� ����Ѵ�.
	Object result = cu.getIcecream(left);

		return result;
	}

}
