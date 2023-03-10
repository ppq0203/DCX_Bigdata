package test.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

import test.appoint.Appoint;
import test.date.Date;
/**
 * Collection API - Map
 * Map - 검색, 키(워드) 와 값으로 구성
 * 대표 : HashMap
 *         cf) HttpSession, HttpRequest
 *         add(key, value) -> put(key, value)
 *         remove(key), get(key), size()
 *         
 * @author Anyware
 *
 */
public class TestCollection3 
{
	public static void main(String[] args) 
	{	//배열
		Object[] keys = {"둘리", "고길동", "또치", "도우너", "마이콜"};
		Object[] values = {"010-1234-5678", "010-5251-3547", 
				"010-1234-5679", "010-5251-3548", "010-5251-3550"};
		HashMap phoneList = new HashMap();
		for (int i = 0; i < values.length; i++) {
			phoneList.put(keys[i], values[i]);
		}
		System.out.println("phoneList : \n" + phoneList);
		System.out.println("\nkeySet : \n" + phoneList.keySet());
		System.out.println("\nvalues : \n" + phoneList.values());
		System.out.println("\nget('또치') : " + phoneList.get("또치"));
		phoneList.replace("또치", "전화번호");
		System.out.println("\nreplace : \n" + phoneList);
		phoneList.remove("또치");
		System.out.println("\nremove : \n" + phoneList);
		// keySet 가져와서 출력, values 가져와서 출력.
		// get(key), replace(key, value), remove(key)
	}

}
