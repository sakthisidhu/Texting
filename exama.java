package com.example.Demo1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class exama {
	public static void main(String[] arg)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/s?k=dress&ref=nb_sb_noss");
		driver.manage().window().maximize();
		String actTitle = driver.getTitle();
		actTitle.equals("Amazon.in : dress");
//		WebElement ClkButton = driver.findElement(By.xpath(""));
//		ClkButton.getCssValue("background-color");
//		driver.switchTo().alert().getText();
//		JavascriptExecutor js= (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(2000);
//		//js.executeScript("arguments[0].setAttributes("value","16/23/23")", date);
//		Actions ac=new Actions(driver);
//		WebElement drag = driver.findElement(By.xpath(""));
//		WebElement drop = driver.findElement(By.xpath(""));
//		ac.clickAndHold(drag).release(drop).build().perform();
//		
		List<WebElement> ls=driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base']"));
		for(WebElement k:ls)
		{
			System.out.println(k.getText());
		}
		
	}
}
