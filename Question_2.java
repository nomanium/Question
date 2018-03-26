package com.question;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;


public class Question_2 {

	static String homepageTitle="Weight Loss Program, Recipes & Help | Weight Watchers";
	static String meetingPageTitle="Get Schedules & Times Near You";
	
	
	public static void main(String[] args) throws InterruptedException {
		By searchBox=By.xpath(".//*[@id='meetingSearch']");
		By findAMeeting=By.id("ela-menu-visitor-desktop-supplementa_find-a-meeting");
		
		FirefoxProfile profile=new FirefoxProfile();
		profile.setAcceptUntrustedCertificates(false);
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		WebDriver driver=new FirefoxDriver(profile);
		driver.get("https://www.weightwatchers.com/us/");
		String title1=driver.getTitle();
		System.out.println("Homepage Title: "+title1);
		if(title1.equalsIgnoreCase(homepageTitle)){
			System.out.println("Homepage title Matched");
		}else System.out.println("Title did not match");
	
		driver.findElement(findAMeeting).click();
	
		String title2=driver.getTitle();
		System.out.println("Meeting page title: "+title2);
		if(title2.contains(meetingPageTitle)){
			System.out.println("Title contains: "+meetingPageTitle);
		}else System.out.println("Title did not match");
		driver.findElement(searchBox).sendKeys("10011");
		driver.findElement(By.className("input-group-btn")).click();
		String locationName=driver.findElement(By.className("location__name")).getText();
		String locationDistance=driver.findElement(By.className("location__distance")).getText();
		System.out.println("Title of the first result: "+locationName+"/n Distance: "+locationDistance);
		driver.close();
		
	}

}
