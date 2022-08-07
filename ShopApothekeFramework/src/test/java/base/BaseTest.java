package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static FileReader fr;

	@BeforeTest
	public void setup() throws IOException {
		if (driver == null) {
			FileReader reader = new FileReader(
					System.getProperty("user.dir") + "\\src\\test\\resources\\configFiles\\config.properties");
			prop.load(reader);
		}

		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Allah\\eclipse-workspace\\ShopApothekeTask\\Driver\\chromedriver.exe");
			// System.setProperty("webdriver.gecko.driver",
			// "C:\\Users\\Allah\\eclipse-workspace\\ShopApothekeTask\\Driver\\geckodriver.exe");

			ChromeOptions option = new ChromeOptions();
			option.addArguments("--disable-blink-features=AutomationControlled");
			option.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
			option.setExperimentalOption("useAutomationExtension", false);
			driver = new ChromeDriver(option);
			driver.get(prop.getProperty("testurl"));
		}
	}

	@AfterTest
	public void teardown() {
		driver.close();
		System.out.println("closed");
	}
}
