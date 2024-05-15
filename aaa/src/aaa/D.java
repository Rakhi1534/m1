package aaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\RAKHI\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
      driver.get("http://www.amazon.in");

}
}
