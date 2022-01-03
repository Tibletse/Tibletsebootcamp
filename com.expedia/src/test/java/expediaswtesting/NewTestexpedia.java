package expediaswtesting;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTestexpedia {
 static WebDriver driver;

@BeforeTest
public void beforeTest() throws InterruptedException {
	
			System.setProperty("webdriver.chrome.driver","C:\\Users\\kifli\\eclipse-workspace\\practiceng\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://expedia.com"); 
			driver.manage().window().maximize();       //website
			Thread.sleep(1000);  
}
@Test (priority=1)
public void Test1() throws InterruptedException {
	WebElement Flighttab=driver.findElement(By.xpath("//*[@id=\"wizardMainRegionV2\"]/div/div/div/div/ul/li[2]/a/span"));
	Flighttab.click();
	
				  System.out.println("this is test 1");
				  Thread.sleep(1000);
			  }
			  @Test (priority=2)
			  public void Test2() throws InterruptedException {
				  WebElement leaving=driver.findElement(By.xpath("(//*[@class='uitk-fake-input uitk-form-field-trigger'])[1]"));
				  leaving.click();
				  System.out.println("this is test 2");
				  Thread.sleep(1000);
			  }
			  
			  @Test (priority=3)
			  public void Test3() throws InterruptedException {
				  WebElement leavingfrom=driver.findElement(By.xpath("(//*[@class='uitk-field-input uitk-typeahead-input'])[1]"));
				  leavingfrom.sendKeys("Washington (IAD - Washington Dulles Intl.)");
				  Thread.sleep(1000);
				  Actions ob=new Actions(driver);
				  ob.sendKeys(leavingfrom,Keys.ENTER).perform();
				  Thread.sleep(1000);
			  }
			    
			  @Test (priority=4)
			  public void Test4() throws InterruptedException {
				  WebElement goingto=driver.findElement(By.xpath("(//*[@class='uitk-fake-input uitk-form-field-trigger'])[2]"));
				  goingto.click();
				  Thread.sleep(1000);
				   }
			  
			  @Test (priority=5)
			 public void Test5() throws InterruptedException {
				  WebElement goingto=driver.findElement(By.xpath("//*[@id='location-field-leg1-destination']"));
				  goingto.sendKeys("Los Angeles (LAX - Los Angeles Intl.)");
				  Thread.sleep(1000);
				  Actions ob=new Actions(driver);
				  ob.sendKeys(goingto,Keys.ENTER).perform();
				  Thread.sleep(1000);
					  }
			  @Test (priority=6)
			  public void Test6() throws InterruptedException {
				  WebElement departing=driver.findElement(By.xpath("(//*[@class='uitk-faux-input uitk-form-field-trigger'])[1]"));
				  departing.click();
				  Thread.sleep(1000);}

			  @Test (priority=7)
			  public void Test7( ) throws InterruptedException {
				  WebElement date2=driver.findElement(By.xpath(" (//*[@class='uitk-date-picker-day uitk-new-date-picker-day'])[24]"));
				  date2.click();
				  Thread.sleep(1000); }
			  
			  @Test (priority=8)
			  public void Test8( ) throws InterruptedException {
				  WebElement done=driver.findElement(By.xpath("//*[@class='uitk-button uitk-button-medium uitk-button-has-text uitk-button-primary uitk-flex-item uitk-flex-shrink-0 dialog-done']"));
				  done.click();
				  Thread.sleep(1000); }
			 
			  @Test (priority=9)
			  public void Test9() throws InterruptedException {
				  WebElement returning=driver.findElement(By.xpath("(//*[@class='uitk-faux-input uitk-form-field-trigger'])[2]"));
				  returning.click();
				  Thread.sleep(1000); }
			  
			  @Test (priority=10)
			  public void Test10() throws InterruptedException {
				  WebElement returndate=driver.findElement(By.xpath("(//*[@class='uitk-date-picker-day uitk-new-date-picker-day'])[30]"));
				  returndate.click();
				  Thread.sleep(1000); }
			  
			  @Test (priority=11)
			  public void Test11( ) throws InterruptedException {
				  WebElement done2=driver.findElement(By.xpath("//*[@class='uitk-button uitk-button-medium uitk-button-has-text uitk-button-primary uitk-flex-item uitk-flex-shrink-0 dialog-done']"));
				  done2.click();
				  Thread.sleep(1000); }
			  
			  @Test (priority=12)
			  public void Test12( ) throws InterruptedException {
				  WebElement submit=driver.findElement(By.xpath("(//*[@class='uitk-button uitk-button-large uitk-button-fullWidth uitk-button-has-text uitk-button-primary'])[1]"));
				  submit.click();
				  Thread.sleep(3000); }
			 //Verify manually the puzzle
			  @Test (priority=13)
			  public void Test13() throws InterruptedException {
				  WebDriverWait ob = new WebDriverWait(driver, 50); 
				  ob.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='uitk-card-link'])[1]")));
				  Thread.sleep(5000);
				  WebElement flight1= driver.findElement(By.xpath("(//*[@class='uitk-card-link'])[1]"));
				  flight1.click();
				  Thread.sleep(1000);}
				 
				  
				  @Test (priority=14)
				  public void Test14() throws InterruptedException {
					  WebElement select1=driver.findElement(By.xpath("//*[text()='Select']"));
					  select1.click();
					  Thread.sleep(10000);
					  
				  }
				  @Test (priority=15)
				  public void Test15() throws InterruptedException {
					  WebElement departflight = driver.findElement(By.xpath("(//*[@class='uitk-card-link'])[2]"));
					  departflight.click();
					  Thread.sleep(3000);
					  }
				  
				  
				  
				  @Test (priority=16)
				  public void Test16() throws InterruptedException {
					  WebElement sel=driver.findElement(By.xpath("//*[text()='Select']"));
					  sel.click();
					  Thread.sleep(10000);}
				  @Test (priority=17)
				  public void Test17() throws InterruptedException {
					  WebElement returnflight=driver.findElement(By.xpath("(//*[@class='uitk-card-link'])[3]"));
					  returnflight.click();
					  Thread.sleep(10000);}
				  
				  @Test (priority=18)
				  public void Test18() throws InterruptedException {
					  WebElement selectre=driver.findElement(By.xpath("//*[text()='Select']"));
					  selectre.click();
					  Thread.sleep(10000);}
				  @Test (priority=19)
				  public void Test19() throws InterruptedException {
					  WebElement  nothanks=driver.findElement(By.xpath("//*[text()='No thanks']"));
					  nothanks.click();
					  Thread.sleep(10000);
				  }
				  
				  @Test (priority=20)
				  public void Test20() throws InterruptedException {
					  Set<String> winsession= driver.getWindowHandles();
					  Iterator<String> itr= winsession.iterator(); 
					  String win1= itr.next();
					  String win2= itr.next();
					  System.out.println("session id  of 1st window=" +win1);
					  System.out.println("session id  of 2nd window="+win2);
					  driver.switchTo().window(win2);
					  WebElement checkout=driver.findElement(By.xpath("//*[text()='Check out']"));
					  checkout.click();
					  Thread.sleep(1000);
					  
					 	  }	  
					  
				  @Test (priority=21)
				  public void Test21() throws InterruptedException {
					  WebElement firstname=driver.findElement(By.xpath("//*[@id='firstname[0]']"));
					  firstname.sendKeys("Tibletse");
					  Thread.sleep(3000);
				  }
				  
				  @Test (priority=22)
				  public void Test22() throws InterruptedException {
					  WebElement middlename=driver.findElement(By.xpath("(//*[@class='text cko-field always-include gb-whitelist'])[1]"));
					 middlename.sendKeys("Fre");
					  Thread.sleep(3000);}
				  
				  @Test (priority=23)
				  public void Test23() throws InterruptedException {
					  WebElement lastname=driver.findElement(By.xpath("//*[@id='lastname[0]']"));
					 lastname.sendKeys("Gebre");
					  Thread.sleep(3000);}
				  
				 @Test (priority=24)
				  public void Test24() throws InterruptedException {
					  WebElement country=driver.findElement(By.xpath("//*[@class='cko-field always-include gb-whitelist alpha3CountryCode']"));
					 country.sendKeys("United States of America +1");
					 
				  Actions ob=new Actions(driver);
				  ob.sendKeys(country,Keys.ENTER).perform();
				  Thread.sleep(3000);} 
				 
				  
				  
				  @Test (priority=25)
				  public void Test25() throws InterruptedException {
					  WebElement phonenumber=driver.findElement(By.xpath("//*[@id='phone-number[0]']"));
					 phonenumber.sendKeys("57198878");
					  Thread.sleep(3000);}
				  
				 
				  @Test (priority=26)
				  	  public void Test26() throws InterruptedException {
					  WebElement password=driver.findElement(By.xpath("//*[@id='passport[0]']"));
					 password.sendKeys("mybootcamp");
					 
				  Actions ob=new Actions(driver);
				  ob.sendKeys(password,Keys.ENTER).perform();
				  Thread.sleep(3000);} 
				 
				  
				  
				  
				  @Test (priority=27)
				  public void Test27() throws InterruptedException {
					  WebElement gender=driver.findElement(By.xpath("//*[@id='gender_female[0]']"));
					 gender.click();
					  Thread.sleep(3000);}
				  
				  @Test (priority=28)
				  public void Test28() throws InterruptedException {
					  WebElement month=driver.findElement(By.xpath("//*[@id='date_of_birth_month0']"));
					 month.sendKeys("12-dec");
					 
				  Actions ob=new Actions(driver);
				  ob.sendKeys(month,Keys.ENTER).perform();
				  Thread.sleep(3000);}
				  
				  @Test (priority=29)
				  public void Test29() throws InterruptedException {
					  WebElement day=driver.findElement(By.xpath("//*[@id='date_of_birth_day[0]']"));
					 day.sendKeys("25");
					 
				  Actions ob=new Actions(driver);
				  ob.sendKeys(day,Keys.ENTER).perform();
				  Thread.sleep(3000);}
				  
				  @Test (priority=30)
				  public void Test30() throws InterruptedException {
					  WebElement year=driver.findElement(By.xpath("//*[@id='date_of_birth_year[0]']"));
					 year.sendKeys("1990");
					 
				  Actions ob=new Actions(driver);
				  ob.sendKeys(year,Keys.ENTER).perform();
				  Thread.sleep(3000);}
			  
				 	
			  @AfterTest
			  public void afterTest() throws InterruptedException {
				  driver.close();
				  Thread.sleep(3000);
				  
			  }

  

}
