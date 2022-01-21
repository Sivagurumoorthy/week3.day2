package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio{
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--disable-notifications");
    ChromeDriver driver = new ChromeDriver(options);
	driver.get("https://www.ajio.com");
	driver.manage().window().maximize(); 
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);
	Thread.sleep(600);
	driver.findElement(By.xpath("//label[@for='Men']")).click();
	Thread.sleep(600);
	driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
	Thread.sleep(600);
String Items = driver.findElement(By.className("length")).getText();
	System.out.println(" No of items : " + Items);
    System.out.println("Total no");
	List<WebElement> bags = driver.findElements(By.className("brand"));
	System.out.println(" Size :" + bags.size());
for (WebElement webElement : bags) {
		String text = webElement.getText();
		System.out.println(text);
	}
	
}
}


