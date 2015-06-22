import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class demo {
	@Test
	public void demo(){
		System.out.println("aaaaaaaaaaa");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
	}

}
