package org.utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	
	public static void generateJumpReport(String jsonpath) {
		
		//1.Mention the folder location
		
		File f=new File(System.getProperty("user.dir")+"\\target\\Reports\\JumpReport");
		
		//2.Add details too the report 
		
		Configuration con=new Configuration(f,"AdactinHotelApp");
	      con.addClassifications("Platform name", "Windows 10");
	      con.addClassifications("Browser name", "Chrome");
	      con.addClassifications("Browser version", "89.0");
	     
	      //3.convert string into list
	      List<String>li=new ArrayList<String>();
	      li.add(jsonpath);
	      
	      //4.call generate report() method from reportBuilder class
	      
	      ReportBuilder r=new ReportBuilder(li,con);
	      r.generateReports();
	          

	}

}
