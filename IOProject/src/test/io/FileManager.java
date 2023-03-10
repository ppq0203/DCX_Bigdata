package test.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class FileManager {

	public void writeFile(String name, String data) throws IOException {
		FileOutputStream out = new FileOutputStream(name);//한글명은 기본적으로 안됨
		byte[] buffer = data.getBytes();
		out.write(buffer);
		out.flush();// OutputStream에 있는 데이터를 목적지로 완전 전송
		out.close();// 스트림을 닫는 명령함수
	}

	public String readFile(String name) throws IOException {
		File file = new File(name);
		FileInputStream in = new FileInputStream(file);
		long length = file.length(); //BigDecimal (*)
		byte[] buffer1 = new byte[(int) length];
		in.read(buffer1);
		return new String(buffer1);
	}

	public String readFile(String name, String charSet) throws IOException {
		File file = new File(name);
		FileInputStream in = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(in, charSet);
		System.out.println("this encoding :: " + isr.getEncoding());
		long length = file.length(); //BigDecimal (*)
		char[] buffer1 = new char[(int) length];
		isr.read(buffer1);
		System.out.println("readFile("+name+", "+charSet+")" + (int)buffer1[0]);
		return new String(buffer1);
	}

	public String readText(String name, String charSet) throws IOException {
		File file = new File(name);
		FileReader in = new FileReader(file);
		System.out.println("this encoding :: " + in.getEncoding());
		long length = file.length(); //BigDecimal (*)
		char[] buffer1 = new char[(int) length];
		in.read(buffer1);
		System.out.println("readText("+name+", "+charSet+")" + (int)buffer1[0]);
//		System.out.println("char[] :: ");
//		for (char c : buffer1) {
//			System.out.print((char)c);
//		}
//		System.out.println();
		// charSet을 적용해서 변환해야 함
		String result = new String(buffer1);
		System.out.println("String :: \n" + result);
		// char[] -> String ->byte[] -> String <- charSet : MS949
		byte[] buffer = result.getBytes();
		System.out.println("readText("+name+", "+charSet+")" + (int)buffer[0]);
//		System.out.println("String(charSet("+charSet+")) :: \n" 
//										+ new String(buffer, charSet));
		buffer = result.getBytes(charSet);
		System.out.println("readText("+name+", "+charSet+")" + (int)buffer[0]);
		result = new String(buffer);
		System.out.println("str.getBytes(charSet("+charSet+")) :: \n" + result);
		result = new String(buffer,in.getEncoding());
		System.out.println("String(str.getBytes(charSet("+charSet+")),charSet("
										+in.getEncoding()+"))) :: \n" + result);
		return result;
	}

}
