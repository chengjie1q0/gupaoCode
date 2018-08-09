package com.gupaoedu.vip.factory.func;

import com.gupaoedu.vip.factory.factory.Benz;
import com.gupaoedu.vip.factory.factory.Car;

public class BenzFactory implements Factory{

	@Override
	public Car getCar() {
		return new Benz();
	}
	
	

}
