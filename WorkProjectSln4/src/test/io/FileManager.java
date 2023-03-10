package test.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileManager {
	
	public void writeFile(String name, String data) throws IOException
	{
		FileOutputStream out = new FileOutputStream(name);	// not exist file exception ( FileNotFoundException )
		byte[] buffer = data.getBytes();
		out.write(buffer);		// can't write exception ( IOException )
		out.flush();		// data transmission in OutputStream to destination
		out.close();		// close Stream order function
	}
	public String readFile(String name) throws IOException
	{
		File file = new File(name);
		FileInputStream in = new FileInputStream(file);
//		InputStreamReader isr = new InputStreamReader(in, "EUC-KR");
		long length = file.length();		// BigDecimal (*)
		byte[] buffer1 = new byte[(int)length];
//		char[] buffer1 = new char[(int)length];
		in.read(buffer1);
//		isr.read(buffer1);
		in.close();
		return new String(buffer1);
	}
	public String readFile(String name, String charSet) throws IOException
	{
		File file = new File(name);
		FileInputStream in = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(in, charSet);
		long length = file.length();		// BigDecimal (*)
//		byte[] buffer1 = new byte[(int)length];
		char[] buffer1 = new char[(int)length];
//		in.read(buffer1);
		isr.read(buffer1);
		isr.close();
		return new String(buffer1);
	}
	
	public String readText(String name) throws IOException
	{
		File file = new File(name);
		FileReader in = new FileReader(file);
		long length = file.length();
		char[] buffer1 = new char[(int)length];
		in.read(buffer1);
		in.close();
		return new String(buffer1);
	}
	
	public String readText(String name, String charSet) throws IOException
	{
		File file = new File(name);
		FileReader in = new FileReader(file);
		long length = file.length();
		char[] buffer1 = new char[(int)length];
		in.read(buffer1);
		in.close();
		String result =  new String((new String(buffer1)).getBytes("utf-8"), "euc-kr");
		return result;
	}
}
