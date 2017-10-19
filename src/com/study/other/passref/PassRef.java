package com.study.other.passref;

public class PassRef {

	public static void occDevicetoSystem(int[] para) {
		try {
			int boxNo = para[0];
			int diskNo = para[1];
			diskNo = (boxNo - 1) * 6 + diskNo;
			boxNo = boxNo < 5 ? 1 : 2;
			diskNo = boxNo == 1 ? diskNo : diskNo - 24;
			para[0] = boxNo;
			para[1] = diskNo;

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void occSystemToDevice(int[] para) {
		try {
			int boxNo = para[0];
			int diskNo = para[1];
			boxNo = (boxNo == 2) ? (4 + ((diskNo % 6 == 0) ? diskNo / 6 : diskNo / 6 + 1)) : (diskNo % 6 == 0) ? diskNo / 6 : (diskNo / 6 + 1);
			diskNo = (diskNo % 6 == 0) ? 6 : diskNo % 6;
			para[0] = boxNo;
			para[1] = diskNo;
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public static void make(int[] para) {
		para[0] = 3;
		para[1] = 4;

	}

	public static void main(String[] args) {
		
		
/*
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 6; j++) {

				int boxNo = i;
				int diskNo = j;
				
				System.out.print("原来的:{"+boxNo + "-" + diskNo+"}");

				int[] para = { boxNo, diskNo };
				occDevicetoSystem(para);
				boxNo = para[0];
				diskNo = para[1];

				System.out.print("==设备变系统{"+boxNo + "-" + diskNo+"}");

				int[] para1 = { boxNo, diskNo };

				occSystemToDevice(para1);
				boxNo = para1[0];
				diskNo = para1[1];

				System.out.println("==系统变设备{"+boxNo + "-" + diskNo+"}");

			}
		}
*/
	}
}
