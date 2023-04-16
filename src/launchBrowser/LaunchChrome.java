package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	public static void main(String[] args) throws InterruptedException {
		// for the path that we used bellow we can write like this: ".\\driver\\chromedriver.exe" or "driver/chromedriver.exe" all of this three will work but this two can work for any one cause its not a local path.
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\R&P CM\\Selenium\\1st_Selenuim\\driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();              //to launch my browser i need to create an object
													//Question:we all know when we create an object, the classes matches like "Scanner" scn = new "Scanner"(System.in()
													// why this object we have WebDriver but in other side ChromeDriver? which concept of java we have used?
													// the answer is POLYMORPHISM...Polymorphism occurs when there is inheritance exist. this type of the object creation is the concept polymorphism 	

		//now to open google.com we are using get(string url) option as follow with the help of driver
//		driver.get("https://www.google.com/");// now by running this we can see that google.com in Chrome browser will appear/ BUT if we want to open google in a full page we can code like this
//		driver.manage().window().maximize(); 
//		driver.findElement(By.name("q")).sendKeys("selenuim");
//		driver.findElement(By.name("btnK")).click();
//		driver.findElement(By.name("ZUkOIc"));
		
		//clear cashe..........
		driver.manage().deleteAllCookies();
		//go to website.............
		driver.get("https://www.techfios.com/billing/?ng=admin/");
		//max..............
		driver.manage().window().maximize();
		//cookies are temporary memory which saves within the browser, it helps to load the page quicker. it saves the information once we go the new website and it helps next time when we try to go to that website it speeds up the  process.
		// so we are going delete all the cookies before going to a website
		
		//provide the user name, password and login............
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		//add a delay on closing the website.................
		Thread.sleep(3000);
		driver.close();
		//driver.quit(); both of them will work but we will discuss about the difference later .............
		
		
		//Thread.sleep(3000);
		//driver.close();  // this method will close the window automatically but very fast. if we want to close the window a little by delay, we are using Thread.sleep() before this method.
}
}

//some times they ask you question in interview, what can you name some exceptions? 
//so illegal State exception 