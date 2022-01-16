package assignment6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment6 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://flipkart.com");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("sundaramshuttle@gmail.com");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("massmebutu");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		try {
		WebElement checkSuccess = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div"));
		if(checkSuccess.getText().equals("Sundaram")) {
			System.out.println("Login Success");
		
		}

		else
			System.out.println("Login Unsuccessful");
		}
		catch(NoSuchElementException e) {
			System.out.println("Login Unsuccessful");
		}

			
		
	}

}
