package test.employee;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Iterator;

public class ReadEmployeeData {
	
	public HashMap<String, Employee> readEmps() throws IOException, ClassNotFoundException
	{
		FileInputStream fileStream = new FileInputStream("user_info.txt");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileStream);
		Object object = objectInputStream.readObject();
		objectInputStream.close();
		
		@SuppressWarnings("unchecked")
		HashMap<String, Employee> hashMap = (HashMap<String, Employee>)object;
		Iterator<String> it = hashMap.keySet().iterator();
		while(it.hasNext()){  // 맵키가 존재할경우
			String key = it.next();  // 맵키를 꺼냄
			Employee value = (Employee)hashMap.get(key);  // 키에 해당되는 객체 꺼냄
			System.out.println(key + "->" + value);
		}
		return hashMap;
	}
	
	public void writeEmp(Employee emp) throws IOException
	{
		HashMap<String, Employee> emps;
		try {
			emps = readEmps();
		} catch (ClassNotFoundException e) {
			emps = new HashMap<String, Employee>();
			e.printStackTrace();
		}
		emps.put(emp.getId(), emp);
		FileOutputStream fileStream = new FileOutputStream("user_info.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileStream);
		objectOutputStream.writeObject(emps);
		objectOutputStream.close();
	}
}