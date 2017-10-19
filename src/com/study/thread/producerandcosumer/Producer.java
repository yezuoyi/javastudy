package com.study.thread.producerandcosumer;

import java.util.Random;

/**
 * it's horrible that you are disappearing slowly in my memory,Some memory about
 * you is so valuable that i attempt to stop it,but it's useless,it will be
 * comfortable when I remember some of it, and it did exists ever ,how beautiful
 * it is;
 * 
 * @author yezuoyi
 * 
 * @since 2014-9-16
 */

public class Producer implements Runnable {
	private Drop drop;

	public Producer(Drop drop) {
		this.drop = drop;
	}

	public void run() {
		String importantInfo[] = {
				"1.Mares eat oats", 
				"2.Does eat oats", 
				"3.Little lambs eat ivy",
				"4.A kid will eat ivy too", 
				"5.Does eat oats", 
				"6.Little lambs eat ivy", 
				"7.A kid will eat ivy too"
		};
		Random random = new Random();

		for (int i = 0; i < importantInfo.length; i++) {
			drop.put(importantInfo[i]);
			try {
				Thread.sleep(random.nextInt(1000));
			} catch (InterruptedException e) {
			}
		}
		drop.put("DONE");
	}
}
