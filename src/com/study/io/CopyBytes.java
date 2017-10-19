package com.study.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("xanadu.txt");
            out = new FileOutputStream("outagain.txt");
            int c;
           
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            int i = 0;
            while(i<256){//һ����256���ַ� 
            	 out.write(i++);
            }
            System.out.println("success");
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
