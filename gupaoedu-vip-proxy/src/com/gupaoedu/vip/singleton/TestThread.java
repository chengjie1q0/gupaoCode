package com.gupaoedu.vip.singleton;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;


public class TestThread {
	
	public static void main(String[] args) {
		//����100�߳�ͬʱȥ��CPU
		int count = 1000;
		
		//����ǹ�����Բ��������õ�
		CountDownLatch latch = new CountDownLatch(count);
		
		//SetĬ��ȥȥ�صģ�set�Ǳ����̲߳���ȫ��
		final Set<Singleton4> syncSet = Collections.synchronizedSet(new HashSet<Singleton4>());
		
		for (int i = 0; i < count; i++) {
			new Thread() {
				public void run() {
					syncSet.add(Singleton4.getInstance());
				}
			}.start();
			
			latch.countDown();
		}
		
		try {
			latch.await();//�ȴ������߳�ȫ����ɣ�����������
			for (Singleton4 temp : syncSet) {
				System.out.println(temp);
			}
//			System.out.println(syncSet.size());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
