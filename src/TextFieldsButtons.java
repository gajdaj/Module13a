import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TextFieldsButtons {
	
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		String browser = "Chrom";
		if(browser.equals("Chrom")){
			driver.quit();
			System.setProperty("webdriver.chrome.driver","C:\\BEST\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.get("https://www.golfclubs.com/");
		List<WebElement> lista = driver.findElements(By.tagName("a"));
		for(WebElement el:lista){
			System.out.println(el.getAttribute("href"));
		}
		WebElement query = driver.findElement(By.xpath("//*[@id=\"navbar-slide\"]/div[2]/div/form[1]/div/input"));
		WebElement button = driver.findElement(By.xpath("//*[@id=\"navbar-slide\"]/div[2]/div/form[1]/div/span/button"));
		query.sendKeys("Fjklhjh");
		System.out.println(query.getAttribute("value"));
		query.click();
		button.click();
		driver.quit();
	}
	

}
