package testcases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.basetest;

public class testone extends basetest {
	
	

	@DataProvider(name = "loginsyt")
	public Object[][] dataset1() {
		return new Object[][] { 
			{ "standard_user", "secret_sauce"  }, 
			{ "problem_user", "secret_sauce" }, 
			{ "performance_glitch_user", "secret_sauce" },
			{ "locked_out_user", "secret_sauce" }
		};
			
		}

	@Test(dataProvider = "loginsyt")

	public static void loginsetup(String username, String password) {

		driver.findElement(By.cssSelector(Q.getProperty("username"))).sendKeys("standard_user");
		driver.findElement(By.cssSelector(Q.getProperty("password"))).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector(Q.getProperty("loginButton"))).click();

	}

	@Test
	public static void Itemscount() {
		driver.findElement(By.cssSelector(Q.getProperty("username"))).sendKeys("standard_user");
		driver.findElement(By.cssSelector(Q.getProperty("password"))).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector(Q.getProperty("loginButton"))).click();

		List<WebElement> items = driver.findElements(By.cssSelector("[class=\"inventory_item_name\"]"));
		int itemsCount = items.size();
		System.out.println(itemsCount);

	}

	@Test
	public static void Gettitle() {
		driver.findElement(By.cssSelector(Q.getProperty("username"))).sendKeys("standard_user");
		driver.findElement(By.cssSelector(Q.getProperty("password"))).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector(Q.getProperty("loginButton"))).click();
		System.out.println(driver.getTitle());
	}

}
