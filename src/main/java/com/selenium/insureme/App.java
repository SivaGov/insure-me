package com.selenium.insureme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	
       	ChromeOptions options = new ChromeOptions();
    	options.addArguments("--headless");
    	
    	
    	WebDriver driver = new ChromeDriver(options);
    	
 
    	
    	
        driver.get("http://34.201.129.185:8081/contact.html");
        
        System.out.println(driver.getTitle());
        
        WebElement name = driver.findElement(By.id("inputName"));
        name.sendKeys("First Name");
        
        WebElement number = driver.findElement(By.id("inputNumber"));
        name.sendKeys("333333333");
        
        WebElement email = driver.findElement(By.id("inputMail"));
        name.sendKeys("testmail@test.com");
        
        WebElement message = driver.findElement(By.id("inputMessage"));
        name.sendKeys("My test program");
        
        WebElement submitButton = driver.findElement(By.id("my-button"));
        submitButton.click();
        
        WebElement response = driver.findElement(By.id("response"));
        response.getText();
        
        System.out.println(response.getText());
        
        if(response.getText().equalsIgnoreCase("Message Sent")) {
        	System.out.println("Test case passed");
        	        	       	
        }
        else
        {
        	System.out.println("Test case failed");
        }
        
        driver.quit();
    }
}
