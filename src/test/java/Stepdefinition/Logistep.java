package Stepdefinition;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Logistep {
    WebDriver driver;

    @Given("open the Url in chrome website")
    public void open_the_url_in_chrome_website() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.toolfe.org/public/login");
        driver.manage().window().maximize();
        Thread.sleep(5000);
    }

    @When("we enterd username and Password")
    public void we_enterd_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
        
    


        WebElement username = driver.findElement(By.name("email"));
        username.sendKeys("monisha@toolfe.com");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("y5t3m16c");
    }

    @And("click login button")
    public void click_login_button() throws IOException {
        WebElement signin = driver.findElement(By.id("submit-login"));
        signin.click();
        TakesScreenshot tkt = (TakesScreenshot) driver;
		File src = tkt.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/photo.png");
		// You may need to handle file copying here
    }
}
