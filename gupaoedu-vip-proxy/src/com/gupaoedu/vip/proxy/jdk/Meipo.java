package com.gupaoedu.vip.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Meipo implements InvocationHandler{
	
	private Person target;//����������������Ϊһ����Ա��������������
	
	//��ȡ�����˵ĸ�������
	public Object getInstance(Person target) {
		this.target = target;
		Class clazz = target.getClass();
		System.out.println("����������class��:"+clazz);
		return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("����ý�ţ�" + "�ø����Ҹ����Բ���");
		System.out.println("��ʼ���к�ѡ...");
		System.out.println("------------");
		
		//���õ�ʱ��
		this.target.findeLove();
		System.out.println("------------");
		System.out.println("������ʵĻ�����׼������");
		return null;
	}
	

}
