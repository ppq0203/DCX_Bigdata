package test.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class WriteThread extends Thread{
	Socket client;
	Scanner sc = new Scanner(System.in);
	
	public WriteThread(Socket client)
	{
		this.client = client;
	}
	
	public void run()
	{
		OutputStream out = null;
		try {
			out = client.getOutputStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String request;
		while(true)
		{
			System.out.print("input > ");
			request = sc.nextLine();
			if(request.equals("1"))
				break;
			try {
				out.write(request.getBytes());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
