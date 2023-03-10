package test.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

import test.appoint.Appoint;
import test.date.Date;
/**
 * Collection API
 * Collection - 선언용, 사용하지 않음
 * List extends Collection
 * 특징 : index(순서) 제공, 중복 허용
 * 대표 : ArrayList, LinkedList
 *         add(Object), remove(int), get(int), size()
 * Set extends Collection
 * 특징 : index 없음, 중복 허용 안됨
 * 대표 : HashSet, BitSet, SortedSet
 *         add(Object), remove(Object), get(Object), size()
 *         
 * @author Anyware
 *
 */
public class TestCollection2 
{

	public static void main(String[] args) 
	{	//배열
		Object[] array = {1, 'c', "string", true, 3.14, new Date()};
		              //{new Integer(1), new Character('c'), new String("string"), new Boolean(true)}
		System.out.println(array[3]);
		// List
//		ArrayList array2 = new ArrayList();
		// 첨삭이 잦을 경우(add(int, Object), remove(int))
		LinkedList array2 = new LinkedList(); 
		array2.add(1);   array[0] = 1;
		array[1] = 35;	array2.add(35);
//		array2 = array;
		// 배열을 List로 복사하기
		for (Object object : array) {
			array2.add(object);
		}
		System.out.println(array2);
		// List를 배열로 복사하기
		array = array2.toArray();
		// 배열에서 원하는 데이터를 찾는 법
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(true)) {
				System.out.println(array[i]);
			}
		}
		// List에서 원하는 데이터를 찾는 법
		System.out.println("true값을 찾기::" + array2.indexOf(true) + "에 있는 " + array2.get(array2.indexOf(true)));
		
		// List에서 필요없는 데이터 삭제하는 법
		array2.remove(4);
		System.out.println("4번째 값 제거 후\n" + array2);
		// List에 있는 데이터를 변경하는 법
		System.out.println("값 변경 전::" + array2);
		System.out.println("변경 대상::" + array2.get(0));
		array2.set(0, "100");
		System.out.println("변경 완료::" + array2.get(0));
		System.out.println("값 변경 후::" + array2);
		System.out.println("===========================");
		
		HashSet set;
//		HashSet set = new HashSet();
//		set.addAll(array2);
//		System.out.println("array -> set \n" + set);
		set = new HashSet(array2);
		System.out.println("array2 -> set \n" + set);
		boolean result = array2.addAll(set);
		System.out.println("set -> array2 : addAll() = " + result);
		array2 = new LinkedList(set);
		System.out.println("set -> array2 : new LinkedList()\n" + array2);
		
		
		
		ArrayList list = new ArrayList();
		System.out.println("list의 크기 :: " + list.size());
		list.add(1);		list.add("hello");		list.add(true);		list.add('A');		list.add(3.14);
		System.out.println(list);
		System.out.println("list의 크기 :: " + list.size());
	}

}
