package com.gupaoedu.vip.factory.abstr;

import com.gupaoedu.vip.factory.factory.Bmw;
import com.gupaoedu.vip.factory.factory.Car;

public class BmwFactory extends AbstractFactory{

	@Override
	protected Car getCar() {
		return new Bmw();
	}
	

}
