package com.gupaoedu.vip.factory.abstr;

import com.gupaoedu.vip.factory.factory.Audi;
import com.gupaoedu.vip.factory.factory.Car;

public class AudiFactory extends AbstractFactory{

	@Override
	protected Car getCar() {
		return new Audi();
	}

}
