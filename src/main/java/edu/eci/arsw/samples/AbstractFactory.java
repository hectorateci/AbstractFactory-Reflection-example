package edu.eci.arsw.samples;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

/**
 * 
 * @author hcadavid
 *
 */
public abstract class AbstractFactory {

	
	//singleton instance
	private static AbstractFactory instance=null;
	
	
	
	public static AbstractFactory getInstance(){
		
		if (instance==null){				
		
			//read properties file and choose concrete factory
			Properties properties = new Properties();
			
			String configFilePath=AbstractFactory.class.getResource("factory.properties").getPath().replaceAll("%20", " ");
			
			try {
			    properties.load(new FileInputStream(configFilePath));
			} catch (IOException e) {
				throw new RuntimeException("Abstract factory initialization failed");
			}
			
			String concreteFactory=properties.getProperty("concretefactory");				
			
			
			//dynamically create concrete factory's instance 
			try {
				
				Class c=Class.forName(concreteFactory);							
				Constructor cons = c.getConstructor(new Class[]{});
				Object newInstance=cons.newInstance(new Object[]{});
				
				instance = (AbstractFactory) newInstance;
			} catch (ClassNotFoundException e) {
				throw new RuntimeException("Abstract factory initialization failed",e);
			} catch (SecurityException e) {
				throw new RuntimeException("Abstract factory initialization failed",e);
			} catch (NoSuchMethodException e) {
				throw new RuntimeException("Abstract factory initialization failed",e);
			} catch (IllegalArgumentException e) {
				throw new RuntimeException("Abstract factory initialization failed",e);
			} catch (InstantiationException e) {
				throw new RuntimeException("Abstract factory initialization failed",e);
			} catch (IllegalAccessException e) {
				throw new RuntimeException("Abstract factory initialization failed",e);
			} catch (InvocationTargetException e) {
				throw new RuntimeException("Abstract factory initialization failed",e);
			} catch (ClassCastException e){
				throw new RuntimeException("Abstract factory initialization failed",e);
			}
						
		}
		
		return instance;
	}
	
	
	public abstract AbstractProductA getProductA();
	
	public abstract AbstractProductB getProductB();
	
}

