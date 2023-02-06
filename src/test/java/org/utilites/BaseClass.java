package org.utilites;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Alert alert;
	public static TakesScreenshot ts;
	public static JavascriptExecutor js;
	public static Select s;

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void url(String url) {
		driver.get(url);
	}

	public static void toMaximize() {
		driver.manage().window().maximize();
	}

	public static void toGetTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void toGetCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public static void toSendKeys(WebElement element, String usertext) {
		element.sendKeys(usertext);
	}

	public static void toClick(WebElement element) {
		element.click();
	}

	public static void toClose() {
		driver.close();
	}

	public static void toQuit() {
		driver.quit();
	}

	public static void toGetText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}

	public static void toGetAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
	}

	public static void performMoveToElement(WebElement element) {
		a = new Actions(driver);
		a.moveToElement(element).perform();
	}

	public static void performDragAndDrop(WebElement src, WebElement dest) {
		a.dragAndDrop(src, dest).perform();
	}

	public static void performDoubleClick(WebElement element) {
		a.doubleClick(element).perform();
	}

	public static void performContextClick(WebElement element) {
		a.contextClick(element).perform();
	}

	public static void toPerformEnter() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void toPerformShift() {
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_SHIFT);
	}

	public static void toPerformControl() {
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_CONTROL);
	}

	public static void toPerformCapsLock() {
		r.keyPress(KeyEvent.VK_CAPS_LOCK);
		r.keyRelease(KeyEvent.VK_CAPS_LOCK);
	}

	public static void toPerformTab() {
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}

	public static void toPerformEscape() {
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
	}

	public static void toPerformSpace() {
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_SPACE);
	}

	public static void toPerformBackspace() {
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);
	}

	public static void toPerformUpArrow() {
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
	}

	public static void toPerformDownArrow() {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	public static void toPerformLeftArrow() {
		r.keyPress(KeyEvent.VK_LEFT);
		r.keyRelease(KeyEvent.VK_LEFT);
	}

	public static void toPerformRightArrow() {
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
	}

	public static void toPerformInsert() {
		r.keyPress(KeyEvent.VK_INSERT);
		r.keyRelease(KeyEvent.VK_INSERT);
	}

	public static void toPerformDelete() {
		r.keyPress(KeyEvent.VK_DELETE);
		r.keyRelease(KeyEvent.VK_DELETE);
	}

	public static void toPerformHome() {
		r.keyPress(KeyEvent.VK_HOME);
		r.keyRelease(KeyEvent.VK_HOME);
	}

	public static void toPerformEnd() {
		r.keyPress(KeyEvent.VK_END);
		r.keyRelease(KeyEvent.VK_END);
	}

	public static void toPerformPageUp() {
		r.keyPress(KeyEvent.VK_PAGE_UP);
		r.keyRelease(KeyEvent.VK_PAGE_UP);
	}

	public static void toPerformPageDown() {
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}

	public static void toPerformWindows() {
		r.keyPress(KeyEvent.VK_WINDOWS);
		r.keyRelease(KeyEvent.VK_WINDOWS);
	}

	public static void alertSwitch() {
		alert = driver.switchTo().alert();
	}

	public static void alertAccept() {
		alert.accept();
	}

	public static void alertDismiss() {
		alert.dismiss();
	}

	public static void alertSendKeys(String text) {
		alert.sendKeys(text);
	}

	public static void alertGetText() {
		alert.getText();
	}

	public static void frameSwitch(WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void toTakeScreenshot() {
		ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
	}

	public static void javaScript(String jscode, WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript(jscode, element);
	}

	public static void printParentId() {
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
	}

	public static void printAllWindowId() {
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
	}

	public static void switchToWindow(int index) {
		Set<String> allWindows = driver.getWindowHandles();
		List<String> list = new ArrayList<String>();
		list.addAll(allWindows);
		driver.switchTo().window(list.get(index));
	}

	public static void printParticularWindowId(int index) {
		Set<String> allWindows = driver.getWindowHandles();
		List<String> list = new ArrayList<String>();
		list.addAll(allWindows);
		System.out.println(list.get(index));
	}

	public static void ddSelectByIndex(WebElement element, int index) {
		s = new Select(element);
		s.selectByIndex(index);
	}

	public static void ddSelectByValue(WebElement element, String text) {
		s = new Select(element);
		s.selectByValue(text);
	}

	public static void ddSelectByVisibleText(WebElement element, String text) {
		s = new Select(element);
		s.selectByVisibleText(text);
	}

	public static void ddToCheckIsMultiple(WebElement element) {
		s = new Select(element);
		if (s.isMultiple()) {
			System.out.println("Multiple Options Can Be Selected");
		}
	}

	public static void ddPrintAllOptions(WebElement element) {
		s = new Select(element);
		System.out.println(s.getOptions());
	}

	public static void ddPrintAllSelectedOptions(WebElement element) {
		s = new Select(element);
		System.out.println(s.getAllSelectedOptions());
	}

	public static void ddPrintFirstSelectedOption(WebElement element) {
		s = new Select(element);
		System.out.println(s.getFirstSelectedOption());
	}

	public static void ddDeselectByIndex(WebElement element, int index) {
		s = new Select(element);
		s.deselectByIndex(index);
	}

	public static void ddDeselectByValue(WebElement element, String text) {
		s = new Select(element);
		s.deselectByValue(text);
	}

	public static void ddDeselectByVisibleText(WebElement element, String text) {
		s = new Select(element);
		s.deselectByVisibleText(text);
	}

	public static void ddDeselectAll(WebElement element) {
		s = new Select(element);
		s.deselectAll();
	}

	public static void ucWaits() throws InterruptedException {
		Thread.sleep(5000);
	}


}


	


