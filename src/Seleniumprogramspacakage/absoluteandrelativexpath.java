package Seleniumprogramspacakage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class absoluteandrelativexpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qavbox.github.io/demo/signup/");
		driver.manage().window().maximize();
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");


		//WebElement fullname =driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[2]/input"));
		//fullname.sendKeys("Izza Elizabeth Gladin");
		//WebElement email = driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[3]/input"));
		//email.sendKeys("izza@gmail.com");
		//WebElement telephone = driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[4]/input"));
		//telephone.sendKeys("1234567890");
		//WebElement image =driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[6]/input"));
		//image.sendKeys("C:\\Users\\HP\\Pictures\\img1");
		//WebElement gender =driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[7]/select"));
		//gender.click();
		//WebElement female=driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[7]/select"));
		//female.sendKeys("Female");
		//female.click();
		//WebElement exp = driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[8]/input[3]"));
		//exp.click();
		//WebElement skill1 = driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[9]/input[1]"));
		//skill1.click();
		//WebElement skill2 = driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[9]/input[2]"));
		//skill2.click();
		//WebElement skill3 = driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[9]/input[3]"));
		//skill3.click();
		//WebElement submit = driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[9]/input[3]"));
		//submit.sendKeys(Keys.RETURN);
		
		// relative xpath
		WebElement fullname =driver.findElement(By.xpath("//*[@id='username']"));
		fullname.sendKeys("Izza Elizabeth Gladin");
		WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
		email.sendKeys("izza@gmail.com");
		WebElement telephone = driver.findElement(By.xpath("//*[@id='tel']"));
	    telephone.sendKeys("1234567890");
	    WebElement image =driver.findElement(By.xpath("//*[@name='datafile']"));
	    image.sendKeys("C:\\Users\\HP\\Pictures\\img1");
	    Select drop = new Select(driver.findElement(By.xpath("//*[@name='sgender']")));
		drop.selectByValue("female");
		
        WebElement exp = driver.findElement(By.xpath("//*[@value='two']")); 
		exp.click();
		WebElement skill1 = driver.findElement(By.xpath("//*[@value='manualtesting']"));
		skill1.click();
		WebElement skill2 = driver.findElement(By.xpath("//*[@value='automationtesting']"));
		skill2.click();
		WebElement skill3 = driver.findElement(By.xpath("//*[@value='testng']")); 
		skill3.click();
		WebElement submit = driver.findElement(By.xpath("//*[@id='submit']"));
	    submit.sendKeys(Keys.RETURN);
		

	}

}
