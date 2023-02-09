package test.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TestSocket2 {
	private static Socket client;
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws UnknownHostException, IOException
	{
//		String ip = "127.0.0.1";
		String ip = "192.168.1.83";
		int port = 5000;
		client = new Socket(ip, port);
		InputStream in = client.getInputStream();
		OutputStream out = client.getOutputStream();
		WriteThread wt = new WriteThread(client);
		wt.start();
//		ip = "www.naver.com";
//		port = 80;
		String request;
		
		while(true)
		{
//			System.out.print("input > ");
//			request = sc.nextLine();
//			if(request.equals("1"))
//				break;
//			out.write(request.getBytes());
			byte[] buffer = new byte[1024];
			in.read(buffer);
			System.out.println(new String(buffer));
			if(buffer == null)
				break;
			
		}


		out.close();
		in.close();
		client.close();
	}
}
