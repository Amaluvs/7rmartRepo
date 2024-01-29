package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtilities 
{
	public void scrollBy(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	}
	public void javaSriptClick(WebDriver driver,WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",element);
	}
	public void clickAndHoldOnElement(WebElement element, WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.clickAndHold(element).build().perform();
	}
	
	public void selectByIndex(WebElement element,int index) {
		Select select =new Select(element);
		select.selectByIndex(index);
		
	}
	
	public void selectByValue(WebElement element,String value) {
		Select select =new Select(element);
		select.selectByValue(value);
		
	}
	
	public void selectByVisibleText(WebElement element,String visibleText) {
		Select select =new Select(element);
		select.selectByVisibleText(visibleText);;
		
	}
	public void selectDropDownByIndexValue(WebElement element ,int value){
		Select select = new Select(element);
		select.selectByIndex(value);	
	}
	public void selectDropdownbyText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	public void acceptAlert(WebDriver driver) {
		//String alerttext=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();

	}
	
	public void cancelAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();//cancel

	}
	
	public void giveInpurAndConfirmAlert(WebDriver driver,String input) {
		driver.switchTo().alert().sendKeys(input);//to give input
		driver.switchTo().alert().accept();
	}
	
	

}
