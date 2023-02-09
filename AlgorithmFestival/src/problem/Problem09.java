package problem;
/**
 * for문을 사용하여 A~Z까지 출력하시오.
 */
public class Problem09 {

	public static void main(String[] args) {
		for(char chr = 'A'; chr <= 'Z'; ++chr)	//char는 int 호환이므로 A부터 Z까지 코드값이 순서대로 있으므로 1씩더하면서 반복가능
		{
			System.out.print(chr);
		}
	}

}
