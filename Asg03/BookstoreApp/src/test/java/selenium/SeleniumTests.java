package selenium;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import org.openqa.selenium.chrome.ChromeOptions;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;

class SeleniumTests {

  static Process server;
  private WebDriver driver;

  @BeforeAll
  public static void setUpBeforeClass() throws Exception {
    ProcessBuilder pb = new ProcessBuilder("java", "-jar", "bookstore5.jar");
    server = pb.start();
  }

  @BeforeEach
  public void setUp() {
    // driver = new FirefoxDriver();
    // driver = new SafariDriver();
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("http://localhost:8080/");
    // wait to make sure Selenium is done loading the page
    WebDriverWait wait = new WebDriverWait(driver, 60);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("title")));
  }

  @AfterEach
  public void tearDown() {
    driver.close();
  }

  @AfterAll
  public static void tearDownAfterClass() throws Exception {
    server.destroy();
  }

  //my tests
  @Test
	public void Test11a() {
	    driver.get("http://localhost:8080/admin");
	    driver.manage().window().setSize(new Dimension(1414, 1050));
	    driver.findElement(By.id("loginId")).click();
	    driver.findElement(By.id("loginId")).sendKeys("admin");
	    driver.findElement(By.id("loginPasswd")).sendKeys("password");
	    driver.findElement(By.id("loginBtn")).click();
	    driver.findElement(By.id("addBook-category")).click();
	    driver.findElement(By.id("addBook-category")).sendKeys("History");
	    driver.findElement(By.id("addBook-id")).click();
	    driver.findElement(By.id("addBook-id")).sendKeys("1234567");
	    driver.findElement(By.id("addBook-title")).click();
	    driver.findElement(By.id("addBook-title")).sendKeys("Cleopatra");
	    driver.findElement(By.id("addBook-authors")).click();
	    driver.findElement(By.id("addBook-authors")).sendKeys("Stacy Schiff");
	    driver.findElement(By.id("cost")).click();
	    driver.findElement(By.id("cost")).sendKeys("11.69");
	    driver.findElement(By.name("addBook")).click();
	    {
	      WebElement element = driver.findElement(By.name("addBook"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    assertThat(driver.findElement(By.cssSelector("h2")).getText(), is("Successfully added book"));
	    driver.findElement(By.id("searchBtn")).click();
	    driver.findElement(By.id("del-4321234")).click();
	}
	
	@Test
	public void Test11b() {
	    driver.get("http://localhost:8080/admin");
	    driver.manage().window().setSize(new Dimension(1414, 1050));
	    driver.findElement(By.id("loginId")).click();
	    driver.findElement(By.id("loginId")).sendKeys("admin");
	    driver.findElement(By.id("loginPasswd")).sendKeys("password");
	    driver.findElement(By.id("loginBtn")).click();
	    driver.findElement(By.id("addBook-category")).click();
	    driver.findElement(By.id("addBook-category")).sendKeys("History");
	    driver.findElement(By.id("addBook-id")).click();
	    driver.findElement(By.id("addBook-id")).sendKeys("1234567");
	    driver.findElement(By.id("addBook-title")).click();
	    driver.findElement(By.id("addBook-title")).sendKeys("Cleopatra");
	    driver.findElement(By.id("addBook-authors")).click();
	    driver.findElement(By.id("addBook-authors")).sendKeys("");
	    driver.findElement(By.id("cost")).click();
	    driver.findElement(By.id("cost")).sendKeys("11.69");
	    driver.findElement(By.name("addBook")).click();
	    {
	      WebElement element = driver.findElement(By.name("addBook"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    assertThat(driver.findElement(By.cssSelector("h2")).getText(), is("Validation errors"));
	    assertThat(driver.findElement(By.cssSelector("li:nth-child(1)")).getText(), is("Missing author(s)"));
	 }
	
	@Test
	public void Test21a() {
	    driver.get("http://localhost:8080/admin");
	    driver.manage().window().setSize(new Dimension(1414, 1050));
	    driver.findElement(By.id("loginId")).click();
	    driver.findElement(By.id("loginId")).sendKeys("admin");
	    driver.findElement(By.id("loginPasswd")).sendKeys("password");
	    driver.findElement(By.id("loginBtn")).click();
	    driver.findElement(By.id("addBook-category")).click();
	    driver.findElement(By.id("addBook-category")).sendKeys("History");
	    driver.findElement(By.id("addBook-id")).click();
	    driver.findElement(By.id("addBook-id")).sendKeys("1234567");
	    driver.findElement(By.id("addBook-title")).click();
	    driver.findElement(By.id("addBook-title")).sendKeys("Cleopatra");
	    driver.findElement(By.id("addBook-authors")).click();
	    driver.findElement(By.id("addBook-authors")).sendKeys("Stacy Schiff");
	    driver.findElement(By.id("cost")).click();
	    driver.findElement(By.id("cost")).sendKeys("11.69");
	    driver.findElement(By.name("addBook")).click();
	    {
	      WebElement element = driver.findElement(By.name("addBook"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.get("http://localhost:8080");
	    driver.findElement(By.id("search")).sendKeys("History");
	    driver.findElement(By.id("searchBtn")).click();
	    assertThat(driver.findElement(By.id("title-4321234")).getText(), is("Cleopatra"));
	    driver.get("http://localhost:8080/admin");
	    driver.findElement(By.id("searchBtn")).click();
	    driver.findElement(By.id("del-4321234")).click();
	}
	
	@Test
	public void Test22a() {
		driver.get("http://localhost:8080");
	    driver.findElement(By.id("search")).sendKeys("");
	    driver.findElement(By.id("searchBtn")).click();
	    assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("We currently have the following items in category ''"));
	}
	
	@Test
	public void Test2b() {
		driver.get("http://localhost:8080");
	    driver.findElement(By.id("search")).sendKeys("hened");
	    driver.findElement(By.id("searchBtn")).click();
	    assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("Sorry we do not have any item matching category 'hened' at this moment"));
	}
	
	@Test
	public void Test3a() {
		driver.get("http://localhost:8080");
	    driver.findElement(By.id("search")).sendKeys("");
	    driver.findElement(By.id("searchBtn")).click();
	    assertThat(driver.findElement(By.id("order-lewis001")).isEnabled(), is(true));
	}
	
	@Test
	public void Test4a() {
		driver.get("http://localhost:8080");
	    driver.findElement(By.id("search")).sendKeys("");
	    driver.findElement(By.id("searchBtn")).click();
	    driver.findElement(By.id("order-lewis001")).click();
	    driver.findElement(By.id("cartLink")).click();
	    {
	        List<WebElement> elements = driver.findElements(By.cssSelector("tbody:nth-child(2) td:nth-child(1)"));
	        assert(elements.size() > 0);
	      }
	      {
	        List<WebElement> elements = driver.findElements(By.cssSelector("tbody:nth-child(2) td:nth-child(2)"));
	        assert(elements.size() > 0);
	      }
	      {
	        List<WebElement> elements = driver.findElements(By.cssSelector("tbody:nth-child(2) td:nth-child(3)"));
	        assert(elements.size() > 0);
	      }
	      {
	        List<WebElement> elements = driver.findElements(By.id("lewis001"));
	        assert(elements.size() > 0);
	      }
	      {
	        List<WebElement> elements = driver.findElements(By.id("totlewis001"));
	        assert(elements.size() > 0);
	      }
	}
	
	@Test
	public void Test5a() {
		driver.get("http://localhost:8080");
	    driver.findElement(By.id("search")).sendKeys("");
	    driver.findElement(By.id("searchBtn")).click();
	    driver.findElement(By.id("order-lewis001")).click();
	    driver.findElement(By.id("cartLink")).click();
	    driver.findElement(By.id("lewis001")).clear();
	    driver.findElement(By.id("lewis001")).sendKeys("2");
	    driver.findElement(By.name("updateOrder")).click();
	    assertThat(driver.findElement(By.id("totlewis001")).getText(), is("$39.90"));
	}
	
	@Test
	public void Test51a() {
		driver.get("http://localhost:8080");
	    driver.findElement(By.id("search")).sendKeys("");
	    driver.findElement(By.id("searchBtn")).click();
	    driver.findElement(By.id("order-lewis001")).click();
	    driver.findElement(By.id("cartLink")).click();
	    driver.findElement(By.id("lewis001")).clear();
	    driver.findElement(By.id("lewis001")).sendKeys("0");
	    driver.findElement(By.name("updateOrder")).click();
	    assertThat(driver.findElement(By.id("totlewis001")).getText(), is("$0.00"));
	    driver.navigate().refresh();
	    {
	        List<WebElement> elements = driver.findElements(By.cssSelector("tbody:nth-child(2) td:nth-child(1)"));
	        assert(elements.size() == 0);
	    }
	}
	
	@Test
	public void Test5b() {
		driver.get("http://localhost:8080");
	    driver.findElement(By.id("search")).sendKeys("");
	    driver.findElement(By.id("searchBtn")).click();
	    driver.findElement(By.id("order-lewis001")).click();
	    driver.findElement(By.id("cartLink")).click();
	    driver.findElement(By.id("lewis001")).clear();
	    driver.findElement(By.id("lewis001")).sendKeys("asdf");
	    driver.findElement(By.name("updateOrder")).click();
	    assertThat(driver.findElement(By.id("totlewis001")).getText(), is("$19.95"));
	}
	
	@Test
	public void Test6a() {
		driver.get("http://localhost:8080");
	    driver.findElement(By.id("search")).sendKeys("");
	    driver.findElement(By.id("searchBtn")).click();
	    driver.findElement(By.id("order-lewis001")).click();
	    driver.findElement(By.id("cartLink")).click();
	    driver.findElement(By.name("checkout")).click();
	    {
	        List<WebElement> elements = driver.findElements(By.id("order_date"));
	        assert(elements.size() != 0);
	    }
	    {
	        List<WebElement> elements = driver.findElements(By.id("order_total"));
	        assert(elements.size() != 0);
	    }
	    {
	        List<WebElement> elements = driver.findElements(By.id("order_taxes"));
	        assert(elements.size() != 0);
	    }
	    {
	        List<WebElement> elements = driver.findElements(By.id("order_shipping"));
	        assert(elements.size() != 0);
	    }
	}
	
	@Test
	public void Test7a() {
	    driver.get("http://localhost:8080/admin");
	    driver.manage().window().setSize(new Dimension(1414, 1050));
	    driver.findElement(By.id("loginId")).click();
	    driver.findElement(By.id("loginId")).sendKeys("admin");
	    driver.findElement(By.id("loginPasswd")).sendKeys("password");
	    driver.findElement(By.id("loginBtn")).click();
	    driver.findElement(By.id("addBook-category")).click();
	    driver.findElement(By.id("addBook-category")).sendKeys("History");
	    driver.findElement(By.id("addBook-id")).click();
	    driver.findElement(By.id("addBook-id")).sendKeys("4321234");
	    driver.findElement(By.id("addBook-title")).click();
	    driver.findElement(By.id("addBook-title")).sendKeys("Khang's life");
	    driver.findElement(By.id("addBook-authors")).click();
	    driver.findElement(By.id("addBook-authors")).sendKeys("Khang");
	    driver.findElement(By.id("cost")).click();
	    driver.findElement(By.id("cost")).sendKeys("11.69");
	    driver.findElement(By.name("addBook")).click();
	    {
	      WebElement element = driver.findElement(By.name("addBook"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    assertThat(driver.findElement(By.cssSelector("h2")).getText(), is("Successfully added book"));
	    driver.findElement(By.id("searchBtn")).click();
	    driver.findElement(By.id("del-4321234")).click();
	    try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    {
	        List<WebElement> elements = driver.findElements(By.id("del-4321234"));
	        assert(elements.size() == 0);
	    }
	}
	
	@Test
	public void Test8a() {
	    driver.get("http://localhost:8080/admin/catalog");
	    driver.manage().window().setSize(new Dimension(1414, 1050));
	    driver.findElement(By.id("loginId")).click();
	    driver.findElement(By.id("loginId")).sendKeys("admin");
	    driver.findElement(By.id("loginPasswd")).sendKeys("password");
	    driver.findElement(By.id("loginBtn")).click();
	    {
	        List<WebElement> elements = driver.findElements(By.cssSelector(".content > div"));
	        assert(elements.size() == 0);
	    }
	}
	
	@Test
	public void Test8b() {
	    driver.get("http://localhost:8080/admin/catalog");
	    driver.manage().window().setSize(new Dimension(1414, 1050));
	    driver.findElement(By.id("loginId")).click();
	    driver.findElement(By.id("loginId")).sendKeys("user");
	    driver.findElement(By.id("loginPasswd")).sendKeys("password");
	    driver.findElement(By.id("loginBtn")).click();
	    {
	        List<WebElement> elements = driver.findElements(By.cssSelector(".content > div"));
	        assert(elements.size() > 0);
	    }
	}

  private String[] getWords(String s) {
    return s.split("\\s+");
  }
}
