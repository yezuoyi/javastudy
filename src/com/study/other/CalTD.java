package com.study.other;

import java.io.ObjectInputStream.GetField;


public class CalTD {

	public static final String[] tiangans = new String[] { "¼×", "ÒÒ", "±û", "¶¡", "Îì", "¼º", "¸ı", "ĞÁ", "ÈÉ", "¹ï" };
	public static final String[] dizhis = new String[] { "×Ó", "³ó", "Òú", "Ã®", "³½", "ËÈ", "Îç", "Î´", "Éê", "ÓÏ", "Ğç", "º¥"};
	public static final String[] shenxiao = new String[] { "Êó", "Å£", "»¢", "ÍÃ", "Áú", "Éß", "Âí", "Ñò", "ºï", "¼¦", "¹·", "Öí" };
	public static final String[] tiangandizhis = new String[] {
		"¼××Ó", "ÒÒ³ó", "±ûÒú", "¶¡Ã®", "Îì³½", "¼ºËÈ", "¸ıÎç", "ĞÁÎ´", "ÈÉÉê", "¹ïÓÏ", 
		"¼×Ğç", "ÒÒº¥", "±û×Ó", "¶¡³ó", "ÎìÒú", "¼ºÃ®", "¸ı³½", "ĞÁËÈ", "ÈÉÎç", "¹ïÎ´", 
		"¼×Éê", "ÒÒÓÏ", "±ûĞç", "¶¡º¥", "Îì×Ó", "¼º³ó", "¸ıÒú", "ĞÁÃ®", "ÈÉ³½", "¹ïËÈ", 
		"¼×Îç", "ÒÒÎ´", "±ûÉê", "¶¡ÓÏ", "ÎìĞç", "¼ºº¥", "¸ı×Ó", "ĞÁ³ó", "ÈÉÒú", "¹ïÃ®",
	    "¼×³½", "ÒÒËÈ", "±ûÎç", "¶¡Î´", "ÎìÉê", "¼ºÓÏ", "¸ıĞç", "ĞÁº¥", "ÈÉ×Ó", "¹ï³ó",
	    "¼×Òú", "ÒÒÃ®", "±û³½", "¶¡ËÈ", "ÎìÎç", "¼ºÎ´", "¸ıÉê", "ĞÁÓÏ", "ÈÉĞç", "¹ïº¥"
	    };

	public static final int thisYear = 1984;
	public static final String thisYearTD = "¼××Ó";
	
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
