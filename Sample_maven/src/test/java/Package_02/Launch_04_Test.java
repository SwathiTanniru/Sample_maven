package Package_02;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Launch_04_Test {
@Test
public void launch() throws InterruptedException
{
	//String url=System.getProperty("url");
	ChromeDriver driver=new ChromeDriver();
	//driver.get(url);
	driver.get("https://www.liverpoolfc.com/");
	Reporter.log("package2,script-04",true);
	Thread.sleep(2000);
	driver.quit();
}
}
