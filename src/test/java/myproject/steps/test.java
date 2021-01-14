package myproject.steps;
import java.io.File;

import myproject.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class test {

    protected static WebDriver driver;

    public static void main(String[] args) {
        ChromeOptions op = new ChromeOptions();
        op.addExtensions(new File(System.getProperty("user.dir") + "\\data\\auth.crx"));
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver_2.38.exe");
        driver = new ChromeDriver(op);
        driver.get("chrome-extension://enhldmjbphoeibbpdhmjkchohnidgnah/popin.html");
        driver.findElement(By.id("url")).sendKeys("http://100.69.115.17:8686/Pages/QuanLyYeuCau/HeThongDungChung/QLYeuCau.aspx");
        driver.findElement(By.id("username")).sendKeys("a1nv");
        driver.findElement(By.id("password")).sendKeys("Abc123!@#");
        driver.findElement(By.xpath("//button[.='Add']")).click();
        driver.get("http://100.69.115.17:8686/Pages/QuanLyYeuCau/HeThongDungChung/QLYeuCau.aspx");
    }
}
