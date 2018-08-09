package com.gupaoedu.vip.factory.simple;

import com.gupaoedu.vip.factory.factory.Audi;
import com.gupaoedu.vip.factory.factory.Benz;
import com.gupaoedu.vip.factory.factory.Bmw;
import com.gupaoedu.vip.factory.factory.Car;

//�������������˵(̫ǿ����)
//Ϊʲô��
//�������ɶ���ܸ�(��������ʵ)
//����Ҳ��һ������(�ڻ��ͨ),������Դ������ع鵽�����
public class SimpleFactory {
	
	//ʵ��ͳһ����רҵ������
	//���û�й���ģʽ��С������û��ִ�б�׼��
	//��������޲�Ʒ��û�б�׼��
	//�����ල�ֹ����ѶȻ������
	
	//�й�����(���˼ҵı�׼ִ��)
	//�й��������й�����ı�(�������������ˣ�������ʲô��˼ά����)
	//��ũ����ִ�б�׼����
	//ϵͳ�ܹ�ʦ�������ƶ���׼����
	
	//��ֻ��һ�������ߣ���Ҫ��һ��˼����
	
	public Car getCar(String name) {
		if("BWM".equalsIgnoreCase(name)) {
			//Spring�еĹ���ģʽ
			//Bean
			//BeanFactory������Bean��
			//������Bean
			//���������Bean
			//��ԭʼ��Bean��ԭ�ͣ�
			//List���͵�Bean
			//������ͬ��Bean
			
			//getBean
			//�ǳ������ң�ά������
			//�������Ͽ�����
			
			return new Bmw();
		}else if("Benz".equalsIgnoreCase(name)) {
			return new Benz();
		}else if("Audi".equalsIgnoreCase(name)) {
			return new Audi();
		}else {
			System.out.println("�����Ʒ��������");
			return null;
		}
		
	}

}
