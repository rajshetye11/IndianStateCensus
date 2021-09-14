package com.bridgelabz.indianstatescensus;

import org.junit.Assert;
import org.junit.Test;

public class IndianCensusTest {
	private static final String INDIA_CENSUS_CSV_FILE_PATH = "C:\\Users\\RAJ\\eclipsenewworkspace\\IndianStatesCensus\\lib\\IndiaStateCensusData.csv";
	public IndianCensusAnalyser analyser;
	private static final String INDIAN_CSV_STATE_PATH = "C:\\Users\\RAJ\\eclipsenewworkspace\\IndianStatesCensus\\lib\\StateCode.csv";
	
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
	
	
//	State

	@Test
	public void returnSizeState() throws Exception {
		try {
			analyser = new IndianCensusAnalyser();
			Assert.assertEquals(37, analyser.loadStateData(INDIAN_CSV_STATE_PATH));
		}catch(CustomException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void shouldExecuteProperly_IfRecordsAreEqualState() throws Exception {
		try {
			analyser = new IndianCensusAnalyser();
			Assert.assertEquals(37, analyser.loadStateData(INDIAN_CSV_STATE_PATH));
		}catch(CustomException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void shouldReturnRecordsif_CSVFileIsDetectedState() throws Exception {
		try {
			analyser = new IndianCensusAnalyser();
			Assert.assertEquals(37, analyser.loadStateData("xyz.csv"));
		}catch(CustomException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void shouldReturnCustomException_ifDelimiterIncorrectState() throws Exception {
		try {
			analyser = new IndianCensusAnalyser();
			Assert.assertEquals(37, analyser.loadStateData(INDIAN_CSV_STATE_PATH));
		}catch(CustomException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void shouldReturCustomException_ifCSVHeaderIncorrectState() throws Exception {
		try {
			analyser = new IndianCensusAnalyser();
			Assert.assertEquals(37, analyser.loadStateData(INDIAN_CSV_STATE_PATH));
		}catch(CustomException e) {
			e.printStackTrace();
		}
	}
	
	
}
