package tests;

import manage.DriverManage;
import org.testng.annotations.Test;

public class Grid_03 {
    DriverManage driverManage = new DriverManage();

    @Test
    void test01(){
        driverManage.setupChromeDriver().get("https://www.edebiyathocam.net");

    }
    @Test
    void test02(){
        driverManage.setupFirefoxDriver().get("https://www.edebiyathocam.net");

    }
    @Test
    void test03(){
        driverManage.setupChromeDriver().get("https://www.edebiyathocam.net");

    }
    @Test
    void test04(){
        driverManage.setupChromeDriver().get("https://www.edebiyathocam.net");

    }
    @Test
    void test05(){
        driverManage.setupFirefoxDriver().get("https://www.edebiyathocam.net");

    }
    @Test
    void test06(){
        driverManage.setupChromeDriver().get("https://www.edebiyathocam.net");

    }
    @Test
    void test07(){
        driverManage.setupChromeDriver().get("https://www.edebiyathocam.net");

    }
    @Test
    void test08(){
        driverManage.setupFirefoxDriver().get("https://www.edebiyathocam.net");

    }
    @Test
    void test09(){
        driverManage.setupChromeDriver().get("https://www.edebiyathocam.net");

    }
}
