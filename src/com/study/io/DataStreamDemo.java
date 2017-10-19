package com.study.io;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamDemo {
	static final String dataFile = "invoicedata";

	static final double[] prices = { 19.99, 9.99, 15.99, 3.99, 4.99 };
	static final int[] units = { 12, 8, 13, 29, 50 };
	static final String[] descs = {
	    "Java T-shirt",
	    "Java Mug",
	    "Duke Juggling Dolls",
	    "Java Pin",
	    "Java Key Chain"
	};
	
	public static void main(String[] args) throws IOException{
		try {
			DataOutputStream out = new DataOutputStream(new BufferedOutputStream( new FileOutputStream(dataFile)));
			
			for (int i = 0; i < prices.length; i ++) {
			    out.writeDouble(prices[i]);
			    out.writeInt(units[i]);
			    out.writeUTF(descs[i]);
			}
			System.out.println("SUCCESS");
			
			out.close();

			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}
