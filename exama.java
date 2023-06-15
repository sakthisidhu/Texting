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

Abhibus
		
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BusBookingTestSuite {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the Chrome driver
        driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void testSearchBus() {
        // Open the website URL
        driver.get("https://www.abhibus.com/");

        // Click on the bus
        WebElement busElement = driver.findElement(By.xpath("//a[@title='Bus']"));
        busElement.click();

        // Enter leave FROM
        WebElement leaveFromElement = driver.findElement(By.id("source"));
        leaveFromElement.sendKeys("Source City");

        // Enter Going TO and Enter the Data
        WebElement goingToElement = driver.findElement(By.id("destination"));
        goingToElement.sendKeys("Destination City");

        // Click on Search
        WebElement searchButton = driver.findElement(By.id("searchBtn"));
        searchButton.click();

        // Assert the search Result
        WebElement searchResultElement = driver.findElement(By.xpath("//div[@class='mainSec']//h2"));
        String searchResultText = searchResultElement.getText();
        Assert.assertTrue(searchResultText.contains("Search Result"));
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}

Online shoppi
 import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OnlineShoppingTestSuite {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the Chrome driver
        driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void testVerifyTotalWatches() {
        // Open the website URL
        driver.get("https://www.example.com/");

        // Navigate to the path: home/Men/watches/All Watches
        WebElement menLink = driver.findElement(By.linkText("Men"));
        menLink.click();

        WebElement watchesLink = driver.findElement(By.linkText("watches"));
        watchesLink.click();

        WebElement allWatchesLink = driver.findElement(By.linkText("All Watches"));
        allWatchesLink.click();

        // Verify the total number of watches is 49593 products
        WebElement totalWatchesElement = driver.findElement(By.xpath("//div[@id='product-count']"));
        int totalWatches = Integer.parseInt(totalWatchesElement.getText());
        Assert.assertEquals(totalWatches, 49593);
    }

    @Test(priority = 2)
    public void testNoResultsFound() {
        // Open the website URL
        driver.get("https://www.example.com/");

        // Navigate to the path: Home/kids/Toys/infant Toys
        WebElement kidsLink = driver.findElement(By.linkText("kids"));
        kidsLink.click();

        WebElement toysLink = driver.findElement(By.linkText("Toys"));
        toysLink.click();

        WebElement infantToysLink = driver.findElement(By.linkText("infant Toys"));
        infantToysLink.click();

        // Verify if the page displays "No Results Found"
        WebElement noResultsElement = driver.findElement(By.xpath("//div[contains(text(), 'No Results Found')]"));
        String noResultsText = noResultsElement.getText();
        Assert.assertEquals(noResultsText, "No Results Found");
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}




