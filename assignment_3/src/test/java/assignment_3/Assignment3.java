package assignment_3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {
	public ChromeDriver driver = new ChromeDriver();
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        Assignment3 obj = new Assignment3();
        obj.getUrl();
        obj.getLinks();
        

    }

    public void getUrl() {
       
    	
        driver.get("https://flipkart.com");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("The total number of links are: "+links.size());

    }
    public void getLinks() {
        
        
        List<WebElement> links = driver.findElements(By.tagName("a"));
        
        
        for (WebElement link : links) {
            System.out.println(link.getText());
        }
        
    }

}
