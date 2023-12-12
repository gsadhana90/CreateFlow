package com.testcases;
import java.awt.AWTException;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import com.pageobjects.Flow;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FlowTest {

	@Test
	public void flowTest() throws InterruptedException {

		WebDriver driver;

		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();

		options.addArguments("--disable-notifications");
		
		options.setExperimentalOption("useAutomationExtension", false);
		
		options.setExperimentalOption("prefs", Collections.singletonMap("credentials_enable_service", false));
		
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		
		driver = new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://qa.agenciflow.com/#/");

		Flow  f = new Flow(driver);

		f.setEmailid("sadhanag@mailinator.com");

		f.setPassword("Sadhana90#");

		f.setSubmit();

		f.setFlowsClose();

		f.setFlow();

		f.setCreateNewFlow();

		f.setCatchyTittle("third session");

		try {
			f.setImage("fooddrinks");
		}

		catch (InterruptedException | AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		f.setBrief();
					
		f.setDueDate();

		f.setFlowtag();

		f.setAddAdminMembers();

		f.setAddTeamMembers();

		f.setAddNew("karthik@mailinator.com");

		f.getparagraph();

		f.setCreate();

		f.setFlowBack();

		f.setSortBY("userorderdesc");

		f.setLayout("app");

		f.setNumberOfFlows();
		
		f.setClickFlow();

	}


}
