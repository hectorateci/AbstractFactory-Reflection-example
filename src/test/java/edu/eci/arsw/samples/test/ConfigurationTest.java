/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.samples.test;

import edu.eci.arsw.samples.AbstractFactory;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hcadavid
 */
public class ConfigurationTest {
    
   @Test
   public void configTest(){
       assertTrue("Configuration file not available",AbstractFactory.class.getResource("factory.properties")!=null);
   }
    
}
