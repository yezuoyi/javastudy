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
			// �򱾻���4700�˿ڷ����ͻ�����
			BufferedReader sin = new BufferedReader(new InputStreamReader(
					System.in));
			// ��ϵͳ��׼�����豸����BufferedReader����
			// PrintWriter os = new PrintWriter(socket.getOutputStream());
			OutputStream os = socket.getOutputStream();
			// ��Socket����õ��������������PrintWriter����
			BufferedReader is = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));
			// ��Socket����õ�����������������Ӧ��BufferedReader����
			String readline = "7E001000000000000000000000000000000711FF010111008D7B7E";
			// readline = sin.readLine(); // ��ϵͳ��׼�������һ�ַ���
			// while (!readline.equals("bye")) {
			// ���ӱ�׼���������ַ���Ϊ "bye"��ֹͣѭ��
			os.write(HexString2Bytes(readline));
			// ����ϵͳ��׼���������ַ��������Server
			os.flush();
			// ˢ���������ʹServer�����յ����ַ���
			System.out.println("Client:" + readline);
			// ��ϵͳ��׼����ϴ�ӡ������ַ���
			// /System.out.println("Server:" +
			// Bytes2HexString(HexString2Bytes(is.readLine())));
			// ��Server����һ�ַ���������ӡ����׼�����
			// readline = sin.readLine(); // ��ϵͳ��׼�������һ�ַ���
			// } // ����ѭ��
			os.close(); // �ر�Socket�����
			is.close(); // �ر�Socket������
			socket.close(); // �ر�Socket
		}

	}

	// �ֽ�������16�����ַ����໥ת��--------------------------------------------------------------------
	private final static byte[] hex = "0123456789ABCDEF".getBytes();

	private static int parse(char c) {
		if (c >= 'a')
			return (c - 'a' + 10) & 0x0f;
		if (c >= 'A')
			return (c - 'A' + 10) & 0x0f;
		return (c - '0') & 0x0f;
	}

	// ��ʮ�������ַ������ֽ�����ת��
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

	// ���ֽ����鵽ʮ�������ַ���ת��
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