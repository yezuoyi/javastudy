package com.study.other;

import java.beans.Expression;
import java.util.Stack;

public class TestCal {

	static char Precede(char t1, char t2) { // 同algo3-6.cpp
		// 根据教科书表3.1，判断两符号的优先关系
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

	public static boolean In(char c) { // 几乎与algo3-6.cpp相同
		// 判断c是否为运算符
		switch (c) {
		case '+':
		case '-':
		case '*':
		case '/':
		case '(':
		case ')':
		case '=':
			return true; // 此句不同于algo3-6.cpp
		default:
			return false;
		}
	}

	public static double Operate(double a, char theta, double b) { // 有改动
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

	public static String evaluateExpression(String s) { // 有改动
		try {
			// 算术表达式求值的算符优先算法。设OPTR和OPND分别为运算符栈和运算数栈
			Stack optr = new Stack();
			Stack opnd = new Stack();
			double a, b, d;
			char c, x, theta; // 存放由键盘接收的字符串
			String z = "";
			int j = 0;
			double result=0;
			optr.push('=');
			s+="=";
			while (j < s.length()) {
				c = s.charAt(j++);
				x = optr.peek().toString().charAt(0);
				while (c != '=' || x != '=') {
					if (In(c)) // 是7种运算符之一
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
					else if ((c >= '0' && c <= '9')) { // c是操作数
						int i = 0;
						do {
							z = z + c;
							i++;
							c = s.charAt(j++);
						} while (c >= '0' && c <= '9'||c=='.');
						d = Double.parseDouble(z);
						opnd.push(d);
						z = "";

					} else { // c是非法字符
						System.out.println("ERROR3\n");
					}
					x = (Character) optr.peek();
				}

			}
			result = (Double) opnd.peek();
			return String.valueOf(result);
		} catch (Exception e) {
			return "表达式有误";
		}
	
	}

	public static void test() { // 有改动
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
