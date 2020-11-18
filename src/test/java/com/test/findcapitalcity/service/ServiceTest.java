package com.test.findcapitalcity.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ServiceTest {
	
	private Service service = new Service();

	@Test
	public void testGetContentPositive() throws Exception {
		String message = service.getContent("USA");
		assertNotNull(message);
		assertEquals("Capital : Washington, D.C., Code : USA, Country Name : United States of America, population : 323947000", message);
	}

	@Test(expected = Exception.class)
	public void testGetContentNegative2() throws Exception {
		service.getContent(" ");
	}

}
