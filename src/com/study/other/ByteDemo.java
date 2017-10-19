package com.study.other;

public class ByteDemo {
	
	public static String processString(String pack) {
		String lastResult = null;
		String result = null;
		if ((pack.lastIndexOf("7d5d") > (pack.length() - 10)) 
			|| (pack.lastIndexOf("7d5e") >(pack.length() - 10))) {
			String last = pack.substring(pack.length() - 10);
			if (last.contains("7d5d") && last.contains("7d5e")) {
				lastResult = last.replace("7d5d", "7d").replace("7d5e", "7e");
			} else {
				if (last.contains("7d5d")) {
					lastResult = last.replace("7d5d", "7d");
				}else if(last.contains("7d5e")) {
					lastResult = last.replace("7d5e", "7e");
				}
			}
			result = pack.substring(0, pack.length()-10).concat(lastResult);
			return result;
		}
		return pack;
	}
	 
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String pack="7E0010000000000000000000007d5d7d5d7E0000000004110010000000000000010000000000000000007d5d7d5d7E7d5d7d5d7E";
		
		String pack1="7E001000000000007d5e7d5e7E0000000000000005d7d57d5d7d5d7E7d5d7d5d00004110010000000000000010000000000000000005d7d5d7E";
		
		String pack2="7E0010000000000007d5e7d5e7E000000000000005d7d5d0007d5d7d5d7E7d5d7d504110010000000000000010000000000000000007d5d7d5e7E";
		
		String pack3="7E00100000000007d5e7d5e7E00000000000005d7d5d007d5d7d5d7E7d5d7d5000004110010000000000000010000000000000000007d5d5d7E";

		String pack4="7E00100000007d5e7d5e7E00000000000007d5d7d5d7E7d5d7d50005d7d5d00000004110010000000000000010000000000000000007d5e7d5e7E";
		
		String pack5="7E00100000000000000000000000005d7d5d000004110010000000000000010000000000000000005d7d5e7E";
		
		String pack6="7E001000000000000007d5e7d5e7E0007d5e7d5d7E000000005d7d5d000004110010000000000000010000000000000000007d5e7d5d7E";
		
		String pack7="7E0010000000000000000007d5e7d5e7E0000000005d7d5d000411001000000000000001000000000000007d5d5e5e7E";
		
		String [] packs ={pack,pack1,pack2,pack3,pack4,pack5,pack6,pack7};
		
		for(int i=0;i<packs.length;i++){
			String item = packs[i];
			System.out.println(item);
			System.out.println(processString(item));
			System.out.println("---\n");
		}
		

	}

}
