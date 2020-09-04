package com.Zoopla.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.bson.io.OutputBuffer;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



public class CommonUtilities {

	String sPathConfig="\\src\\main\\java\\com\\Zoopla\\Properties\\config.properties";
	 String sLogConfig="\\src\\main\\java\\com\\Zoopla\\Properties\\log4j.properties";
	 String sTestDataConfig="\\src\\main\\resources\\TestData\\TestData.properties";
	 
	static String sPathScreenshot="\\Report\\Screenshot_";
	 Properties prop=new Properties();
	 FileInputStream fi=null;
	 
	 public void loadProperty() throws Exception {
		 fi=new FileInputStream(System.getProperty("user.dir")+sPathConfig);
		 prop.load(fi);
		 System.getProperties().putAll(prop);
	 }
	 
	 public void loadTestData() throws Exception {
		 fi=new FileInputStream(System.getProperty("user.dir")+sTestDataConfig);
		 prop.load(fi);
		 System.getProperties().putAll(prop);
	 }
	 
	 public void loadLogProperties() throws Exception {
		 fi=new FileInputStream(System.getProperty("user.dir")+sLogConfig);
		 prop.load(fi);
		 System.getProperties().putAll(prop);
	 }
	 
	 public static String attachScreenshotReport() throws Exception {
		 TakesScreenshot ts= (TakesScreenshot) TestBase.driver;
		 File SrcFile=ts.getScreenshotAs(OutputType.FILE);
		 String datetime=DateTimeFormatter.ofPattern("MMddyyyyHHmmss").format(LocalDateTime.now());
		 String sDestPath=System.getProperty("user.dir")+sPathScreenshot+datetime+".png";
		 File DestFile=new File(sDestPath);
		 FileUtils.copyFile(SrcFile, DestFile);
		 return sDestPath;
	 }
}
