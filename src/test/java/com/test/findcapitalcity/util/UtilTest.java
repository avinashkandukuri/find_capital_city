package com.test.findcapitalcity.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class UtilTest {

	@Test
	public void testGetStateCodeByNameSuccess() throws Exception {
		String Name = Util.getCoutNameByCode("IND");
		assertNotNull(Name);
		assertEquals("INDIA", Name);
	}

	@Test(expected = Exception.class)
	public void testGetStateCodeByNameFailure() throws Exception {
		String code = Util.getCoutNameByCode("");
		assertNull(code);
	}

}
