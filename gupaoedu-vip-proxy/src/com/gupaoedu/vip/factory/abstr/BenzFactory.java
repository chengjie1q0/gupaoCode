package com.gupaoedu.vip.factory.abstr;


import com.gupaoedu.vip.factory.factory.Benz;
import com.gupaoedu.vip.factory.factory.Car;

public class BenzFactory extends AbstractFactory{

	@Override
	protected Car getCar() {
		return new Benz();
	}

	
}
