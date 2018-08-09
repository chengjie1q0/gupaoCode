package com.gupaoedu.vip.factory.abstr;

import com.gupaoedu.vip.factory.factory.Car;

public class DefaultFactory extends AbstractFactory{
	
	private AudiFactory defaultFactory = new AudiFactory();

	@Override
	protected Car getCar() {
		return defaultFactory.getCar();
	}

}
