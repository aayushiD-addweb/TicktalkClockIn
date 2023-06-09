package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


import java.io.File;
import java.io.IOException;
import java.util.List;

public class Hooks {


    public static WebDriver driver;

    @Before
    public void browser_setup() throws InterruptedException, IOException {
        System.setProperty("web-driver.chrome.driver", "/home/addweb/IdeaProjects/TT-Clockin/chromedriver");
        ChromeOptions options = new ChromeOptions();
        // options.setHeadless(true);
        // options.addArguments("headless");

        // options.addArguments("--headless"); // Enable headless mode
        // options.addArguments("--no-sandbox"); // Optional: Disable sandbox mode
        // options.addArguments("--disable-dev-shm-usage"); // Optional: Disable /dev/shm usage

        options.addArguments("--remote-allow-origins=*");

        // Launch the Chrome browser with the configured options
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://ttstage.addwebprojects.com/login");
        Thread.sleep(2000);

        //Use TakesScreenshot method to capture screenshot
        TakesScreenshot screenshot0 = (TakesScreenshot) driver;
        Thread.sleep(2000);
        //Saving the screenshot in desired location
        File source0 = screenshot0.getScreenshotAs(OutputType.FILE);
        Thread.sleep(2000);
        //Path to the location to save screenshot
        FileHandler.copy(source0, new File("/home/addweb/IdeaProjects/TT-Clockin/screenshots/Login.png"));
        Thread.sleep(2000);
        System.out.println("Login Page Screenshot is captured");

        //Login
        driver.findElement(By.xpath("/html/body/form/section/div/div/div/div/div[1]/input[1]")).sendKeys("roshni@addwebsolution.in");

        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/form/section/div/div/div/div/div[2]/div[1]/input")).sendKeys("addweb123");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/form/section/div/div/div/div/div[2]/button")).click();
        Thread.sleep(5000);

        //Use TakesScreenshot method to capture screenshot
        TakesScreenshot screenshot1 = (TakesScreenshot) driver;
        Thread.sleep(2000);
        //Saving the screenshot in desired location
        File source1 = screenshot1.getScreenshotAs(OutputType.FILE);
        Thread.sleep(2000);
        //Path to the location to save screenshot
        FileHandler.copy(source1, new File("/home/addweb/IdeaProjects/TT-Clockin/screenshots/Dashboard.png"));
        Thread.sleep(2000);
        System.out.println("Dashboard Page Screenshot is captured");

        driver.findElement(By.xpath("/html/body/div[1]/section/div[3]/div[1]/div[2]/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button")).click();
        Thread.sleep(5000);

        //Use TakesScreenshot method to capture screenshot
        TakesScreenshot screenshot2 = (TakesScreenshot) driver;
        Thread.sleep(2000);
        //Saving the screenshot in desired location
        File source2 = screenshot2.getScreenshotAs(OutputType.FILE);
        Thread.sleep(2000);
        //Path to the location to save screenshot
        FileHandler.copy(source2, new File("/home/addweb/IdeaProjects/TT-Clockin/screenshots/successmessage.png"));
        Thread.sleep(2000);
        System.out.println("Successfully clock-in message Screenshot is captured");

        WebElement clockInElement = driver.findElement(By.xpath("/html/body/div[1]/section/div[3]/div[1]/div[2]/p/span"));

        String clockinTime = clockInElement.getText();


        driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[3]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[3]/div/a[3]")).click();
        Thread.sleep(2000);


        //For Sidebar
        Actions actions1 = new Actions(driver);
        WebElement sidebar = driver.findElement(By.id("mobile_menu_collapse"));
        actions1.moveToElement(sidebar);
        List <WebElement> menuItems = driver.findElements(By.xpath("/html/body/aside/div[2]/div[2]/ul/li"));
        // Iterate over the menu items
        for (WebElement menuItem : menuItems) {
            WebElement link = menuItem.findElement(By.tagName("a"));
            String actualModule = link.getText();
            System.out.println(actualModule);

            // Specify the desired menu item you want to click
            String desiredModule = "HR";


//            if (actualModule.equals(desiredModule)) {
//                link.click();
//
//                WebElement attendanceMenuItem = driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[3]/div/a[3]"));
//
//                // Click on the "Attendance" submenu item
//                attendanceMenuItem.click();
//
//                break; // Exit the loop after clicking the desired menu item
//            }
//            else{
//                System.out.println("Path not found");
//            }
        }

        LocalDateTime currentDateTime = LocalDateTime.now();
        // Format the time in 12-hour format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a");
        String formattedDateTime = currentDateTime.format(formatter);
        String day = String.valueOf(Integer.parseInt(formattedDateTime.substring(0, 2)));
        // Output the result
        System.out.println("Current Date is: " + day);

        // Loop through the rows to find the current date
        Actions action1 = new Actions(driver);
        WebElement element1 = driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div")); //--- Table Xpath
        action1.moveToElement(element1);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/div/table/thead/tr/th")));
        List<WebElement> columns = driver.findElements(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/div/table/thead/tr/th")); //--- Table Xpath
        int Size = columns.size();
        for (int i = 1; i <= Size; i++) {
            WebElement col1;
            col1 = driver.findElement(By.xpath("html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/div/table/thead/tr/th[" + i + "]"));  //----Employee column xpath
            String actual_date = col1.getText();
            System.out.println(actual_date);
            if (actual_date.equals(day) == true) {
                System.out.println("Expected Date Found!!!");
                System.out.println("Dashboard and Attendance Dates Matched");
                Thread.sleep(100);
                WebDriverWait wait0 = new WebDriverWait(driver, Duration.ofSeconds(100));
                wait0.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/div/table/thead/tr/th[" + i + "]")));
                driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/div/table/thead/tr/th[" + i + "]")).click(); //---Name column xpath

                WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(100));
                wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/div/table/tbody/tr/td[" + i + "]/a"))); //--Attendance column xpath
                driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/div/table/tbody/tr/td[" + i + "]/a")).click();  //--Attendance column xpath
                Thread.sleep(2000);
                break;
            }
                else
                {
                    System.out.println("Date Not Matched");
                }
        }


        // Get the current time
        LocalTime currentTime = LocalTime.now();

        // Convert the current time to the expected format
        String expectedTime = currentTime.toString();
        LocalDate currentDate = LocalDate.now();

        formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = currentDate.format(formatter);

        Thread.sleep(1000);
        By actualTimeLocator = By.xpath("//*[@id=\"myModalXl\"]/div/div/div[2]/div[2]/div[1]/div/div[2]/div/div[1]/p");
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement actualTimeElement = wait1.until(ExpectedConditions.presenceOfElementLocated(actualTimeLocator));

        String actualTime = actualTimeElement.getText();
        System.out.println(actualTime);
        Thread.sleep(2000);

        // Print the expected and current time
        System.out.println("Expected Time: " + expectedTime);
        //  System.out.println("Current Time: " + actualTime);
        System.out.println("clockin Time: " + clockinTime);

        if (expectedTime.equals(actualTime)) {
            System.out.println("clockin time matches the actual time.");
        } else {
            System.out.println("clockin time does not match the actual time.");
        }

    }

        @After
        public void Teardown ()
        {
            driver.quit();
        }

        public WebDriver getDriver ()
        {
            return driver;
        }

    }

