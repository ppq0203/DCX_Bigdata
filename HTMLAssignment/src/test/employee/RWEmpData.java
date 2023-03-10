package test.employee;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class RWEmpData {
	
	@SuppressWarnings("unchecked")
	public HashMap<String, Employee> readEmps()
	{
		HashMap<String, Employee> hashMap = null;
		try {
			FileInputStream fileStream = new FileInputStream("./employees.txt");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileStream);
			Object object = objectInputStream.readObject();
			objectInputStream.close();
			hashMap = (HashMap<String, Employee>)object;
//			
		} catch (IOException e) {
			hashMap = new HashMap<String ,Employee>();
			System.out.println("file is not exist so create empty hashmap");
		} catch (ClassNotFoundException e) {
//			hashMap = new HashMap<String ,Employee>();
			System.out.println("class is not exist so create empty hashmap");
		}
		
//		Iterator<String> it = hashMap.keySet().iterator();
//		while(it.hasNext()){  // 맵키가 존재할경우
//			String key = it.next();  // 맵키를 꺼냄
//			Employee value = (Employee)hashMap.get(key);  // 키에 해당되는 객체 꺼냄
//			System.out.println(key + "->" + value);
//		}
		return hashMap;
	}
	
	public void writeEmp(Employee emp) throws IOException
	{
		HashMap<String, Employee> emps = readEmps();
		emps.put(emp.getNo(), emp);
		FileOutputStream fileStream = new FileOutputStream("./employees.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileStream);
		objectOutputStream.writeObject(emps);
		objectOutputStream.close();
	}
}