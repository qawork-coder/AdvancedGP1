package Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumTestCase {

 
public static WebDriver driver;
 
 public static void main(String[]  args) throws MalformedURLException, InterruptedException {
 
 String URL = "https://www.google.com";
 String Node = "http://192.168.1.18:37062/wd/hub";
 DesiredCapabilities cap =  DesiredCapabilities.chrome();
 
 driver = new RemoteWebDriver(new URL(Node), cap);
 
 driver.get(URL);
 Thread.sleep(5000);
 driver.quit();
 } 
}
