package com.example;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringSecurityApplication.class)
@WebAppConfiguration
public class SpringSecurityApplicationTests {

	@Autowired
	BrukerRepository brukerRepository;

	@Test
	public void loadBruker() {
		Bruker bruker = brukerRepository.findByBrukernavn("christer");
		assertEquals("christer", bruker.getBrukernavn());
	}

}
