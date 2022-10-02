package com.lblazer.musicRecommender.controller;


import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HomeITest {
	
	@Autowired
	private TestRestTemplate template;
	
	@Test
	public void getLanding() throws Exception{
		ResponseEntity<String> response = template.getForEntity("/home",String.class);
		assertThat(response.getBody()).isEqualTo("Arrgh this be it, matey");
	}

}