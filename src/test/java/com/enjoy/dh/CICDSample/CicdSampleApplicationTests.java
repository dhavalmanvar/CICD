package com.enjoy.dh.CICDSample;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CicdSampleApplicationTests {
	
	@Autowired
	private SampleController sampleController;

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testSampleController() {
		Assert.assertEquals("Sample Application v1.0", sampleController.getVersion());
	}

}
