package com.ttn.Practise;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import com.google.gson.Gson;
import org.joda.time.DateTime;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PractiseApplicationTests {

	@Test
	public void testGsonSerialization() {
		Admin admin = new Admin("TestUser", "Test123@");
		Gson gson = new Gson();
		String json = gson.toJson(admin);

		assertNotNull(json, "JSON serialization should not return null");
		assertTrue(json.contains("TestUser"), "JSON should contain username");
	}


	@Test
	public void testJodaTime() {
		DateTime now = new DateTime();
		assertNotNull(now, "Joda-Time should return a valid DateTime object");
	}
}
