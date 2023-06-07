package com.day7.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class day7task1 {
	 @Test
	  public void f() {
		  
		  WebDriverManager.edgedriver().setup();
		  WebDriver driver =new EdgeDriver();
		  
		  driver.manage().window().maximize();
		  
		  //task1
		  driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
		  String actualTitle=driver.getTitle();
		  Assert.assertEquals(actualTitle, "Guest Registration Form – User Registration");
		  
	  }
}
