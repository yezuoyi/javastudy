package com.study.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(30000);
		while(true){
			Socket s = ss.accept();
			OutputStream os =  s.getOutputStream();
			os.write("hello,you".getBytes("utf-8"));
			s.close();
		}
	}

}
