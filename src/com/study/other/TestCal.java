package com.study.other;

import java.beans.Expression;
import java.util.Stack;

public class TestCal {

	static char Precede(char t1, char t2) { // ͬalgo3-6.cpp
		// ���ݽ̿����3.1���ж������ŵ����ȹ�ϵ
		char f = '0';
		switch (t2) {
		case '+':
		case '-':
			if (t1 == '(' || t1 == '=')
				f = '<';
			else
				f = '>';
			break;
		case '*':
		case '/':
			if (t1 == '*' || t1 == '/' || t1 == ')')
				f = '>';
			else
				f = '<';
			break;
		case '(':
			if (t1 == ')') {
				try {
					System.out.println("ERROR2\n");
					throw new Exception();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else
				f = '<';
			break;
		case ')':
			switch (t1) {
			case '(':
				f = '=';
				break;
			case '=':
				
				try {
					System.out.println("ERROR2\n");
					throw new Exception();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			default:
				f = '>';
			}
			break;
		case '=':
			switch (t1) {
			case '=':
				f = '=';
				break;
			case '(':
				try {
					System.out.println("ERROR2\n");
					throw new Exception();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			default:
				f = '>';
			}
		}
		return f;
	}

	public static boolean In(char c) { // ������algo3-6.cpp��ͬ
		// �ж�c�Ƿ�Ϊ�����
		switch (c) {
		case '+':
		case '-':
		case '*':
		case '/':
		case '(':
		case ')':
		case '=':
			return true; // �˾䲻ͬ��algo3-6.cpp
		default:
			return false;
		}
	}

	public static double Operate(double a, char theta, double b) { // �иĶ�
		double c = 0;
		switch (theta) {
		case '+':
			c = a + b;
			break;
		case '-':
			c = a - b;
			break;
		case '*':
			c = a * b;
			break;
		case '/':
			c = a / b;
		}
		return c;
	}

	public static String evaluateExpression(String s) { // �иĶ�
		try {
			// �������ʽ��ֵ����������㷨����OPTR��OPND�ֱ�Ϊ�����ջ��������ջ
			Stack optr = new Stack();
			Stack opnd = new Stack();
			double a, b, d;
			char c, x, theta; // ����ɼ��̽��յ��ַ���
			String z = "";
			int j = 0;
			double result=0;
			optr.push('=');
			s+="=";
			while (j < s.length()) {
				c = s.charAt(j++);
				x = optr.peek().toString().charAt(0);
				while (c != '=' || x != '=') {
					if (In(c)) // ��7�������֮һ
						switch (Precede(x, c)) {
						case '<':
							optr.push(c);
							c = s.charAt(j++);
							break;
						case '=':
							x = (Character) optr.pop();
							c = s.charAt(j++);
							break;
						case '>':
							theta = (Character) optr.pop();
							b = (Double) opnd.pop();
							a = (Double) opnd.pop();
							opnd.push(Operate(a, theta, b));
						}
					else if ((c >= '0' && c <= '9')) { // c�ǲ�����
						int i = 0;
						do {
							z = z + c;
							i++;
							c = s.charAt(j++);
						} while (c >= '0' && c <= '9'||c=='.');
						d = Double.parseDouble(z);
						opnd.push(d);
						z = "";

					} else { // c�ǷǷ��ַ�
						System.out.println("ERROR3\n");
					}
					x = (Character) optr.peek();
				}

			}
			result = (Double) opnd.peek();
			return String.valueOf(result);
		} catch (Exception e) {
			return "���ʽ����";
		}
	
	}

	public static void test() { // �иĶ�
		String s = "10+(102+4*(3-1))+2";
		String s1 = "0-2+((1+2)*3+4)-6";
		
		System.out.println(evaluateExpression(s1));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Expression exp1 = new Expression("0.8*(1/e pow ((x-200)/100))+0.2");  
		
		test();
	}

}
