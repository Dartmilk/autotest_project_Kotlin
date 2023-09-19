package org.qaauto

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.edge.EdgeDriver
import org.testng.Assert
import org.testng.annotations.AfterTest
import org.testng.annotations.BeforeClass
import org.testng.annotations.BeforeTest
import org.testng.annotations.Test

class MyFirstTest {

    private var driver: WebDriver? = null
@BeforeTest
    fun createDriver(){
        System.setProperty("webdriver.chrome.driver", "src/main/kotlin/org/qaauto/drivers/chromedriver.exe")
        driver = ChromeDriver()

    }
    @AfterTest
    fun tearDownDriver(){
        driver!!.quit()
    }
    @Test
    fun openWebPage(){
        val url = "https://www.google.com/"

            driver!!.get(url)
            Assert.assertEquals(driver!!.currentUrl, url, "Webpage url did not match expected value.")






    }



}