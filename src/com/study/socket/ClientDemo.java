package com.study.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDemo {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		
		Socket socket =new Socket("192.168.1.100",30000);
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		String line= br.readLine();
		
		System.out.println("server data:"+line);
		br.close();
		socket.close();
	}

}
