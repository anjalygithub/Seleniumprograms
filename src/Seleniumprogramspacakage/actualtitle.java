package Seleniumprogramspacakage;

import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actualtitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		// to print Facebook title in console
		driver.get("https://www.facebook.com/");
		String Title=driver.getTitle();
		System.out.println(Title);
		driver.close();
		
		// current date and time
		
		Calendar calendar_Date_Time = Calendar.getInstance();
		Date currentDateTime = calendar_Date_Time.getTime();
		System.out.println(currentDateTime);
		
		
		//future date and time
		
		Calendar calendar_Date_Timee = Calendar.getInstance();
		calendar_Date_Timee.add(Calendar.DAY_OF_YEAR, 30);
		Date futureDateTime = calendar_Date_Timee.getTime();
		System.out.println(futureDateTime);
		
		//past date and time
		
		Calendar calendar_Date_Timeee = Calendar.getInstance();
		calendar_Date_Timeee.add(Calendar.DAY_OF_YEAR,-2);
		Date pastDateTime = calendar_Date_Timeee.getTime();
		System.out.println(pastDateTime);
		
		
		
		
		
		
		
		
		

	}

}
