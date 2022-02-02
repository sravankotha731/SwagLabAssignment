package core;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import performance.utils.Bot;

public class DriverAction {
	protected WebDriver bot;
    protected static final String URL = "https://www.saucedemo.com/";

    @BeforeClass
    public void openBrowser() {
    	System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\sravan.kotha\\Desktop\\QA_Automation\\QA_Automation\\driver\\chromedriver.exe");
        bot = new Bot().getBot();
        bot.get(URL);
    }
    
    @AfterClass
    public void closeBrowser() {
        bot.quit();
    }

}
