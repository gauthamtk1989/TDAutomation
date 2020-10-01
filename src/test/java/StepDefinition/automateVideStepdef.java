package StepDefinition;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
public class automateVideStepdef {
public WebDriver driver;
@Given("^user login with (.+) and (.+)$")
public void userenterLoginDeatils(String username, String password) throws InterruptedException
{
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\91900\\Desktop\\Driver\\chromedriver_win32\\ChromeDriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://tethdesi.in");
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 driver.manage().window().maximize();
	 driver.findElement(By.xpath("//a[text()='Sign In']")).click();
	 driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys(username);
	 driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(password);
	 Thread.sleep(2000);
	 js.executeScript("window.scrollBy(0,1000)");
	 driver.findElement(By.xpath("//input[@name='btnSignIn']")).click();
}

@Given("^user login with user credentials$")
public void user_login_with_user_credentials() throws Throwable {
    System.out.println("In User Login");
}
@Then("^user watches two youtube video from daily link$")
public void user_watches_two_youtube_video_from_daily_link() throws InterruptedException
{
	driver.findElement(By.xpath("//*[@id='menu1']/li[4]/a")).click();
	 driver.findElement(By.xpath("//a[@title='Daily Link']")).click();
	 if(driver.findElements(By.xpath("//input[@value='Skip']")).size()!=0)
	 {
		 driver.findElement(By.xpath("//input[@value='Skip']")).click();
	 }
	 Thread.sleep(3000);
	
		while(driver.findElements(By.xpath("//table[@class='grid-view']//a")).size()!= 0)
		 {
			 driver.findElement(By.xpath("//table[@class='grid-view']//a")).click();
			 Thread.sleep(3000);
				driver.switchTo().frame("player");
				 driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button']")).click();
				Thread.sleep(100000);
				driver.switchTo().defaultContent();
				//*[@id="cphContent_lblStopSpam"]
				String s=driver.findElement(By.xpath("//span[@id='cphContent_lblStopSpam']")).getText();
				String[] arrs=s.split("\\+");
				int sum=Integer.parseInt(arrs[0].trim())+Integer.parseInt(arrs[1].trim());
				 System.out.println(sum);
				driver.findElement(By.xpath("//input[@id='cphContent_txtStopSpam']")).sendKeys(Integer.toString(sum));
				 driver.findElement(By.xpath("//input[@value='Submit']")).click();
				 Thread.sleep(3000);	 
		 }
	
		driver.quit();
}
@Then("^user watches two youtube video from bonus link$")
public void user_watches_two_youtube_video_from_bonus_link() throws InterruptedException
{
	driver.findElement(By.xpath("//*[@id='menu1']/li[4]/a")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//a[@title='Booster Link']")).click();
	 
		 while(driver.findElements(By.xpath("//table[@class='grid-view']//a")).size()!= 0)
		 {
			 driver.findElement(By.xpath("//table[@class='grid-view']//a")).click();
				driver.switchTo().frame("player");
				 driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button']")).click();
				Thread.sleep(100000);
				driver.switchTo().defaultContent();
				//*[@id="cphContent_lblStopSpam"]
				String s=driver.findElement(By.xpath("//span[@id='cphContent_lblStopSpam']")).getText();
				String[] arrs=s.split("\\+");
				int sum=Integer.parseInt(arrs[0].trim())+Integer.parseInt(arrs[1].trim());
				 System.out.println(sum);
				driver.findElement(By.xpath("//input[@id='cphContent_txtStopSpam']")).sendKeys(Integer.toString(sum));
				 driver.findElement(By.xpath("//input[@value='Submit']")).click();
					 
		 }
	 
	driver.quit();
}
}
