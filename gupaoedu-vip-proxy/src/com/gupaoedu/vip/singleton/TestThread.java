package com.gupaoedu.vip.singleton;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;


public class TestThread {
	
	public static void main(String[] args) {
		//启动100线程同时去抢CPU
		int count = 1000;
		
		//发令枪，测试并发经常用到
		CountDownLatch latch = new CountDownLatch(count);
		
		//Set默认去去重的，set是本身线程不安全的
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
			latch.await();//等待所有线程全部完成，最终输出结果
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
