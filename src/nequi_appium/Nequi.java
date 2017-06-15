package nequi_appium;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.android.AndroidDriver;
import nequi.configuracion.ConfigurationManager;

/**
 * @author   Juan Camilo Arboleda - Programador
 * @author   Christian Fontalvo - Analista de AutomatizaciÃ³n
 *
 */
public class Nequi 
{
	/**
	* @throws java.lang.Exception
	*/
	static Funciones funciones = new Funciones();
	static Flujos flujos = new Flujos();
	public static AndroidDriver<WebElement> Obj_Android_Driver;
	public static String xPath =null;
	public static int index;
	public static WebDriverWait Obj_Webdriver_Espera;
	public static int int_Tiempo_Espera = 10;
	public static String Str_Nombre_Bolsillo = "EditarBolsillo";
	public static String Str_Nombre2_Bolsillo = "EditarBolsillo2";
	public static String Str_Nombre_Meta = "Asd";
	public static String Str_Numero_Telefono = "3991000025";
	public static String Str_Numero_celrec = "3991000025";
	public static String Str_Numero_Amigo = "3006581359";
	public static String Str_Contrasena = "1397";
	public static String Str_OTP = "1234";
	public static String Str_Ruta_Evidencias = "C:\\evidencias_nequi\\";
	public static Dimension Obj_Tamano =null;
	static File file1;
	static File file2;
	public static int startx = 0;
	public static int endx = 0;
	public static int starty = 0;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{

	}
	
	@Test
	public void Inicio_NEQUI() throws Exception
	{
		String connString = ConfigurationManager.getAppSetting("metodo");
		System.out.println(connString);
		System.out.println("******************Inicio de Prueba********************************************");
		Thread.sleep(6000);
//		funciones.buscaElementoIngles("//*[@resource-id='android:id/button2' and @text='Update']","//*[@resource-id='android:id/button2' and @text='Actualizar']",Obj_Android_Driver);
//		// ---------------------------- Paseo ---------------
		Thread.sleep(8000);
		flujos.paseo(Obj_Android_Driver);
	
		// ****************** Entrar a la APP *********************
		flujos.entrarAppCuenta(Obj_Android_Driver,Str_Contrasena,Str_OTP,Str_Numero_Telefono);
		
		selector(connString);

		// ****************** Guardadito *********************
		//guardadito("Saca");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
	
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception 
	{
		System.out.println("Configuración de la terminal: Iniciado");
		try 
		{
			DesiredCapabilities Obj_Capabilities = new DesiredCapabilities();
			Obj_Android_Driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), Obj_Capabilities);
			Obj_Webdriver_Espera = new WebDriverWait(Obj_Android_Driver, int_Tiempo_Espera);
		} 
		catch (Exception Obj_Error) 
		{
			System.out.println("Error: " + Obj_Error.getMessage());
		}
		System.out.println("Configuración de la terminal: Finalizada");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception 
	{
		funciones.toma_Evidencias(Obj_Android_Driver);
		Thread.sleep(int_Tiempo_Espera*500);
		System.out.println("******************************************************************************************************************"
				+ '\n' + "Prueba Finalizada");
		//Obj_Android_Driver.closeApp();
		Obj_Android_Driver.close();
		Obj_Android_Driver = null;
		Obj_Webdriver_Espera = null;
		//setUp();
	}
		
	public void selector(String metodo) throws IOException{
		switch (metodo) 
		{ 			
				case "pedirVinculado": flujos.pedirVinculado(Obj_Android_Driver,Str_Numero_Amigo);
				break;
				case "pagarVinculado": flujos.pagarVinculado("VacacionesTolu",Obj_Android_Driver);
				break; 
				case "enviarVinculado": flujos.enviarVinculado("MetaVacacionesTolu",Str_Contrasena,Str_Numero_Amigo,Obj_Android_Driver);
				break; 
				case "sacarVinculado": flujos.sacarVinculado("prueba2",Obj_Android_Driver);
				break; 
				case "creaBolsillo": flujos.creaBolsillo(Obj_Android_Driver,Str_Nombre_Bolsillo);	
				break; 
				case "crudBolsillo": flujos.crudBolsillo("editar",Obj_Android_Driver,Str_Nombre_Bolsillo,Str_Nombre2_Bolsillo);
				break; 
				case "crearMeta": flujos.crearMeta(Obj_Android_Driver,Str_Nombre_Meta);
				break; 
				case "crudMeta": flujos.crudMeta("romper",Obj_Android_Driver,Str_Nombre_Meta);
				break; 
				case "recargaCelular": flujos.recargaCelular("MetaVacacionesTolu",Obj_Android_Driver,Str_Numero_celrec);
				break;
				case "recargaDirecTVPrepago": flujos.recargaDirecTVPrepago("MetaVacacionesTolu",Obj_Android_Driver,Str_Numero_celrec);
				break;
				case "todo":
					String[] metodos={"pedirVinculado","sacarVinculado","enviarVinculado"};
					for(int i = 0; i<metodos.length; i++){
						selector(metodos[i]);
					}
				break;
		}
	}	
	

	//*************************************** FLUJOS DEL GUARDADITO *********************
	
	public static void guardadito(String accion) throws IOException

	{
		System.out.println("********* Flujo del Guardadito ***********");
		try 
		{	
			// ****************** Abre Guardadito *********************
						
			Obj_Webdriver_Espera.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@content-desc='Guardadito' and @clickable='true']")));
			WebElement Obj_Elemento;
			Obj_Elemento = Obj_Android_Driver.findElement(By.xpath("//*[@content-desc='Guardadito' and @clickable='true']"));	
			int Dbl_X_1 = Obj_Elemento.getLocation().getX() - Obj_Android_Driver.manage().window().getSize().getWidth();
			int Dbl_Y_1 = Obj_Elemento.getLocation().getY();
			Obj_Android_Driver.tap(2, Dbl_X_1+80, Dbl_Y_1-50, 100);
			System.out.println(" **** Clic en Guardadito ************** OK");
			Thread.sleep(8000);
			Obj_Android_Driver.findElementByXPath("//*[contains(@content-desc,'Entendido') and @clickable='true']").click();
			System.out.println(" **** Click en Entendido ************** OK");
			Thread.sleep(3000);
			funciones.abrirVelo(Obj_Android_Driver);
			System.out.println(" **** Abre velo de Guardadito ************** OK");
			Thread.sleep(3000);
			
			//  ****************************************
			
			//Obj_Elemento = Obj_Android_Driver.findElement(By.xpath("//*[@content-desc='"+accion+"' and @clickable='true']")).click();	
			/*int Dbl_X_2 = Obj_Elemento.getLocation().getX() - Obj_Android_Driver.manage().window().getSize().getWidth();
			int Dbl_Y_2 = Obj_Elemento.getLocation().getY();
			Obj_Android_Driver.tap(2, Dbl_X_2+80, Dbl_Y_2-50, 100);*/

			System.out.println(" **** Clic en La accion a realizar ************** OK");
			Thread.sleep(2000);
			//  ****************************************
			
			switch (accion) 
			{ 
					case "EnvÃ­a": enviaGuardadito(); 
					break; 
					case "Paga": pagaGuardadito(); 
					break; 
					case "Saca": sacaGuardadito(); 
					break;
			}
			System.out.println(" **** Flujo Seleccionado Fin ************** OK");
		}
		catch (Exception Obj_Error)
		{
			System.out.println(" **** Flujo del Guardadito ************** FAIL");
			funciones.toma_Evidencias(Obj_Android_Driver);
		}
	}
	
	public static void enviaGuardadito() throws IOException
	{
		System.out.println("********* Flujo del Guardadito ***********");
		try 
		{	
			// ****************** Abre Guardadito *********************
						
			Obj_Android_Driver.findElementByXPath("//*[contains(@content-desc,'Envia') and @clickable='true']").click();
			System.out.println(" **** Clic en EnvÃ­a ************** OK");
			Thread.sleep(6000);

			WebElement camp_cel = Obj_Android_Driver.findElementByXPath("//*/android.widget.EditText");
			int anch_pant = Obj_Android_Driver.manage().window().getSize().getWidth();
			int x = camp_cel.getLocation().getX();
			int y = camp_cel.getLocation().getY();
			Obj_Android_Driver.tap(1, x-anch_pant,y, 1000);
			
			System.out.println(" **** Campo Celular ************** OK");
			Thread.sleep(3000);
			Obj_Android_Driver.findElement(By.xpath("//*/android.widget.EditText")).sendKeys(Str_Numero_Amigo);
			Thread.sleep(3000);
			WebElement monto = Obj_Android_Driver.findElementByXPath("//*[contains(@content-desc,'$ 0') and @clickable='true']");					
			int x1 = monto.getLocation().getX();
			int y1 = monto.getLocation().getY();
			Thread.sleep(3000);
			Obj_Android_Driver.tap(1, x1-anch_pant,y1, 0);
			System.out.println(" **** CAMPO MONTO ************** OK");
			Thread.sleep(3000);
			Obj_Android_Driver.findElementByXPath("//*[contains(@content-desc,'$ 0') and @clickable='true']").sendKeys("1000");
			Thread.sleep(3000);
			Obj_Android_Driver.tap(1,anch_pant/2,90, 0);
			Thread.sleep(3000);
			List<WebElement> mensaje= Obj_Android_Driver.findElements(By.xpath("//*/android.webkit.WebView/android.view.View"));
			mensaje.get(9).sendKeys("Mensaje Automatizado");
			System.out.println("**** CAMPO MENSAJE ************** OK");
			Obj_Android_Driver.tap(1,anch_pant/2,90, 0);
			Thread.sleep(3000);			
			Obj_Android_Driver.findElementByXPath("//*[contains(@content-desc,'Envía') and @class='android.widget.Button']").click();
			Thread.sleep(3000);
			funciones.contrasena(Str_Contrasena,Obj_Android_Driver);

		}
		catch (Exception Obj_Error)
		{
			System.out.println(" **** Enviar vinculado ************** FAIL");
			funciones.toma_Evidencias(Obj_Android_Driver);
		}
	}
	
	public static void pagaGuardadito() throws IOException
	{
		System.out.println("****** Pagar *************");
		try 
		{
			// ****************** Abre Velo de Transacciones *********************
		
			Thread.sleep(8000);
			Obj_Webdriver_Espera.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(@content-desc,'Paga') and @clickable='true']")));
			Obj_Android_Driver.findElementByXPath("//*[contains(@content-desc,'Paga') and @clickable='true']").click();
			System.out.println(" **** Clic en Pagar ************** OK");
			Thread.sleep(5000);
		}
		catch (Exception Obj_Error)
		{
			System.out.println(" **** Pagar ************** FAIL");
			funciones.toma_Evidencias(Obj_Android_Driver);
		}
	}
	
	public static void sacaGuardadito() throws IOException
	{
		System.out.println("***** Flujo Sacar **********");
		try 
		{
			// ****************** Abre Velo de Transacciones *********************
			Thread.sleep(6000);
			Obj_Webdriver_Espera.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(@content-desc,'Saca') and @clickable='true']")));
			Obj_Android_Driver.findElementByXPath("//*[contains(@content-desc,'Saca') and @clickable='true']").click();
			System.out.println(" **** Clic en Saca ************** OK");
			Thread.sleep(5000);
			Obj_Android_Driver.findElementByXPath("//*[contains(@content-desc,'Cajero') and @clickable='true']").click();
			System.out.println(" **** Clic en Cajero ************** OK");	
			Thread.sleep(4000);
			funciones.contrasena(Str_Contrasena,Obj_Android_Driver);
			
			System.out.println(" **** Flujo Sacar ************** OK");

		}
		catch (Exception Obj_Error)
		{
			System.out.println(" ****  Flujo Sacar ************** FAIL");
			funciones.toma_Evidencias(Obj_Android_Driver);
		}	
	}	
}