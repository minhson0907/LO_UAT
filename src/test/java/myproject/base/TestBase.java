package myproject.base;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class TestBase {

    protected static WebDriver driver;
    protected static Properties prop;
    private File file = new File("config/linktest.properties");
    public String fileCode;

    public TestBase(){
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream(file);
            prop.load(ip);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void init(){
        String browserType = prop.getProperty("browser.type");
        switch (browserType.toUpperCase()){
            case "CHROME":
                System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver_2.38.exe");
                ChromeOptions op = new ChromeOptions();
                op.addExtensions(new File(System.getProperty("user.dir") + "\\data\\auth.crx"));
                driver = new ChromeDriver(op);
                driver.get("chrome-extension://enhldmjbphoeibbpdhmjkchohnidgnah/popin.html");
                break;
            case "FIREFOX":
                System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
                driver = new FirefoxDriver();
                break;
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    public void waitElement(By webElement) throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(webElement));
    }

    public void clickToElementByJS(String locator) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", driver.findElement(By.xpath(locator)));
    }

    public String read_file(String filename) {
        BufferedReader br = null;
        String temp = null;
        try {
            String sCurrentLine;
            br = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\data\\" + filename));

            while ((sCurrentLine = br.readLine()) != null) {
                temp = sCurrentLine;
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return temp;
    }

    public void write_file(){
        try {
            FileWriter myWriter = new FileWriter(System.getProperty("user.dir") + "\\data\\fileCode.txt");
            myWriter.write(fileCode);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
