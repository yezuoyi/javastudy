package com.study.other;

import java.util.HashMap;
import java.util.Map;

public class ByteTest {
		public static final byte NORMAL                    = 0x00;
		public static final byte PROTOCOL_VERSION_ERROR    = 0x01;
		public static final byte CHKSUM_ERROR              = 0x02;
		public static final byte RESERVE                   = 0x03;
		public static final byte CID2_INVALID              = 0x04;
		public static final byte COMMAND_FORMAT_ERROR      = 0x05;
		public static final byte INVALID_DATA              = 0x06;
		public static final byte INVALID_AUTHORITY         = (byte) 0xe0;
		public static final byte OPERATION_FAILED          = (byte) 0xe1;
		public static final byte EQUIPMENT_FAILURE         = (byte) 0xe2;
		public static final byte DEVICE_WRITE_PROTECTED    = (byte) 0xe3;
		
		public static Map<Byte,String> rtnMap = new HashMap<Byte,String>();
		static {
			rtnMap.put(NORMAL                 , "����");
			rtnMap.put(PROTOCOL_VERSION_ERROR , "Э��汾��");
			rtnMap.put(CHKSUM_ERROR           , "CHKSUM ��");
			rtnMap.put(RESERVE                , "Ԥ��");
			rtnMap.put(CID2_INVALID           , "CID2 ��Ч");
			rtnMap.put(COMMAND_FORMAT_ERROR   , "�����ʽ��");
			rtnMap.put(INVALID_DATA           , "��Ч����");
			rtnMap.put(INVALID_AUTHORITY      , "��ЧȨ��");
			rtnMap.put(OPERATION_FAILED       , "����ʧ��");
			rtnMap.put(EQUIPMENT_FAILURE      , "�豸����");
			rtnMap.put(DEVICE_WRITE_PROTECTED , "�豸д����");
			
		}
		public  static String getRtnValue(Byte key){
			return (String)(rtnMap.get(key));
		}
		
		public static void main(String[] args){
			Byte a = (byte) 0xe1;
			switch (a) {
			case (byte) 0xe1:
				System.out.println(getRtnValue((byte)0xe1));
				break;

			default:
				break;
			}
			
		}


}
