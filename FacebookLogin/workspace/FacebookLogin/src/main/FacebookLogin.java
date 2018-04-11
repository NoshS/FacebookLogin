package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		
		//Get the username and password
		String username = args[0], password = args[1];
		
		//
		System.setProperty("webdriver.chrome.driver", "./chromedriver");
		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("http://facebook.com");
		
		//Confirmation
		System.out.println("Successfully Opened up: "+ chromeDriver.getTitle());
		
		//Send the username and password provided by the user, to the username and password input fields on the homepage. 
		WebElement usernameField = chromeDriver.findElement(By.id("email")); //Change to xpath?
		WebElement passField = chromeDriver.findElement(By.id("pass")); //Change to xpath?
		usernameField.sendKeys(username);
		passField.sendKeys(password);
	}//Closes main
}//Closes class
