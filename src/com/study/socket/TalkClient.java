package com.study.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TalkClient {

	public static void main(String args[]) throws UnknownHostException,
			IOException {

		for (int i = 0; i < 1; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			Socket socket = new Socket("192.168.1.100", 60010 + i);
			// 向本机的4700端口发出客户请求
			BufferedReader sin = new BufferedReader(new InputStreamReader(
					System.in));
			// 由系统标准输入设备构造BufferedReader对象
			// PrintWriter os = new PrintWriter(socket.getOutputStream());
			OutputStream os = socket.getOutputStream();
			// 由Socket对象得到输出流，并构造PrintWriter对象
			BufferedReader is = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));
			// 由Socket对象得到输入流，并构造相应的BufferedReader对象
			String readline = "7E001000000000000000000000000000000711FF010111008D7B7E";
			// readline = sin.readLine(); // 从系统标准输入读入一字符串
			// while (!readline.equals("bye")) {
			// 若从标准输入读入的字符串为 "bye"则停止循环
			os.write(HexString2Bytes(readline));
			// 将从系统标准输入读入的字符串输出到Server
			os.flush();
			// 刷新输出流，使Server马上收到该字符串
			System.out.println("Client:" + readline);
			// 在系统标准输出上打印读入的字符串
			// /System.out.println("Server:" +
			// Bytes2HexString(HexString2Bytes(is.readLine())));
			// 从Server读入一字符串，并打印到标准输出上
			// readline = sin.readLine(); // 从系统标准输入读入一字符串
			// } // 继续循环
			os.close(); // 关闭Socket输出流
			is.close(); // 关闭Socket输入流
			socket.close(); // 关闭Socket
		}

	}

	// 字节数组与16进制字符串相互转化--------------------------------------------------------------------
	private final static byte[] hex = "0123456789ABCDEF".getBytes();

	private static int parse(char c) {
		if (c >= 'a')
			return (c - 'a' + 10) & 0x0f;
		if (c >= 'A')
			return (c - 'A' + 10) & 0x0f;
		return (c - '0') & 0x0f;
	}

	// 从十六进制字符串到字节数组转换
	public static byte[] HexString2Bytes(String hexstr) {
		byte[] b = new byte[hexstr.length() / 2];
		int j = 0;
		for (int i = 0; i < b.length; i++) {
			char c0 = hexstr.charAt(j++);
			char c1 = hexstr.charAt(j++);
			b[i] = (byte) ((parse(c0) << 4) | parse(c1));
		}
		return b;
	}

	// 从字节数组到十六进制字符串转换
	public static String Bytes2HexString(byte[] b) {
		if (null == b)
			return "";
		byte[] buff = new byte[2 * b.length];
		for (int i = 0; i < b.length; i++) {
			buff[2 * i] = hex[(b[i] >> 4) & 0x0f];
			buff[2 * i + 1] = hex[b[i] & 0x0f];
		}
		return new String(buff);
	}
}