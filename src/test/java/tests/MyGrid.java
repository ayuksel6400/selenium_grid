package tests;

import manage.DriverManage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class MyGrid {
    DriverManage driverManage = new DriverManage();

    static WebDriver driver;

    public static void main(String[] args) throws MalformedURLException {
        driver = new RemoteWebDriver(new URL(" http://192.168.1.62:4444"), new ChromeOptions());
        driver.get("https://www.edebiyathocam.net");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
    }

    @Test
    void firefoxTest(){
        try {
            driver = new RemoteWebDriver(new URL("http://192.168.1.62:4444"),new FirefoxOptions());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        driver.get("http://www.youtube.com");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

    }
    @Test
    public void remoteChromeDriver(){

        driver = driverManage.setupChromeDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getCurrentUrl());
    }

    @Test
    public void remoteFirefoxDriver(){


        driver=driverManage.setupFirefoxDriver();

        driver.get("https://www.edebiyathocam.net");
        System.out.println(driver.getCurrentUrl());
    }



}

