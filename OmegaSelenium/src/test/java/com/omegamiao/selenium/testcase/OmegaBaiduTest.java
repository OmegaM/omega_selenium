/**
 *
 */
package com.omegamiao.selenium.testcase;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Lei Miao
 */
public class OmegaBaiduTest {

    WebDriver driver;

    /**
     */
    @Before
    public void setUp() {
        this.driver = new FirefoxDriver();
    }

    /**
     */
    @After
    public void tearDown() {
        this.driver.close();
    }

    @Test
    public void test() {
        this.driver.get("http://www.baidu.com");
        this.driver.findElement(By.id("kw")).sendKeys("music");
        this.driver.findElement(By.id("su")).click();
        Assert.assertTrue(this.driver.getCurrentUrl().contains("wd=music"));

    }

}
