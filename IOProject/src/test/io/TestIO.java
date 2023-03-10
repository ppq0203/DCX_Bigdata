package test.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * IO : 입력/출력을 사용하는 API
 *        Stream : source(출발지) 또는 destination(목적지) 하나만을 가진 
 *                     연결된(끊기지 않은) 데이터 집합
 * InputStream(read())/OutputStream(write())
 * 
 * @author Anyware
 *
 */
public class TestIO {

	public static void main(String[] args) throws IOException {
		FileOutputStream out = new FileOutputStream("result1.txt");//한글명은 기본적으로 안됨
		String data ="hello, \n 홍길동";
		byte[] buffer = data.getBytes();
		out.write(buffer);
		out.flush();// OutputStream에 있는 데이터를 목적지로 완전 전송
		out.close();// 스트림을 닫는 명령함수
		
		File file = new File("result1.txt");
		FileInputStream in = new FileInputStream(file);
		long length = file.length(); //BigDecimal (*)
		byte[] buffer1 = new byte[(int) length];
		in.read(buffer1);
		System.out.println(new String(buffer1));
		
		//API : FileManager, readFile(), writeFile()
		/*
		 * class FileManager
		 *  readFile()
		 *  writeFile()
		 */
		FileManager manager = new FileManager();
		String name = "manager.txt";
//		data ="오늘부터 JAVA 공부를 다시 시작했다. 실은 BCIT ISEP이 끝나고 CST에 지원하고 조금 남는 시간에 "
//				+ "공부를 시작했지만, 동기부여가 잘 안되었고, 실은 의지도 부족해서 중도에 중단을 하게 되었다. "
//				+ "그리고 150일 룰을 지키기 위해 어학원에 등록을 하느라 자연스럽게 못하게 되었는데, "
//				+ "기존 계획과 같이 오늘부터 다시 공부를 시작하려 한다.";// StringBuilder 이용(*)
//		manager.writeFile(name , data);
//		data = manager.readFile(name);
//		System.out.println(data);
		// 만약 한글이 깨질 경우
		name = "dataUTF8.txt";
 		data = manager.readFile(name);// System encoding : UTF-8
		System.out.println(data);
		
 		System.out.println("=======================");
		name = "dataMS949.txt";					//Notepad++
		String charSet = "MS949";								//		         charSet = "UTF-8";
		 		data = manager.readFile(name, charSet);  //				data = manager.readText(name, charSet );
		System.out.println(data);
	}

}





