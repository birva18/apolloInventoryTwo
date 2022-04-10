package com.apollo.inventory.one.apolloInventoryOne;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class ApolloInventoryOneApplicationTests {

	@Test
	void contextLoads() {
		System.out.println(new BCryptPasswordEncoder().encode("password"));
	}

}
