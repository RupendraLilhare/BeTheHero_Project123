package betheHeroProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basePackage.BaseClass2;

public class BeTheHero_tc_6 extends BaseClass2{

	@Test
	public void testCase6() throws InterruptedException
	{
		WebElement logIn=driver.findElement(By.xpath("//android.widget.EditText[@text='Login id']"));
		logIn.sendKeys("7e749f79");
		
		WebElement singIn=driver.findElement(By.xpath("//android.widget.TextView[@text='SIGN IN']"));
		singIn.click();
		WebElement account=driver.findElement(By.xpath("//android.widget.TextView[@text='Account']"));   
		account.click();
		
		WebElement edit=driver.findElement(By.xpath("//android.widget.TextView[@text='EDIT']"));   
		edit.click();
	
		WebElement name=driver.findElement(By.className("android.widget.EditText[test='Rupendra']"));
		name.clear();
		name.sendKeys("Rupendra Lilhare");
		WebElement emailID=driver.findElement(By.xpath("//android.widget.EditText[@text='rupendra1305@gmail.com]"));
		emailID.clear();
		emailID.sendKeys("lilhare1305@gmail.com");
		
		WebElement mobileNo=driver.findElement(By.xpath("//android.widget.EditText[@text='8806163399']"));
		 mobileNo.clear();
		 mobileNo.sendKeys("8806164399");
		
		WebElement city=driver.findElement(By.xpath("//android.widget.EditText[@text='Nagpur']"));
		city.clear();
		city.sendKeys("Gondia");
		
		WebElement stateCode=driver.findElement(By.xpath("//android.widget.EditText[@text='44']"));
		stateCode.clear();
		 stateCode.sendKeys("55");
		
		WebElement update=driver.findElement(By.xpath("//android.widget.TextView[@text='UPDATE']"));   
		update.click();
	}
}