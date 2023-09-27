package Seleniumprogramspacakage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to start a new session
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		// create object of action class
		
		Actions ac = new Actions(driver);
		
		// find element using locator and store into webElement 
		WebElement link = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		ac.doubleClick(link).perform();
		
		
			

	}

}
