package com.gupaoedu.vip.factory.simple;

import com.gupaoedu.vip.factory.factory.Car;

public class SimpleFactoryTest {
	
	public static void main(String[] args) {
		//��߾������ǵ�������
		Car car = new SimpleFactory().getCar("Audi");
		System.out.println(car.getName());
	}

}
