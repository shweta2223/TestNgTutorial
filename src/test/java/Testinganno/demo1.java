package Testinganno;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class demo1 {

	@Test
	public void testA(){
	 Assert.assertEquals("Gmail", "Gmail");
	 }
	@Test
	public void testC(){
	 Assert.assertEquals("Softtech", "Softtech");
	 }
	@Test
	public void testB(){
	 Assert.assertEquals("Selenium", "Selenium");
	 }
	} 



