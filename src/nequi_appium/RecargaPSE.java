package nequi_appium;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class RecargaPSE {
  private WebDriver driver;
  private String baseUrl;
  private StringBuffer verificationErrors = new StringBuffer();
  private String fecha;
  private String msjfin;
  @Before
  public void setUp() throws Exception {
//	String exePath = "C:\\Users\\juan.arboleda\\Downloads\\chromedriver_win32\\chromedriver.exe";
	String exePath = "D:\\SeleniumWebdriver\\chromedriver_win32\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", exePath);
	driver = new ChromeDriver();
	baseUrl = "https://lbwasawsqa.bancadigital.com.co/bdigitalpsl/#/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @org.junit.Test
  public void testRes() throws Exception {
 
    driver.get(baseUrl);
    driver.findElement(By.id("Inputphone")).clear();
    driver.findElement(By.id("Inputphone")).sendKeys("3999997878");
    driver.findElement(By.id("Inputammount")).clear();
    driver.findElement(By.id("Inputammount")).sendKeys("2000");
    new Select(driver.findElement(By.xpath("//form[@id='form1']/fieldset/select"))).selectByVisibleText("Cédula de ciudadanía");
    driver.findElement(By.xpath("//option[@value='cc']")).click();
    driver.findElement(By.id("Inputdocnum")).clear();
    driver.findElement(By.id("Inputdocnum")).sendKeys("10354896");
    driver.findElement(By.id("Inputemail")).clear();
    driver.findElement(By.id("Inputemail")).sendKeys("cas@fcas.cam");
    driver.findElement(By.cssSelector("button.submit_btn.ng-binding")).click(); 
    Thread.sleep(4000);
    new Select(driver.findElement(By.xpath("//form[@id='form2']/fieldset/div[4]/select"))).selectByVisibleText("BANCO UNION COLOMBIANO");
    Thread.sleep(4000);
    driver.findElement(By.cssSelector("button.submit_btn.ng-binding")).click(); 
    Thread.sleep(4000);
    driver.findElement(By.id("PNEMail")).sendKeys("sara.henao@pragma.com.co");
    driver.findElement(By.id("btnSeguir")).click();
   // assertEquals("TransactionPage", driver.getTitle());
    Thread.sleep(4000);

    JavascriptExecutor jsx = (JavascriptExecutor)driver;
    jsx.executeScript("window.scrollBy(0,450)", "");
    Thread.sleep(3000);
 
    driver.findElement(By.id("btnDebug")).click();
   // assertEquals("Debug ConfirmTransactionPayment", driver.getTitle());
    driver.findElement(By.id("txtBankProcessDate")).clear();
   // fecha = driver.findElement(By.id("txtSoliciteDate")).getText();
   	Date date = new Date();

   	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
   	fecha = dateFormat.format(date);
   	System.out.println("Fecha: "+dateFormat.format(date));  
    
   	driver.findElement(By.id("txtBankProcessDate")).sendKeys(fecha);
    driver.findElement(By.id("txtAuthorizationID")).clear();
    driver.findElement(By.id("txtAuthorizationID")).sendKeys("12");
    driver.findElement(By.id("btnCall")).click();

    msjfin = driver.findElement(By.id("lblMessage")).getText();
    System.out.println("texto del resultado "+msjfin);
    
    if(msjfin.equals("Call Return: SUCCESS - TransactionState: OK"))
    {
    	System.out.println("FIN de la Prueba Exitosa.");
    }else{
    	System.out.println("No se encuenta mensaje de Exito");
    }
    
    
    
  }

  @After
  public void tearDown() throws Exception {
	  System.out.println("termina");  
    //driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }
}

