package Package_01;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Launch_02_Test {
@Test
public void launch() throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	Reporter.log("package1,script-02",true);
	Thread.sleep(2000);
	driver.quit();
}
}
