package com.gupaoedu.vip.proxy.jdk;

public class TestFindLove {
	
	public static void main(String[] args) {
		Person obj = (Person)new Meipo().getInstance(new XiaoXingXing());
		System.out.println(obj.getClass());
		obj.findeLove();
		
		//ԭ��
		//1.�õ��������������ã�Ȼ���ȡ���Ľӿ�
		//2.JDK������������һ���࣬ͬʱʵ�����Ǹ��Ĵ��������ʵ�ֵĽӿ�
		//3.�ѱ�������������Ҳ�õ���
		//4.���¶�̬����һ��class�ֽ���
		//5.Ȼ�����
	}

}
