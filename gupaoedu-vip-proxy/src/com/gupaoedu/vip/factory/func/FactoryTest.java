package com.gupaoedu.vip.factory.func;

import com.gupaoedu.vip.factory.factory.Audi;

public class FactoryTest {
	
	//��������ģʽ
	//������Ʒ�������̣���ӵ�и��ԵĹ���
	//�������գ����ɵĸ߿Ƽ��̶ȶ��ǲ�һ����
	public static void main(String[] args) {
		
		Factory factory  = new AudiFactory();
		
		System.out.println(factory.getCar());
		
		//��Ҫ�û����ģ������Ʒ��������
		factory = new BmwFactory();
		System.out.println(factory.getCar());
		
		//���ӵĴ����ʹ�ø��Ӷ�
		
		
		//���󹤳�ģʽ
		
	}

}
