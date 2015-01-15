package edu.eci.arsw.samples.implx;

import edu.eci.arsw.samples.AbstractFactory;
import edu.eci.arsw.samples.AbstractProductA;
import edu.eci.arsw.samples.AbstractProductB;

public class XFactory extends AbstractFactory {

	@Override
	public AbstractProductA getProductA() {
		return new XProductA();
	}

	@Override
	public AbstractProductB getProductB() {
		return new XProductB();
	}

}
