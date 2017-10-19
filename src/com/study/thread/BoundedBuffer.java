package com.study.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BoundedBuffer {
	final Lock lock = new ReentrantLock();// ������
	final Condition notFull = lock.newCondition();// д�߳�����
	final Condition notEmpty = lock.newCondition();// ���߳�����

	final Integer[] items = new Integer[10];// �������
	int putptr/* д���� */, takeptr/* ������ */, count/* �����д��ڵ����ݸ��� */;

	public void put(Integer x) throws InterruptedException {
		lock.lock();
		try {
			while (count == items.length)
				// �����������
				notFull.await();// ����д�߳�
			items[putptr] = x;// ��ֵ
			System.out.println("д�룺" + x);
			if (++putptr == items.length)
				putptr = 0;// ���д����д�����е����һ��λ���ˣ���ô��Ϊ0
			++count;// ����++
			notEmpty.signal();// ���Ѷ��߳�
		} finally {
			lock.unlock();
		}
	}

	public Integer take() throws InterruptedException {
		lock.lock();
		try {
			while (count == 0)
				// �������Ϊ��
				notEmpty.await();// �������߳�
			Integer x = items[takeptr];// ȡֵ
			System.out.println("��ȡ��" + x);
			if (++takeptr == items.length)
				takeptr = 0;// ����������������е����һ��λ���ˣ���ô��Ϊ0
			--count;// ����--
			notFull.signal();// ����д�߳�
			return x;
		} finally {
			lock.unlock();
		}
	}

	public static void main(String[] args) {
		final BoundedBuffer b = new BoundedBuffer();

		new Thread(new Runnable() {
			public void run() {
				int i = 0;
				while (true) {
					try {
						b.put(i++);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		new Thread(new Runnable() {
			public void run() {
				while (true) {
					try {
						b.take();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}
}
