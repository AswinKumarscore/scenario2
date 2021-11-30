package sample1;
import java.util.Iterator;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Amazon {
	
	WebDriver driver;
	String url1 = "https://www.flipkart.com/";
	String url2 = "https://www.amazon.in/";
	//https://www.amazon.in/
	@Before
	public void setUp() {
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
	                System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
            driver = new ChromeDriver();
		
		//Open the AUT
		            driver.get(url1);
		           // Thread.sleep(5000);
		            System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		            driver = new ChromeDriver();
				
		            driver.get(url2);

	}
	@Test
	
	public void test() throws InterruptedException {
		//Fetch the page title
		String pageTitle = driver.getTitle();
		System.out.println("Page title: " + pageTitle);
		Thread.sleep(5000);


		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[contains(@class,'_3704LK')]")).sendKeys("vu tv");
		Thread.sleep(3000);
		//clicking button
		driver.findElement(By.xpath("//button[contains(@class,'L0Z3Pu')]")).click();
		Thread.sleep(3000);


		driver.findElement(By.xpath("//div[contains(text(),'Vu Premium 108 cm (43 inch) Ultra HD (4K) LED Smart Android TV')]")).click();
		Thread.sleep(3000);
		String price=driver.findElement(By.xpath("//div[contains(text(),'₹26,999')]")).getText();
		System.out.println("price of vu tv is "+price);
		Thread.sleep(2000);

		Thread.sleep(8000);
		 
		driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2U9uOA _3v1-ww')]")).click();

		//driver.findElement(By.xpath("//button[contains(text(),'+')]")).click();

		String flipkartprice=driver.findElement(By.xpath("//span[contains(text(),'₹26,999')]")).getText();
		System.out.println("total price of two vu tv is "+flipkartprice);




		
		         
	}
	
	public void test1() throws InterruptedException {
		
		String pageTitle = driver.getTitle();
		System.out.println("Page title: " + pageTitle);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("vu tv");
		driver.findElement(By.id("nav-search-submit-button")).click();
		System.out.println("search button is clicked");
		Thread.sleep(5000);
		//input[contains(@id,'add-to-cart-button')]                   
		driver.findElement(By.xpath("//span[contains(text(),'Vu 108 cm (43 inches) Full HD UltraAndroid LED TV 43GA (Black) (2019 Model)')]")).click();
		Thread.sleep(5000);
		  Set<String> ids = driver.getWindowHandles();
	        Iterator<String> it = ids.iterator();
	        String parentId = it.next();
	        String childId = it.next();
	        driver.switchTo().window(childId);
	        driver.findElement(By.id("add-to-cart-button")).click();
	        System.out.println("new code working");
	    	String amazonprice=driver.findElement(By.xpath("//span[contains(text(),'₹26,990.00')]")).getText();
	    	System.out.println("Amazon price ="+amazonprice);
	    	int cheap=0;
	    	System.out.println("the cheapest price is "+cheap);
	    	int ap=Integer.parseInt(amazonprice);  
	    	String flipkartprice=null;
	    	int fp=Integer.parseInt(flipkartprice);  
	    	 cheap=Math.min(ap, fp);
	    	
			//System.out.println(Math.min(ap, fp));
	    	 if(cheap==ap)
	    	 {
	    		System.out.println("Amazon site is cheaper"); 
	    	 }
	    	 else
	    	 {
	    		System.out.println("flipkart is cheaper");
	    	 }

			

		
	}
}
	

