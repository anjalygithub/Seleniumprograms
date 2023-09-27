package Seleniumprogramspacakage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//WebElement searchbar= driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input"));
		//searchbar.sendKeys("womens watch");
		//WebElement searchicon =driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div/span/input"));
		//searchicon.click();
		//searchbar.sendKeys(Keys.RETURN);
		//WebElement cl = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input"));
		//cl.clear();
		//WebElement ne = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input"));
		//ne.sendKeys("watches men");
		
		//WebElement cli = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div/span/input"));
		//cli.click();
		
		//ne.sendKeys(Keys.RETURN);
		
		//relative xpath using OR
		
//		WebElement searchbar= driver.findElement(By.xpath("//*[@id='twotabsearchtextbox' or @type='text']"));
//	    searchbar.sendKeys("womens watch");
//	    WebElement cli = driver.findElement(By.xpath("//*[@id='nav-search-submit-button' or @class='nav-search-submit nav-sprite']"));
//	    cli.click();
//	    WebElement cl = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox' or  @type='text']"));
//	    cl.clear();
//	    WebElement ne = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox' or @type='text']"));
//	  	ne.sendKeys("watches men");
//	  	WebElement clii = driver.findElement(By.xpath("//*[@id='nav-search-submit-button'or @class='nav-search-submit nav-sprite']"));
//		clii.click();
//	  	
		
		// RELATIVE XPATH USING AND 
//		
//		WebElement searchbar= driver.findElement(By.xpath("//*[@id='twotabsearchtextbox' and @class='nav-input nav-progressive-attribute']"));
//      searchbar.sendKeys("womens watch");
//	    WebElement cli = driver.findElement(By.xpath("//*[@id='nav-search-submit-button' and @type='submit']"));
//	    cli.click();
//	    WebElement cl = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox' and  @type='text']"));
//	    cl.clear();
//	    WebElement ne = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox' and @type='text']"));
//	  	ne.sendKeys("watches men");
//	  	WebElement clii = driver.findElement(By.xpath("//*[@id='nav-search-submit-button' and @value='Go']"));
//		clii.click();
		
		//relative xpath using contains
//		WebElement searchbar= driver.findElement(By.xpath("//input[contains(@type,'text')]"));
//      searchbar.sendKeys("womens watch");
//	    WebElement cli = driver.findElement(By.xpath("//input[contains(@id,'nav-search')]"));
//	    cli.click();
//	    WebElement cl = driver.findElement(By.xpath("//input[contains(@type,'text')]"));
//      cl.clear();
        
		//relative xpath using starts-with
	    
//       WebElement ne = driver.findElement(By.xpath("//input[starts-with(@type,'text')]"));
//  	 ne.sendKeys("watches men");
//	  	 WebElement clii = driver.findElement(By.xpath("//input[starts-with(@id,'nav-search')]"));
//		 clii.click();
//		
		//relative xpath using text
//
//        WebElement ne = driver.findElement(By.xpath("//a[text()='Mobiles']"));
//  	  ne.click();
		
		
		//relative xpath using chained xpath
		
		
		 WebElement ne = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox' // @type='text'] "));
     	 ne.sendKeys("watches men");
     	 WebElement clii = driver.findElement(By.xpath("//*[@id='nav-search-submit-button' // @class='nav-search-submit nav-sprite']"));
		 clii.click();



	}

}


