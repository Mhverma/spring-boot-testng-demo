package com.manoj.training.spring.springboottestngdemo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

/**
 * 
 * @author Manoj Verma
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class SpringBootTestngDemoApplicationTests extends AbstractTestNGSpringContextTests{

	@Autowired
	private TestRestTemplate restTemaplate;
	
	@Test
	public void testSayHello()
	{
		ResponseEntity<String> entity =  this.restTemaplate.getForEntity("/sayHello", String.class);
		Assert.assertEquals(entity.getStatusCode(), HttpStatus.OK);
		Assert.assertEquals(entity.getBody(),"Hello World");
	}
}
