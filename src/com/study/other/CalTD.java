package com.study.other;

import java.io.ObjectInputStream.GetField;


public class CalTD {

	public static final String[] tiangans = new String[] { "��", "��", "��", "��", "��", "��", "��", "��", "��", "��" };
	public static final String[] dizhis = new String[] { "��", "��", "��", "î", "��", "��", "��", "δ", "��", "��", "��", "��"};
	public static final String[] shenxiao = new String[] { "��", "ţ", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��" };
	public static final String[] tiangandizhis = new String[] {
		"����", "�ҳ�", "����", "��î", "�쳽", "����", "����", "��δ", "����", "����", 
		"����", "�Һ�", "����", "����", "����", "��î", "����", "����", "����", "��δ", 
		"����", "����", "����", "����", "����", "����", "����", "��î", "�ɳ�", "����", 
		"����", "��δ", "����", "����", "����", "����", "����", "����", "����", "��î",
	    "�׳�", "����", "����", "��δ", "����", "����", "����", "����", "����", "���",
	    "����", "��î", "����", "����", "����", "��δ", "����", "����", "����", "�ﺥ"
	    };

	public static final int thisYear = 1984;
	public static final String thisYearTD = "����";
	
	public static int getIndex(String item){
		for(int i=0;i<tiangandizhis.length;i++){
			if(tiangandizhis[i].equals(item)){
				return i;
			}
		}
		return -1;
	}
	
	public static String getTDbyYear(int year){
		int len = year - thisYear;
		int indexTd = getIndex(thisYearTD);
		int index = (len+indexTd)%60>=0?(len+indexTd)%60:(len+indexTd)%60+60;
		return tiangandizhis[index];
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<2016;i++)
		System.out.println(getTDbyYear(i)+"--"+i);
		
	}

}
