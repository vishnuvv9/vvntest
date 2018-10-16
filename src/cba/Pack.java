package cba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pack {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
     WebDriver d;
     System.setProperty("webdriver.chrome.driver", "C:\\vishnu\\Lib\\chromedriver_win32\\chromedriver.exe");
     d=new ChromeDriver();
     d.manage().window().maximize();
     d.get("https://www.google.com/");
     d.findElement(By.xpath("//a[@class='gb_P'][contains(.,'Gmail')]")).click();
     Thread.sleep(5000);
     d.close();
	}

}
