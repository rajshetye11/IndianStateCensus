package com.bridgelabz.indianstatescensus;

import org.junit.Assert;
import org.junit.Test;

public class IndianCensusTest {
	private static final String INDIA_CENSUS_CSV_FILE_PATH = "C:\\Users\\RAJ\\eclipsenewworkspace\\IndianStatesCensus\\lib\\IndiaStateCensusData.csv";
	public IndianCensusAnalyser analyser;
	
	@Test
	public void returnSize() throws Exception {
		try {
			analyser = new IndianCensusAnalyser();
			Assert.assertEquals(29, analyser.loadCensusData(INDIA_CENSUS_CSV_FILE_PATH));
		}catch(CustomException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void shouldExecuteProperly_IfRecordsAreEqual() throws Exception {
		try {
			analyser = new IndianCensusAnalyser();
			Assert.assertEquals(29, analyser.loadCensusData(INDIA_CENSUS_CSV_FILE_PATH));
		}catch(CustomException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void shouldReturnRecordsif_CSVFileIsDetected() throws Exception {
		try {
			analyser = new IndianCensusAnalyser();
			Assert.assertEquals(29, analyser.loadCensusData(INDIA_CENSUS_CSV_FILE_PATH));
		}catch(CustomException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void shouldReturnCustomException_ifDelimiterIncorrect() throws Exception {
		try {
			analyser = new IndianCensusAnalyser();
			Assert.assertEquals(29, analyser.loadCensusData(INDIA_CENSUS_CSV_FILE_PATH));
		}catch(CustomException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void shouldReturCustomException_ifCSVHeaderIncorrect() throws Exception {
		try {
			analyser = new IndianCensusAnalyser();
			Assert.assertEquals(29, analyser.loadCensusData(INDIA_CENSUS_CSV_FILE_PATH));
		}catch(CustomException e) {
			e.printStackTrace();
		}
	}
	
	
}
