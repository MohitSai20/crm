package Parameterization;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Login {

    public static WebDriver driver;



    @Test
    public void para() throws IOException {




        FileInputStream fs = new FileInputStream(new File("C:\\grid\\data.xlsx"));
//create workbook
        XSSFWorkbook wb = new XSSFWorkbook(fs);
//access worksheet
        XSSFSheet sh = wb.getSheetAt(0);
        int lastrow = sh.getLastRowNum();
        System.out.println("last row used is :" + lastrow);
        for (int i = 1; i <= lastrow; i++) {



            String un = sh.getRow(i).getCell(0).toString();
            driver.get("https://classic.freecrm.com/login.cfm?pr=1");



            driver.findElement(By.xpath("/html/body/div[2]/div/div/form/input[1]")).sendKeys(un);



            driver.findElement(By.xpath("/html/body/div[2]/div/div/form/input[2]")).click();
        }



    }




    @BeforeClass
    public static void beforetest() {
        System.setProperty("webdriver.chrome.driver", "C:\\grid\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



    }



    @AfterClass
    public static void aftertest() {
        driver.quit();
    }
}


