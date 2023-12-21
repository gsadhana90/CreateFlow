package com.pageobjects;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flow  {

	WebDriver driver;

	WebDriverWait wait;

	public Flow(WebDriver driver) {

		this.driver = driver;

		this.wait = new WebDriverWait(driver, 10);

		PageFactory.initElements(driver, this);

	}

	@FindBy(id="txt_email")

	private WebElement Emailid;

	@FindBy(id="txt_password")

	private WebElement Password;

	@FindBy(css = "button[type=submit]")

	private WebElement Submit;

	@FindBy(id = "password-manager-popup")

	private WebElement popup;

	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiIconButton-root slideshowClose']")

	private WebElement FlowsClose;

	@FindBy(xpath= "//span[normalize-space()='Flows']")

	private WebElement Flow;

	@FindBy(xpath= "//button[@type='button']//span[normalize-space()='Create New Flow']")

	private WebElement CreateNewFlow;

	@FindBy(xpath="//input[@id='job_title']")

	private WebElement CatchyTittle;

	@FindBy(xpath="//span[normalize-space()='Emoji']")

	private WebElement Emoji;

	@FindBy(xpath="//img[@class='emoji-img']")

	private List <WebElement> EmojiPicker;

	@FindBy(xpath="//button[@data-name='smileys_people']")

	private WebElement Smileys;

	@FindBy(xpath="//button[@data-name='animals_nature']")

	private WebElement Animals;

	@FindBy(xpath="//button[@data-name='food_drink']")

	private WebElement FoodDrinks;

	@FindBy(xpath="//button[@data-name='travel_places']")

	private WebElement Travels;

	@FindBy(xpath="//button[@data-name='activities']")

	private WebElement Activities;

	@FindBy(xpath="//button[@data-name='objects']")

	private WebElement Objects;

	@FindBy(xpath="//button[@data-name='symbols']")

	private WebElement Symbols;

	@FindBy(xpath="//button[@data-name='flags']")

	private WebElement Flags;

	@FindBy(xpath="//span[normalize-space()='Upload an Image']")

	private WebElement UploadImage;

	@FindBy(xpath="(//button[@class='MuiButtonBase-root MuiIconButton-root'])[5]")

	private WebElement button;

	@FindBy(xpath="//input[@name='favColor']")

	private WebElement Color;
	
        @FindBy(xpath="//div[@style='background: rgb(130, 154, 212);']")
	
	private WebElement colorPick;
	
	@FindBy(xpath="//div[@class='MuiGrid-root jss25694 false chosenColor avatarComp avatarDiv'")

	private WebElement ColorPick;

	@FindBy(xpath="//textarea[@name='job_description']")

	private WebElement Brief;

	@FindBy(xpath="//input[@placeholder='__/__/____']")

	private WebElement DueDate;

	@FindBy(xpath="//div[@class='MuiDialogActions-root MuiDialogActions-spacing']//span[normalize-space()='Cancel']")

	private WebElement canceldate;

	@FindBy(xpath="//input[@id='job_ongoing']")

	private WebElement OnGoing;

	@FindBy(xpath="//input[@id='ac-idautocomplete']")

	private WebElement AddTag;

	@FindBy(xpath="(//input[@type='checkbox'])[2]")

	private WebElement AddAdminMembers;

	@FindBy(xpath= "//input[@id='ac-idteam_users']")

	private WebElement AddTeamMembers;
	
	@FindBy(className = "MuiChip-label")
	
	private List <WebElement> Members;

	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiIconButton-root MuiAutocomplete-popupIndicator']")

	private List <WebElement> Button;

	@FindBy(xpath="(//*[name()='svg']//*)[53]")

	private WebElement DeletedUser;

	@FindBy(className = "MuiChip-label")

	private List <WebElement> TeamMembers;

	@FindBy(xpath="//span[normalize-space()='Test 123']")

	private WebElement Test123;

	@FindBy(xpath="//span[normalize-space()='elan v']")

	private WebElement Elan;

	@FindBy(xpath="//span[normalize-space()='nila v']")

	private WebElement Nila;

	@FindBy(xpath="//span[normalize-space()='pugazh V']")

	private WebElement Pugazh;

	@FindBy(xpath="//span[normalize-space()='Venkat R']")

	private WebElement Venkat;

	@FindBy(xpath="//span[normalize-space()='revenila s']")

	private WebElement Revenila;

	@FindBy(xpath="//span[normalize-space()='ragavan1 ']")

	private WebElement Ragavan;

	@FindBy(xpath="//span[normalize-space()='sadhanag90']")

	private WebElement Sadhanag90;

	@FindBy(xpath="//input[@placeholder='Enter email address']")

	private WebElement AddNew;

	@FindBy(xpath="//div[@class='boxContentEditable']")

	private WebElement Paragraph;

	@FindBy(xpath="//span[normalize-space()='Create']")

	private WebElement Create;

	@FindBy(xpath="//span[normalize-space()='Cancel']")

	private WebElement Cancel;

	@FindBy(xpath="//span[@class='ml-1' and normalize-space()='Flows']")

	private WebElement Flowback;

	@FindBy(xpath="//div[@id='demo-simple-select-outlined']")

	private WebElement SortBy;

	@FindBy(xpath="//li[normalize-space()='Sort By']")

	private WebElement SortBy1;

	@FindBy(xpath="//div[normalize-space()='Sort By']")

	private WebElement Latest;

	@FindBy(xpath="//div[normalize-space()='Sort By']")

	private WebElement Old;

	@FindBy(xpath="//div[normalize-space()='Sort By']")

	private WebElement UserOrderAsc;

	@FindBy(xpath="//div[normalize-space()='Sort By']")

	private WebElement UserOrderDesc;

	@FindBy(xpath="//span[normalize-space()='Layout']")

	private WebElement Layout;

	@FindBy(xpath="//li[normalize-space()='Large']")

	private WebElement Large;

	@FindBy(xpath="//li[normalize-space()='Medium']")

	private WebElement Medium;

	@FindBy(xpath="//li[normalize-space()='Small']")

	private WebElement Small;

	@FindBy(xpath="//li[normalize-space()='App']")

	private WebElement App;

	//@FindBy(xpath="//div[@class='MuiGrid-root pb-2 mt5 MuiGrid-container MuiGrid-spacing-xs-3']")

	@FindBy(tagName="a")

	private List <WebElement> NumberOfFlows;

	@FindBy(xpath="(//div[@class='MuiGrid-root false jss36497 projCardsMob MuiGrid-item MuiGrid-grid-xs-4 MuiGrid-grid-sm-2 MuiGrid-grid-md-2 MuiGrid-grid-lg-1'])[2]")

	private WebElement ClickFlow;



	public void setEmailid(String ename) {

		Emailid.sendKeys(ename);

	}

	public void setPassword(String pwd) {

		Password.sendKeys(pwd);	

	} 

	public void setSubmit() {

		Submit.click();	
	}

	public void setPopup() {

		popup.click();

	}

	public void setFlowsClose() {

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",FlowsClose);

		FlowsClose.click();
	}

	public void setFlow() {

		((JavascriptExecutor) driver).executeScript("arguments[0].click();",Flow);

	}

	public void setCreateNewFlow() {

		Actions a = new Actions(driver);

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",CreateNewFlow);

		a.moveToElement(CreateNewFlow).perform();

		((JavascriptExecutor) driver).executeScript("arguments[0].click();",CreateNewFlow);

	}

	public void setCatchyTittle(String catchy) { 

		try {
			wait.until(ExpectedConditions.visibilityOf(CatchyTittle));

			CatchyTittle.sendKeys(catchy);

		} catch (org.openqa.selenium.TimeoutException e) {

			System.out.println("Element not found within the specified timeout.");
		}

	}

	public void setImage(String name) throws InterruptedException, AWTException {

		Actions a = new Actions(driver);

		boolean emoji= true;

		if(emoji) {

			a.moveToElement(Emoji).perform();

			Emoji.click(); 

			if(name.equalsIgnoreCase("smileys")) {

				if(EmojiPicker.size()>=517) {

					WebElement Emojiget = EmojiPicker.get(354);

					((JavascriptExecutor) driver).executeScript("arguments[0].click();",Emojiget);
				}
			}

			if(name.equalsIgnoreCase("animals")) {

				if(EmojiPicker.size()>=658) {

					WebElement Emojiget = EmojiPicker.get(500);

					((JavascriptExecutor) driver).executeScript("arguments[0].click();",Emojiget);
				}
			}

			if(name.equalsIgnoreCase("fooddrinks")) {

				if(EmojiPicker.size()>=788) {

					WebElement Emojiget = EmojiPicker.get(786);

					((JavascriptExecutor) driver).executeScript("arguments[0].click();",Emojiget);

				}
			}

			if(name.equalsIgnoreCase("travels")) {

				if(EmojiPicker.size()>=1003) {

					WebElement Emojiget = EmojiPicker.get(998);

					((JavascriptExecutor) driver).executeScript("arguments[0].click();",Emojiget);

				}

			}
			if(name.equalsIgnoreCase("activities")) {

				if(EmojiPicker.size()>=1087) {

					WebElement Emojiget = EmojiPicker.get(1003);

					((JavascriptExecutor) driver).executeScript("arguments[0].click();",Emojiget);

				}
			}

			if(name.equalsIgnoreCase("objects")) {

				if(EmojiPicker.size()>=1337) {

					WebElement Emojiget = EmojiPicker.get(1335);

					((JavascriptExecutor) driver).executeScript("arguments[0].click();",Emojiget);

				}
			}

			if(name.equalsIgnoreCase("symbols")) {

				if(EmojiPicker.size()>=1554) {

					WebElement Emojiget = EmojiPicker.get(1534);

					((JavascriptExecutor) driver).executeScript("arguments[0].click();",Emojiget);

				}
			}

			if(name.equalsIgnoreCase("flags")) {

				if(EmojiPicker.size()>=1815) {

					WebElement Emojiget = EmojiPicker.get(1810);

					((JavascriptExecutor) driver).executeScript("arguments[0].click();",Emojiget);

				}

			}

		}
		boolean uploadimage= false;

		if(uploadimage) {

			UploadImage.click();

			StringSelection stringSelection = new StringSelection("C:\\Users\\Admin\\eclipse-workspace\\sadhana\\Flow\\pictures\\flower.jpg");

			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

			Robot robot = new Robot();

			robot.delay(1000); 

			robot.keyPress(KeyEvent.VK_CONTROL);

			robot.keyPress(KeyEvent.VK_V);

			robot.keyRelease(KeyEvent.VK_V);

			robot.keyRelease(KeyEvent.VK_CONTROL);

			robot.delay(500);

			robot.keyPress(KeyEvent.VK_ENTER);

			robot.keyRelease(KeyEvent.VK_ENTER);

			button.click();

		}

		boolean color= false; 

		if(color) {

			((JavascriptExecutor) driver).executeScript("arguments[0].click();",Color);

			String value = Color.getAttribute("value");

			//style="background: rgb(122, 34, 34);"

			System.out.println(value);
							
			String value1 = Color.getAttribute("value");

			System.out.println(value1);

		}

	}

	public void setBrief() {

		Brief.click();

		Brief.sendKeys("The third session for budget allocation for paud ads marketing");	
	}

	public void setDueDate() {

		boolean duedate =true;

		if(duedate) {

			Actions a = new Actions(driver);

			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",DueDate);

			((JavascriptExecutor) driver).executeScript("arguments[0].click();",DueDate);

			for(int i=0;i<5;i++) {

				a.sendKeys(DueDate,Keys.ARROW_RIGHT).build().perform();
				
				a.sendKeys(Keys.ENTER);
			}
			
		}

		boolean ongoing= false;

		if(ongoing) {

			OnGoing.click();
		}
	}

	public void setFlowtag() {

		Actions a = new Actions(driver);

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",AddTag);

		a.sendKeys(AddTag,Keys.ENTER).build().perform();

		a.sendKeys(AddTag,Keys.ARROW_DOWN,Keys.ENTER).build().perform();	

	}

	public void setAddAdminMembers() {

		boolean addadminmembers = true;

		if(addadminmembers) {

			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",AddAdminMembers);

			AddAdminMembers.click();
		}
	}

	public void setAddTeamMembers() {

		Actions a = new Actions(driver);

		AddTeamMembers.click();

		for(int i=1;i<10;i+=2) {

			a.click(AddTeamMembers).perform();
			
			a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

			System.out.println(AddTeamMembers);
		}
	
	}

	public void setAddNew( String newname) {

		AddNew.sendKeys(newname);
	}

	public void getparagraph() {

		String paragraph = Paragraph.getText();

		System.out.println(paragraph);
	}

	public void setCreate() {

		if(Create.isEnabled()) {

			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",Create);

			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

			jsExecutor.executeScript("arguments[0].click();",Create);

		}

		else
		{
			System.out.println("create is not enabled");
		}
	}

	public void  setFlowBack() {

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",Flowback);

		((JavascriptExecutor) driver).executeScript("arguments[0].click();",Flowback);

	}

	public void setSortBY(String name1) {

		Actions a = new Actions(driver);

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",SortBy);

		a.sendKeys(Keys.ENTER);

		if(name1.equalsIgnoreCase("latest")) {

			WebDriverWait wait = new WebDriverWait(driver, 10);

			wait.until(ExpectedConditions.elementToBeClickable(SortBy));

			SortBy.click();

			a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

		}

		if(name1.equalsIgnoreCase("old")) {

			WebDriverWait wait = new WebDriverWait(driver, 10);

			wait.until(ExpectedConditions.elementToBeClickable(SortBy));

			SortBy.click();

			for(int i=0;i<1;i++) {

				a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
			}

			a.sendKeys(Keys.ENTER).build().perform();
		}

		if(name1.equalsIgnoreCase("userorderasc")) {

			WebDriverWait wait = new WebDriverWait(driver, 10);

			wait.until(ExpectedConditions.elementToBeClickable(SortBy));

			SortBy.click();

			for(int i=0;i<2;i++) {

				a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
			}

			a.sendKeys(Keys.ENTER).build().perform();

		}

		if(name1.equalsIgnoreCase("userorderdesc")) {

			WebDriverWait wait = new WebDriverWait(driver, 10);

			wait.until(ExpectedConditions.elementToBeClickable(SortBy));

			((JavascriptExecutor) driver).executeScript("arguments[0].click();",SortBy);

			for(int i=0;i<3;i++) {

				a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
			}

			a.sendKeys(Keys.ENTER).build().perform();
		}

	}

	public void setLayout(String value) {

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",Layout);

		if(value.equalsIgnoreCase("large")) {

			((JavascriptExecutor) driver).executeScript("arguments[0].click();",Layout);

			((JavascriptExecutor) driver).executeScript("arguments[0].click();",Large);

			((JavascriptExecutor) driver).executeScript("arguments[0].click();",Layout);

		}

		if(value.equalsIgnoreCase("medium")) {

			((JavascriptExecutor) driver).executeScript("arguments[0].click();",Layout);

			((JavascriptExecutor) driver).executeScript("arguments[0].click();",Medium);

			((JavascriptExecutor) driver).executeScript("arguments[0].click();",Layout);

		}

		if(value.equalsIgnoreCase("small")) {			

			((JavascriptExecutor) driver).executeScript("arguments[0].click();",Layout);

			((JavascriptExecutor) driver).executeScript("arguments[0].click();",Small);

			((JavascriptExecutor) driver).executeScript("arguments[0].click();",Layout);

		}

		if(value.equalsIgnoreCase("app")) {

			((JavascriptExecutor) driver).executeScript("arguments[0].click();",Layout);

			((JavascriptExecutor) driver).executeScript("arguments[0].click();",App);

			((JavascriptExecutor) driver).executeScript("arguments[0].click();",Layout);

		}


	}

	public void setNumberOfFlows() {

		int flows= NumberOfFlows.size();

		System.out.println(flows);

		for(WebElement flows1: NumberOfFlows) {

			String text = flows1.getText();

			System.out.println(text);

		}
	}

	public void setClickFlow() {

		WebElement flow = NumberOfFlows.get(1);

		((JavascriptExecutor) driver).executeScript("arguments[0].click();",flow);





		//flow.click();

		// flowurl = ClickFlow.getAttribute("href");

		//System.out.println(flowurl);

	}
}









