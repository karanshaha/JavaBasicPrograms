package com.java.concepts;

import java.io.File;
import java.io.IOException;
import java.util.List;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

public class JunitTestCases extends TestCase{
	
	SoftwareController softwareController = new SoftwareController();
	
	@Test
	public void testServernamesPostive() throws IOException{
			String data = softwareController.readFile("test1.txt");
			List<ServerData> serverDataList = softwareController.parseAndExtractPoints(data);
			List<String> finalLowVersionList = softwareController.processingServerDataToFindLowestVersion(serverDataList);
			softwareController.writeFile("Outputtest1.txt",finalLowVersionList);
		   
			//Expected
			final File expected = new File("src/output.txt");
		    //Actual
		    final File output = new File("src/Outputtest1.txt");
		    
		    Assert.assertEquals(FileUtils.readLines(expected), FileUtils.readLines(output));
	}
	
	
	@Test
	public void testServernamesNegative() throws IOException{
		String data = softwareController.readFile("test2.txt");
		List<ServerData> serverDataList = softwareController.parseAndExtractPoints(data);
		List<String> finalLowVersionList = softwareController.processingServerDataToFindLowestVersion(serverDataList);
		softwareController.writeFile("Outputtest2.txt",finalLowVersionList);
	   
		//Expected
		final File expected = new File("src/output.txt");
	    //Actual
	    final File output = new File("src/Outputtest2.txt");
		    Assert.assertEquals(FileUtils.readLines(expected), FileUtils.readLines(output));
	}

}
