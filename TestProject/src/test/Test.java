package test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class Test {


 public static void main(String[] args) throws IOException {
//	 HashMap userInfoMap = new HashMap();
//	 userInfoMap.put("TEL", "02-324-2424");
//	 userInfoMap.put("phone", "010-9999-9999");
//	 userInfoMap.put("address", "서울서 서추구 방배동 34244");
//	 
//	 FileOutputStream fileStream = new FileOutputStream("hashmap.txt");
//	 
//	 ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileStream);
//	 
//	 objectOutputStream.writeObject(userInfoMap);
//	 objectOutputStream.close();
//	 String str = new String("hello");
//	 fileStream.write(str.getBytes());
//	 fileStream.flush();
//	 fileStream.close();
//	 long n = 10L;
//	 String num = Long.toString(n);
//	 System.out.println(num);
	 HashMap hm = new HashMap();
	 hm.put("1", "11");
	 hm.put("1", "22");
	 hm.put("1", "33");
	 hm.put("2", "33");
	 System.out.println(hm.size());
	 System.out.println(hm.values());
	 System.out.println(hm.get("k"));
  
  
 }
} 