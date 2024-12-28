package org.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver d;
	public static void chromeBrowserLaunch() {
		d = new ChromeDriver();
	}
	
	public static void implicitlyWait(long sec) {
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}
	
	public static void quit() {
		d.quit();
	}

}
