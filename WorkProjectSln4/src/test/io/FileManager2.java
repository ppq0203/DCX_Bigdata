package test.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileManager2 {
	File file;
	
	public FileManager2(String fileAddress)
	{
		file = new File(fileAddress);
	}
	
	public byte[] readFile() throws IOException
	{
		FileInputStream in = new FileInputStream(file);
		long length = file.length();		// BigDecimal (*)
		byte[] buffer1 = new byte[(int)length];
		in.read(buffer1);
		in.close();
		return buffer1;
	}
	
	public void writeFile(String data) throws IOException
	{
		FileOutputStream out = new FileOutputStream(file);
		byte[] buffer = data.getBytes();
		out.write(buffer);		// can't write exception ( IOException )
		out.flush();		// data transmission in OutputStream to destination
		out.close();	
	}
}
