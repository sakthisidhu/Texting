package com.day8.pods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day4task4 {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.abhibus.com/bus-ticket-booking");
		driver.manage().window().maximize();
		WebElement org = driver.findElement(By.xpath("//*[@id=\"source\"]"));
		org.sendKeys("Coimbatore");
		Thread.sleep(3000);  
		org.sendKeys(Keys.ENTER);
		
		org.click();
 		  Select select= new Select(org);
        	  select.selectByVisibleText("Coimbatore");
 
		  Thread.sleep(3000);
		WebElement des = driver.findElement(By.name("destination"));
		des.click();
		Thread.sleep(3000);
		des.sendKeys("Chidambaram");
		Thread.sleep(3000);
		des.sendKeys(Keys.ENTER);
		
	  Select sel= new Select(des);
		  Thread.sleep(3000);
		  sel.selectByVisibleText("Chidambaram");
		  Thread.sleep(3000); 
		driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"todaydiv\"]/h4")).click();
		driver.findElement(By.xpath("//*[@id=\"seo_search_btn\"]")).click();
		
		
	}
		

}
