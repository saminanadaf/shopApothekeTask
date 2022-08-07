package testcases;

import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import base.BaseTest;

public class LoginTestCase extends BaseTest {

	@Test(priority = 1)
	public void loginTestValid() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Navigate to a website
		driver.get("https://www.shop-apotheke.com/nx/login/");

		// Get title of page
		System.out.println("Page Title is:" + driver.getTitle());

		// Maximize current window
		driver.manage().window().maximize();

		// Delay execution for 5 seconds
		Thread.sleep(5000);

		// Select all cookies
		// driver.findElement(By.xpath("//*[@id=\'focus-lock-id\']/div/div/div[2]/div/div/div[2]/div/div/button[2]")).click();

		// Enter email id and password
		driver.findElement(By.id("loginForm-eMail")).sendKeys("saminanadaf2013@gmail.com");
		driver.findElement(By.id("loginForm-password")).sendKeys("Samina@123");

		System.out.println("Email id and password entered successfully");

		// This will scroll down the page by 1000 pixel vertical
		js.executeScript("window.scrollBy(0,1000)");

		// Click on Register button for login
		driver.findElement(By.xpath("//*[@id=\'login-submit-btn\']")).click();

		System.out.println("Login successfully");

	}

	@Test(priority = 1)
	public void loginTestInvalid() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Navigate to a website
		driver.get("https://www.shop-apotheke.com/nx/login/");

		// Get title of page
		System.out.println("Page Title is:" + driver.getTitle());

		// Maximize current window
		driver.manage().window().maximize();

		// Delay execution for 5 seconds
		Thread.sleep(5000);

		// Select all cookies
		// driver.findElement(By.xpath("//*[@id=\'focus-lock-id\']/div/div/div[2]/div/div/div[2]/div/div/button[2]")).click();

		// Enter email id and password
		driver.findElement(By.id("loginForm-eMail")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("loginForm-password")).sendKeys("Samina@123");

		System.out.println("Email id and password entered successfully");

		// This will scroll down the page by 1000 pixel vertical
		js.executeScript("window.scrollBy(0,1000)");

		// Click on Register button for login
		driver.findElement(By.xpath("//*[@id=\'login-submit-btn\']")).click();

		System.out.println("Login Unsuccessfull for invalid email id");

	}
}
