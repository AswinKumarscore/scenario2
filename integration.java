package projectfinal;

import java.util.Iterator;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class integration {
	
	WebDriver 
	driver;
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
		Thread.sleep(2000);


		driver.findElement(By.xpath("//div[contains(text(),'Vu Premium 108 cm (43 inch) Ultra HD (4K) LED Smart Android TV')]")).click();
		Thread.sleep(2000);
		String price=driver.findElement(By.xpath("//div[contains(text(),'₹26,999')]")).getText();
		System.out.println("price of vu tv is "+price);
		Thread.sleep(2000);
		driver.manage().window().maximize();

		
		    Set<String> ids = driver.getWindowHandles();
	        Iterator<String> it = ids.iterator();
	        String parentId = it.next();
	        String childId = it.next();
	        driver.switchTo().window(childId);
	        
	        System.out.println("below windows child");
	        
	        Thread.sleep(5000);
	        WebElement cart=driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2U9uOA _3v1-ww')]"));
	        
	        cart.click();
	       
	        System.out.println("element is findable");
	        

		 
		
	        Set<String> idss = driver.getWindowHandles();
	        Iterator<String> itt = idss.iterator();
	        String parentIdd = itt.next();
	        String childIdd = itt.next();
	        driver.switchTo().window(childIdd);
	        Thread.sleep(5000);
	        WebElement cartplus1=driver.findElement(By.xpath("//button[contains(@class,'_23FHuj')]"));
	     
	        cartplus1.click();
		
		
		String totalprice=driver.findElement(By.xpath("//span[contains(text(),'₹53,998')]")).getText();
		System.out.println("total price of two vu tv is "+totalprice);



	//	String flipkartprice=driver.findElement(By.xpath("//span[contains(text(),'₹26,999')]")).getText();
	//	System.out.println("total price of two vu tv is "+flipkartprice);
		
		driver.get("https://www.amazon.in/");
		
		String pageTitle1 = driver.getTitle();
		System.out.println("Page title: " + pageTitle1);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("vu tv");
		driver.findElement(By.id("nav-search-submit-button")).click();
		System.out.println("search button is clicked");
		Thread.sleep(5000);
		//input[contains(@id,'add-to-cart-button')]                   
		driver.findElement(By.xpath("//span[contains(text(),'Vu 108 cm (43 inches) Full HD UltraAndroid LED TV 43GA (Black) (2019 Model)')]")).click();
		Thread.sleep(5000);
		  Set<String> idsam = driver.getWindowHandles();
	        Iterator<String> itam = idsam.iterator();
	        String parentIdam = itam.next();
	        String childIdam = itam.next();
	        driver.switchTo().window(childIdam);
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
	