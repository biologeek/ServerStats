package com.spaulding.serverstats.tests;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.spaulding.serverstats.business.SpecificService;
import com.spaulding.serverstats.business.entities.RAM;
import com.spaulding.serverstats.business.service.RAMServiceImpl;

public class RAMServiceImplTest {

	
	@Autowired
	RAMServiceImpl specService = new RAMServiceImpl();
	
	private static Date begin;
	private static Date end;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		begin = new Date();
		end = new Date();
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSelectFromDateToDate() {
		specService.selectFromDateToDate(begin, end);
	}

}
