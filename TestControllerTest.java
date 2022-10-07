package com.admin.controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
public class TestControllerTest {

	
	@Mock
	TestController testController;
	
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetData() {
		Mockito.when(testController.getData()).thenReturn("User Test");
		String str = testController.getData();
		assertEquals("User Test",str);
	}

}
