package facebook;

import java.util.List;

import org.apache.http.client.fluent.Request;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.IsElementPresent;

public class FaceBookTest {

	WebDriver driver = null;
	
	@BeforeTest
	public void before(){
		System.setProperty("webdriver.chrome.driver", "C:\\BEST\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		String facebook = "https://www.facebook.com/";
		
		try{
			System.out.println(Request.Get(facebook).execute().returnResponse().getProtocolVersion());
		}catch(Exception e){
			System.out.println(e);
		}
	}
	@Test
	public void testFaceBook() throws InterruptedException{
		driver.get("https://www.facebook.com/");
		List<WebElement> lista = driver.findElements(By.xpath("//input[@type='text' and @class='inputtext _58mg _5dba _2ph-']"));
		for(WebElement el:lista){
			el.sendKeys("23214324324");
			
			Thread.sleep(3000);
		}
	}
	
	@AfterTest
	public void after(){
		driver.quit();
	}
}
