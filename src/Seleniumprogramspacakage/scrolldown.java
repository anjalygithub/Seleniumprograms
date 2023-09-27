package Seleniumprogramspacakage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolldown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		JavascriptExecutor js =(JavascriptExecutor) driver;
		
		// this will scroll down the page by 1000 pixel vertical
		//js.executeScript("window.scrollBy(0,1000)");
		
		
		// 2. to scroll down the web page by the visibility of the element.
		//syntax js.executeScript("arguments[0].scrollIntoView();",Element);
		// find element by link text and store in variable "Element"
		//WebElement Element = driver.findElement(By.xpath("//*[@id=\"rt-mainbody\"]/div/article/div[1]/div/div[3]/div/div/div[1]/h4"));
		//js.executeScript("arguments[0].scrollIntoView();",Element);
		
		//3. to scroll down the web page at the bottom of the page
		// This will scroll the web page till end
		//Syntax js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		//4. Horizontal scroll on the web page
		//syntax js.executeScript("arguments[0].scrollIntoView();",Element);
		WebElement Element = driver.findElement(By.linkText("VBScript"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		
		
		//JavascriptExecutor in selenium to click a button
		//js.executeScript("document.getElementByID('element id').click();");
		
		//JavascriptExecutor in selenium to send text
		//js.executeScript("document.getElementByID('element id').value='xyz';");
		

		//JavascriptExecutor in selenium to interact with checkbox
		//js.executeScript("document.getElementByID('element id').checked=false;");
		

		//JavascriptExecutor in selenium to refresh the browser window
		//js.executeScript("location.reload()");
		
		
		

		

	}

}
