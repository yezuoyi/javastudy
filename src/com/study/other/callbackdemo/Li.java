package com.study.other.callbackdemo;

/**
 * �������С����
 * @author xiaanming
 *
 */
public class Li {
	/**
	 * �൱��B���в���ΪCallBack callBack��f()---->������
	 * @param callBack  
	 * @param question  С���ʵ�����
	 */
	public void executeMessage(CallBack callBack, String question){
		System.out.println("С���ʵ�����--->" + question);
		
		//ģ��С����Լ���������Ҫ�ܳ�ʱ��
		for(int i=0; i<10000;i++){
			
		}
		
		/**
		 * С������Լ�������֮���뵽�˴���2
		 */
		String result = "����2";
		
		/**
		 * ���Ǿʹ�绰����С��������С���еķ���
		 * ����൱��B�෴��������A�ķ���D
		 */
		callBack.solve(result); 

		
		
	}
	
}
