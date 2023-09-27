package Seleniumprogramspacakage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class imageupload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qavbox.github.io/demo/signup/");
		driver.manage().window().maximize();
		WebElement fileinput = driver.findElement(By.xpath("//*[@id=\"container\"]/div[6]/input"));
		fileinput.sendKeys("C:\\Users\\HP\\Pictures\\img1");
		
		// scroll down code
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		//wait for a few seconds to ensure the file is uploaded
		try {
			Thread.sleep(5000);
			
		} catch(InterruptedException e) {
		e.printStackTrace();
	}

	}

}
