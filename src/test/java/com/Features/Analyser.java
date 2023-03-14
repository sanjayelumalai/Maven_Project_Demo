package com.Features;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Analyser implements IRetryAnalyzer {
	
	int count = 1;
	
	int limit=5;

	@Override
	public boolean retry(ITestResult result) {
		
		if (count<=limit) {
			
			count++;
			return true; 
			
		}
		
		
		
		
		return false;
	}
	
	
	
	

}
