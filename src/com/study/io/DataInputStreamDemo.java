package com.study.io;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DataInputStreamDemo {
	public static final String dataFile = "invoicedata";

	public static void main(String[] args) {
		DataInputStream in;
		try {
			in = new DataInputStream(new BufferedInputStream(
					new FileInputStream(dataFile)));
			double price;
			int unit;
			String desc;
			double total = 0.0;

			try {
			    while (true) {
			        price = in.readDouble();
			        unit = in.readInt();
			        desc = in.readUTF();
			        System.out.format("You ordered %d" + " units of %s at $%.2f%n",
			            unit, desc, price);
			        total += unit * price;
			    }
			} catch (Exception e) {
				e.printStackTrace();
			}

	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		

	}
}
