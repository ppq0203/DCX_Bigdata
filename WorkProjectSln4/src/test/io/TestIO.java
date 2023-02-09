package test.io;

import java.io.IOException;

public class TestIO {

	public static void main(String[] args) throws IOException {
		/*
		FileOutputStream out = new FileOutputStream("result.txt");	// not exist file exception ( FileNotFoundException )
		String data = "hello, \n홍길동";
		byte[] buffer = data.getBytes();
		out.write(buffer);		// can't write exception ( IOException )
		out.flush();		// data transmission in OutputStream to destination
		out.close();		// close Stream order function
		
		File file = new File("result.txt");
		FileInputStream in = new FileInputStream(file);
		long length = file.length();		// BigDecimal (*)
		byte[] buffer1 = new byte[(int)length];
		in.read(buffer1);
		System.out.println(new String(buffer1));
		// in is not must flush and close
		*/
		
		/*
		FileWriter fw = new FileWriter(file);
		fw.write("Hello, \n 둘리");
		fw.flush();
		fw.close();

		FileReader fr = new FileReader(file);
		char[] cbuf =  new char[(int)length];
		fr.read(cbuf);
		System.out.println(cbuf);
		*/
		
		//API : FileManager, readFile(), writeFile()
		/*
		FileManager2 fm = new FileManager2("result.txt");
		fm.writeFile("File Manager\nread and write");
		System.out.println(new String(fm.readFile()));
		fm.writeFile("File Manager\nread and write2");
		System.out.println(new String(fm.readFile()));
		fm.writeFile("File Manager\nread and write3");
		System.out.println(new String(fm.readFile()));
		FileManager2 fm2 = new FileManager2("manager.txt");
		fm2.writeFile("manager.txt\nread and write");
		System.out.println(new String(fm2.readFile()));
		*/
		
		FileManager manager = new FileManager();
		manager.writeFile("hello.txt", "helloFile");
		System.out.println(manager.readFile("hello.txt"));
		
		System.out.println();
		String name = "test.txt";	//UTF-8
		System.out.println(manager.readFile(name));
		
		name = "test3.txt";		//EUC-KR
//		System.out.println(manager.readFile(name));
		String charSet = "EUC-KR";
		System.out.println(manager.readFile(name, charSet));
//		charSet = "UTF-8";
		System.out.println(manager.readText(name, charSet));
		
	}

}
