package TestRunner.loginSteps;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.lang.String;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;

import TestRunner.SetupClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SignUp_Step extends SetupClass {
	
	WebDriverWait wait = new WebDriverWait(driver,50);
         JavascriptExecutor js = (JavascriptExecutor) driver;
	
	@Given("^user is already on Website Home Page ii$")
	public void user_is_already_on_Website_Home_Page_ii() throws Throwable {
		driver.get("https://www.slidegeeks.com/");
		Thread.sleep(2000);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		log.info("It's opening the website URL");
		Thread.sleep(1000);
		
	}

	@Then("^user navigates to sign up page ii$")
	public void user_navigates_to_sign_up_page_ii() throws Throwable {
		
		driver.get("https://www.slidegeeks.com/subscriptions");
		Thread.sleep(4000);
		 WebElement Join_now = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Monthly")));
		Thread.sleep(3000);
		Join_now.click();
		Thread.sleep(5000);
		String URL = driver.getCurrentUrl();
                Assert.assertEquals(URL, "https://www.slidegeeks.com/component/pago/checkout");
		System.out.println("URL matching --> Part executed");
		
		Thread.sleep(2000);
		ebElement Join_now1 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Semi\ Annual")));
		Thread.sleep(3000);
		Join_now1.click();
		Thread.sleep(5000);
		String URL = driver.getCurrentUrl();
                Assert.assertEquals(URL, "https://www.slidegeeks.com/component/pago/checkout");
		System.out.println("URL matching --> Part executed");
	}

}
