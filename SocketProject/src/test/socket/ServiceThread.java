package test.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.ArrayList;

public class ServiceThread extends Thread {
	private Socket service;
	private InputStream in;
	private OutputStream out;
	private ArrayList<Socket> clientList;
	private ArrayList<InputStream> inList;
	private ArrayList<OutputStream> outList;

	public void run()
	{
		
		SocketAddress remote = service.getRemoteSocketAddress();	//socket주소
		System.out.println("client connected...[" + remote + "]");
		//4. 3번.getInputStream()
		//5. 3번.getOutputStream()
		try {
			in = service.getInputStream();
			out = service.getOutputStream();
			inList.add(in);//		clientList.add(in); 비동기?
			outList.add(out);//		clientList.add(in); 비동기?
			clientList.add(service);//		clientList.add(in); 비동기?
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String request=" ";
		while(!request.trim().equals("1")) {
			//6. 4번.read()를 통해 request데이터를 받기
			byte[] buffer = new byte[1024];
			try {
				in.read(buffer);
				request = new String(buffer);
				System.out.println(remote+">" + new String(buffer).trim());
				//7. response 데이터를 만들기
				String response = request;
				 //8. 5번.write()를 통해 7번 데이터 전송

				for (OutputStream o : outList) {
					o.write(response.getBytes());
					o.flush();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
				outList.remove(out);
				break;
			}
		}
		inList.remove(in);
		outList.remove(out);
		clientList.remove(service);
		try {
			in.close();out.close();service.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ServiceThread(Socket service, ArrayList<Socket> clientList, ArrayList<InputStream> inList,
			ArrayList<OutputStream> outList) {
		super();
		this.service = service;
		this.clientList = clientList;
		this.inList = inList;
		this.outList = outList;
	}
}
