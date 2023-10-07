import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitPhoneAndZip {

	@Test
	void testZipCode() {
		Address place = new Address();
		place.setZipCode("123456");
		assertEquals("123456", place.getZipCode());
	}
	@Test 
	void testZipCodeAcception() {
		Address navigation = new Address();
		navigation.setZipCode("233336");
		assertEquals("233336", navigation.getZipCode());
	}
	
	@Test
	void testPhoneNum() {
		Customer cM = new Customer();
		cM.setPhoneNum("12345678910");
		assertEquals("12345678910", cM.getPhoneNum());
	}
	
	@Test
	void testPhoneNumAcception() {
		Customer cM2 = new Customer();
		cM2.setPhoneNum("234332212334");
		assertEquals("234332212334", cM2.getPhoneNum());
	
	
	
	}

}
