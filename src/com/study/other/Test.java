package com.study.other;

import java.util.Stack;

public class Test{
	public static void TrnsInToSufix(String IFX,String []PFX)//PFX�ź�׺���ʽ��IFXΪ��׺���ʽ
    {
        StringBuffer numBuffer = new StringBuffer();// ��������һ������
        Stack<String> s=new Stack<String>();//�Ų�����
        String a;
        s.push("=");//��һ��Ϊ�Ⱥ�
        int i=0,j=0;
        char ch;
        for(i=0;i<IFX.length();)
        {
            ch=IFX.charAt(i);
            switch(ch)
            {
            case '0':case '1':case '2':
            case '3':case '4':case '5':
            case '6':case '7':case '8':
            case '9':
                while(Character.isDigit(ch)||ch=='.')//ƴ��
                    {
                    numBuffer.append(ch); // ׷���ַ�
                    ch = IFX.charAt(++i);
                    }
                PFX[j++]=numBuffer.toString();//break; 
                numBuffer = new StringBuffer(); //����ѻ�ȡ����������
                  continue; //����Ҫ����ѭ������Ϊi�Ѿ����ӹ���
            case '(':
                s.push("(");break;
            case ')':
                while(s.peek()!="(")
                    PFX[j++]=s.pop();
                break;
            case '+':
            case '-':
                while(s.size()>1&&s.peek()!="(")
                    PFX[j++]=s.pop();
                a=String.valueOf(ch);
                s.push(a);break;
            case '*':
            case '/':
                while(s.size()>1&&(s.peek()=="*")||s.peek()=="/"
                	||s.peek()=="s"||s.peek()=="c"||s.peek()=="t"
                    ||s.peek()=="^"||s.peek()=="��")//���ȼ��Ƚϣ���ջ���Ƚϣ�
                    PFX[j++]=s.pop();//��ǰ���������ȼ����ڵ���ջ���ĵ���ջ��
                a=String.valueOf(ch);
                s.push(a);break;
            case 's':
            case 'c':
            case 't'://���Ǻ���
            	while(s.size()>1&&(s.peek()=="s"||s.peek()=="c"||s.peek()=="t"
            		||s.peek()=="^"||s.peek()=="��"))//���ȼ��Ƚϣ���ջ�������ڵ��ڵĵ���
            		PFX[j++]=s.pop();
            	a=String.valueOf(ch);
                s.push(a);break;
            case '^':// ��
    		case '��':// ����
    			while(s.size()>1&&(s.peek()=="^"||s.peek()=="��"))
    				PFX[j++]=s.pop();
            	a=String.valueOf(ch);
                s.push(a);break;		
            }
            i++; 
        }
        while(s.size()>1)
            PFX[j++]=s.pop();   
        PFX[j]="=";
    }
	public static String Evaluate (String []PFX)//��׺���ʽ��ֵ
	{
		int i=0;
		double x1,x2,n;
		String str;
		Stack<String> s= new Stack<String>();
		while(PFX[i]!="=")
		{
			str=PFX[i];
			switch(str.charAt(0))
			{
			case '0':case '1':case '2':
			case '3':case '4':case '5':
			case '6':case '7':case '8':
			case '9':
				s.push(str);break;
			case '+':
				x1=Double.parseDouble(s.pop());
				x2=Double.parseDouble(s.pop());
				n=x1+x2;
				s.push(String.valueOf(n));break;
			case '-':
				x1=Double.parseDouble(s.pop());
				x2=Double.parseDouble(s.pop());
				n=x2-x1;
				s.push(String.valueOf(n));break;
			case '*':
				x1=Double.parseDouble(s.pop());
				x2=Double.parseDouble(s.pop());
				n=x1*x2;
				s.push(String.valueOf(n));break;
			case '/':
				x1=Double.parseDouble(s.pop());
				x2=Double.parseDouble(s.pop());
				n=x2/x1;
				s.push(String.valueOf(n));break;
			case 's':
				x1=Double.parseDouble(s.pop());
				n=Math.sin(x1 * Math.PI / 180);
				s.push(String.valueOf(n));break;
			case 'c':
				x1=Double.parseDouble(s.pop());
				n=Math.cos(x1 * Math.PI / 180);
				s.push(String.valueOf(n));break;
			case 't':
				x1=Double.parseDouble(s.pop());
				n=Math.tan(x1 * Math.PI / 180);
				s.push(String.valueOf(n));break;
			case '��':
				x1=Double.parseDouble(s.pop());
				n=Math.sqrt(x1);
				s.push(String.valueOf(n));break;// ����
			case '^':
				x1=Double.parseDouble(s.pop());
				x2=Double.parseDouble(s.pop());
				n=Math.pow(x2, x1);
				s.push(String.valueOf(n));break; 
			}
			i++;
		}
		return s.pop();
	}
	 public static void main(String[] args) { 
	        Test eval = new Test(); 
	        String s="1+2*3=";//sin45*2,sin Ҫ��string.replaceת���� s
	    	String[] PFX = new String[100];
			Test.TrnsInToSufix(s, PFX);
	        System.out.println(Test.Evaluate(PFX)); 
	        
	    } 
}