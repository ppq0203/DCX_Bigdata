package festival.algorithm;

import java.util.HashSet;
import java.util.Set;

public class Prob18 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		while(set.size()<6)
		{
			set.add((int) (Math.random()*100));
		}
		for(int num : set)
		{
			System.out.println("����Ǽ��� : " + num);
		}
	}

}