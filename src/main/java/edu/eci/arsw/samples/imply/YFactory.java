package edu.eci.arsw.samples.imply;

import edu.eci.arsw.samples.AbstractFactory;
import edu.eci.arsw.samples.AbstractProductA;
import edu.eci.arsw.samples.AbstractProductB;
import edu.eci.arsw.samples.implx.XProductA;

public class YFactory extends AbstractFactory {

	@Override
	public AbstractProductA getProductA() {
		return new YProductA();
	}

	@Override
	public AbstractProductB getProductB() {
		return new YProductB();
	}

}
