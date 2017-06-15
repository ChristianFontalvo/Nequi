package nequi_appium;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import io.appium.java_client.android.AndroidDriver;

public class Flujos {
	static Funciones funciones = new Funciones();
	static File file1;
	static File file2;
	public static int startx = 0;
	public static int endx = 0;
	public static int starty = 0;
	public String metodoActual="";
	
	public void paseo(AndroidDriver<WebElement> Obj_Android_Driver) throws InterruptedException, IOException{
		try {
//			WebElement objElement;
//		Obj_Android_Driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[4]/android.view.View[1]/android.widget.Button[1]").click();
		//Obj_Android_Driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.view.View[1]/android.widget.Button[1]").click();			
//			objElement=Obj_Android_Driver.findElementByXPath("//*[contains(@content-desc,'Ayuda')]");
//			int x = objElement.getLocation().getX();
//			int y = objElement.getLocation().getY();
//			Obj_Android_Driver.tap(1, x-70, y+80,50);
			/*Thread.sleep(6000);		
			int x=Obj_Android_Driver.manage().window().getSize().getWidth();
			int y=Obj_Android_Driver.manage().window().getSize().getHeight();
			Obj_Android_Driver.tap(1, x+150,y-150, 50);*/
//			System.out.println(" **** PASEO ************** OK");
			
		}
		catch (Exception Obj_Error){
			funciones.toma_Evidencias(Obj_Android_Driver);
			System.out.println(" **** PASEO ************** FAIL");
		}
	}
	
	public void entrarAppCuenta(AndroidDriver<WebElement> Obj_Android_Driver,String Str_Contrasena,String Str_OTP,String Str_Numero_Telefono) throws InterruptedException, IOException{	
		System.out.println("**** Entra App Inicio **************");
		try 
		{
			Thread.sleep(10000);			
			//System.out.println("**** Buscar boton Entra y da click **************");
		    //Obj_Android_Driver.findElementByXPath("//*[contains(@content-desc,'Entra')]").click();
			//Obj_Android_Driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.view.View[2]/android.widget.Button[1]").click();
			
			//System.out.println("**** click---- 'Entra'---- OK **************");
	
			//System.out.println("**** Ingresar el Número de Celular **************");
			//Thread.sleep(3000);
			//Obj_Android_Driver.findElementByXPath("//*/android.widget.EditText").click();
			//System.out.println("**** CLICK en Número de Celular **************");
			//Thread.sleep(5000);
			//Obj_Android_Driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.widget.EditText[1]").sendKeys(Str_Numero_Telefono);
			//Thread.sleep(12000);

//			Obj_Android_Driver.findElementByXPath("//*/android.widget.EditText").sendKeys(Str_Numero_Telefono);
//			Obj_Android_Driver.findElement(By.className("android.widget.EditText")).sendKeys(Str_Numero_Telefono);
//			Obj_Android_Driver.findElementByXPath("//*[contains(@content-desc,'mero de celular') and @clickable='true']").sendKeys(Str_Numero_Telefono);
			
//			System.out.println("**** INGRESO Número de Celular OK **************");
			System.out.println("**** Buscando segundo botón Entra **************");
			Obj_Android_Driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[3]/android.widget.Button[1]").click();
			
			
//			file1 = funciones.esperarCambio(Obj_Android_Driver);
//			funciones.buscaElemento("//*[contains(@content-desc,'Entra') and @clickable='true']",Obj_Android_Driver);	

			System.out.println(" **** Entra ************** OK");
			Thread.sleep(6000);
//			file2 = funciones.esperarCambio(Obj_Android_Driver);
//			funciones.compara(file1,file2,Obj_Android_Driver);			
			file1 = funciones.esperarCambio(Obj_Android_Driver);
			funciones.contrasena(Str_Contrasena,Obj_Android_Driver);
			file2 = funciones.esperarCambio(Obj_Android_Driver);
			funciones.compara(file1,file2,Obj_Android_Driver);
			Thread.sleep(6000);
			file1 = funciones.esperarCambio(Obj_Android_Driver);
		//	System.out.println("------------------ CLICK EN LISTO ----------------------");
		//	funciones.buscaElemento("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[3]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.widget.Button[1]",Obj_Android_Driver);
		//	funciones.buscaElemento("//*[contains(@content-desc,'Listo!') and @clickable='true' and @focusable='true']",Obj_Android_Driver);
		//	Thread.sleep(6000);
				
//			//System.out.println(" **** Clic en Listo ************** OK");	
//			Thread.sleep(12000);
//			file2 = funciones.esperarCambio(Obj_Android_Driver);
//			funciones.compara(file1,file2,Obj_Android_Driver);
//			//** OTP
//			file1 = funciones.esperarCambio(Obj_Android_Driver);
//			funciones.ingresoOTP(Str_OTP,Obj_Android_Driver);
//			file2 = funciones.esperarCambio(Obj_Android_Driver);
//			funciones.compara(file1,file2,Obj_Android_Driver);
//			System.out.println(" **** Ingreso OTP ************** OK");
//			Thread.sleep(10000);
//			file1 = funciones.esperarCambio(Obj_Android_Driver);
			funciones.buscaElemento("//*[contains(@content-desc,'Reconocimiento facial') and @clickable='true' and @focusable='true']",Obj_Android_Driver);
			System.out.println(" **** Se Evidencia mensaje de Reconocimiento Facial ************** OK");
			file2 = funciones.esperarCambio(Obj_Android_Driver);
			funciones.compara(file1,file2,Obj_Android_Driver);
			
			Thread.sleep(5000);
			file1 = funciones.esperarCambio(Obj_Android_Driver);
			funciones.buscaElemento("//*[contains(@content-desc,'Ahora no')]",Obj_Android_Driver);
			file2 = funciones.esperarCambio(Obj_Android_Driver);
			funciones.compara(file1,file2,Obj_Android_Driver);
	
			System.out.println(" **** Click - Ahora no ************** OK");
			Thread.sleep(5000);

			System.out.println(" **** Pantalla de Tutorial ************** ");
			funciones.buscaElemento("//*[contains(@content-desc,'?')]",Obj_Android_Driver);
			//Obj_Android_Driver.findElementByXPath("//*[contains(@content-desc,'?')]").click();
			
//			int anch_pant = Obj_Android_Driver.manage().window().getSize().getWidth();
//			int alt_pant = Obj_Android_Driver.manage().window().getSize().getHeight();
//			file1 = funciones.esperarCambio(Obj_Android_Driver);
//			Obj_Android_Driver.tap(3, anch_pant/2, alt_pant/2, 1000);
//			Thread.sleep(2000);
//			Obj_Android_Driver.tap(1, anch_pant/2, alt_pant/2, 1000);

			System.out.println(" **** Clic en pantalla Tutorial ************** OK \n");

			}
			catch (Exception Obj_Error)
			{
				System.out.println(" **** Entra App ************** FAIL"+Obj_Error);
				funciones.toma_Evidencias(Obj_Android_Driver);
				Obj_Android_Driver.close();	
			}
			System.out.println(" **************************  Llegamos al HOME *******************************\n");
	}
	
	public void pedirVinculado(AndroidDriver<WebElement> Obj_Android_Driver,String Str_Numero_Amigo) throws IOException{
		System.out.println("********* Pedir plata vinculado ***********");
		String mensaje="";
		int[] coor = new int[2];
		try 
		{
			WebElement Obj_Elemento;
			funciones.abrirVelo(Obj_Android_Driver);
			file1 = funciones.esperarCambio(Obj_Android_Driver);
			funciones.buscaElemento("//*[contains(@content-desc,'Pide') and @clickable='true']",Obj_Android_Driver);
			System.out.println(" **** Clic en Pide ************** OK");
			file2 = funciones.esperarCambio(Obj_Android_Driver);
			funciones.compara(file1,file2,Obj_Android_Driver);
			
			try 
			{				

			Obj_Android_Driver.findElementByXPath("//*[contains(@content-desc,'Entendido') and @clickable='true']").click();
			System.out.println(" **** click en Entendido ************** OK");
			
			}catch (Exception Obj_Error){
				System.out.println("No se encuentra Entendido");
			}

			
			Obj_Android_Driver.findElementByXPath("//*/android.widget.EditText").click();
			System.out.println(" **** Click en contactos ************** OK");
		
			Thread.sleep(3000);	
			int x = Obj_Android_Driver.manage().window().getSize().getWidth();
			int tamY = Obj_Android_Driver.manage().window().getSize().getHeight();
			System.out.println("Tamaño en Y = "+tamY+" y en X es= "+x);
			Obj_Android_Driver.tap(1, x-50, tamY-40, 50);	
//			Obj_Elemento = Obj_Android_Driver.findElement(By.xpath("//*[contains(@content-desc,'Agregar')]"));				

//			int x=coor[0];
//			int y=coor[1];
//			Obj_Android_Driver.tap(1, x, y+(tamY*2), 50);	
			System.out.println(" **** Busqueda Agregar n?mero ************** OK");
			Thread.sleep(3000);
			
			Obj_Android_Driver.findElementByXPath("//*/android.widget.EditText").sendKeys(Str_Numero_Amigo);
			System.out.println(" **** Ingresar Número Amigo ************** OK "+Str_Numero_Amigo);
			Thread.sleep(3000);		
			
			funciones.buscaElemento("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[3]/android.view.View[2]/android.view.View[1]/android.view.View[3]/android.view.View[2]/android.view.View[2]/android.view.View[1]",Obj_Android_Driver);
			

//			file1 = funciones.esperarCambio(Obj_Android_Driver);
//			coor=funciones.buscaCoordenadas("//*[contains(@content-desc,'Datos')]",Obj_Android_Driver);

//			Obj_Elemento = Obj_Android_Driver.findElement(By.xpath("//*[contains(@content-desc,'Datos')]"));				
//			int tamY = Obj_Elemento.getSize().getHeight();
//			int x=coor[0];
//			int y=coor[1];
//			Obj_Android_Driver.tap(1, x, y+(tamY*2), 50);	
			Thread.sleep(5000);
			int tam_x = Obj_Android_Driver.manage().window().getSize().getWidth();
			coor=funciones.buscaCoordenadas("//*[contains(@content-desc,'Agregar')]",Obj_Android_Driver);
			int x1=coor[0];
			int y1=coor[1];
			Obj_Android_Driver.tap(1, x1, y1+40, 50);
//			Thread.sleep(4000);
//			List<WebElement> list= Obj_Android_Driver.findElements(By.xpath("//*/android.widget.EditText"));
//			list.get(list.size()-1).sendKeys(Str_Numero_Amigo);
//			Thread.sleep(3000);
//			funciones.buscaElemento("//*[contains(@content-desc,'+')]",Obj_Android_Driver);
//			Thread.sleep(3000);
			Obj_Elemento = Obj_Android_Driver.findElement(By.xpath("//*[contains(@content-desc,'Contactos')]"));
			int loc_Y2 = Obj_Elemento.getLocation().getY();
			Obj_Android_Driver.tap(1, tam_x-60, loc_Y2+30, 50);
			Thread.sleep(3000);
			Obj_Android_Driver.findElement(By.xpath("//*[contains(@content-desc,'$ 0')]")).sendKeys("1000");
			Thread.sleep(3000);
			funciones.buscaElemento("//*[contains(@content-desc,'Sigue')]",Obj_Android_Driver);
			Thread.sleep(3000);
			funciones.buscaElemento("//*[contains(@content-desc,'Pide')]",Obj_Android_Driver);
			Thread.sleep(8000);
			mensaje="fallo pedir";
			funciones.toma_Evidencias(Obj_Android_Driver);
			Obj_Elemento = Obj_Android_Driver.findElement(By.xpath("//*[contains(@content-desc,'Total')]"));
		}
		catch (Exception Obj_Error)
		{
			System.out.println(" ****  Pedir plata vinculado ************** FAIL " + mensaje);
			funciones.toma_Evidencias(Obj_Android_Driver);
		}	
	}
	
	public void pagarVinculado(String origen,AndroidDriver<WebElement> Obj_Android_Driver) throws IOException{
		System.out.println("****** Pagar *************");
		try 
		{
			funciones.abrirVelo(Obj_Android_Driver);
			Thread.sleep(10000);
			//Obj_Android_Driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[4]/android.view.View[1]/android.view.View[1]").click();
			//Obj_Android_Driver.findElementByXPath("//*[contains(@content-desc,'Paga') and @clickable='true']").click();
			funciones.buscaElemento("//*[contains(@content-desc,'Paga') and @clickable='true']", Obj_Android_Driver);
			System.out.println(" **** Clic en Pagar ************** OK");
			Thread.sleep(5000);
			funciones.escogerOrigen(origen,Obj_Android_Driver);
			Thread.sleep(4000);
		}
		catch (Exception Obj_Error)
		{
			System.out.println(" **** Pagar ************** FAIL");
			funciones.toma_Evidencias(Obj_Android_Driver);
		}
	}
	
	public void enviarVinculado(String origen,String Str_Contrasena,String Str_Numero_Amigo,AndroidDriver<WebElement> Obj_Android_Driver) throws IOException{
		System.out.println("********* Enviar vinculado ***********");
		String mensaje="";
		int[] coor = new int[2];
		try 
		{
			// ****************** Abre Velo de Transacciones *********************
			int tam_x = Obj_Android_Driver.manage().window().getSize().getWidth();
			funciones.abrirVelo(Obj_Android_Driver);
			Thread.sleep(10000);
			//Obj_Android_Driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[1]").click();
			Obj_Android_Driver.findElementByXPath("//*[contains(@content-desc,'Envía') and @clickable='true']").click();			
			Thread.sleep(5000);
			funciones.escogerOrigen(origen,Obj_Android_Driver);
			Thread.sleep(6000);
			Obj_Android_Driver.findElementByXPath("//*[contains(@content-desc,'Entendido') and @clickable='true']").click();
			System.out.println(" **** Entendido ************** OK");
			Thread.sleep(4000);
			coor=funciones.buscaCoordenadas("//*[contains(@content-desc,'Datos')]",Obj_Android_Driver);
			WebElement Obj_Elemento;
			Obj_Elemento = Obj_Android_Driver.findElement(By.xpath("//*[contains(@content-desc,'Datos')]"));				
			int tamY = Obj_Elemento.getSize().getHeight();
			int x=coor[0];
			int y=coor[1];
			Obj_Android_Driver.tap(1, x, y+(tamY*2), 50);
			Thread.sleep(4000);
			Obj_Android_Driver.findElement(By.xpath("//*/android.widget.EditText")).sendKeys(Str_Numero_Amigo);		
			Thread.sleep(4000);
			System.out.println(" **** asd ************** OK");
			Obj_Android_Driver.tap(1,tam_x/2,90, 0);
			Obj_Android_Driver.findElement(By.xpath("//*[contains(@content-desc,'$ 0')]")).sendKeys("1000");
			Thread.sleep(3000);
			Obj_Android_Driver.tap(1,tam_x/2,90, 0);
			Thread.sleep(3000);			
			Obj_Android_Driver.findElement(By.xpath("//*[contains(@content-desc,'Env')]")).click();
			Thread.sleep(3000);			
			funciones.buscaElemento("//*[contains(@content-desc,'Env') and @class='android.widget.Button']",Obj_Android_Driver);
			Thread.sleep(6000);			
			//********************************** Segunda Clave ********************
			for(int i=0; i<4; i++){
				Thread.sleep(1000);
				Obj_Android_Driver.tap(1, funciones.conx[i], funciones.cony[i], 0);
			}
			Thread.sleep(15000);
			mensaje="fallo Enviar";
			funciones.toma_Evidencias(Obj_Android_Driver);
			Obj_Android_Driver.findElementByXPath("//*[contains(@content-desc,'Tu cuenta')]");
			Thread.sleep(8000);
			coor=funciones.buscaCoordenadas("//*[contains(@content-desc,'Tu cuenta')]",Obj_Android_Driver);
			int x1=Obj_Android_Driver.manage().window().getSize().getWidth();
			int y1=coor[1];
			Obj_Android_Driver.tap(1, x1-60, y1+60, 50);
		}
		catch (Exception Obj_Error)
		{
			System.out.println(" **** Enviar vinculado ************** FAIL "+Obj_Error+" "+mensaje);
			funciones.toma_Evidencias(Obj_Android_Driver);
		}
	
	}
	
	public void sacarVinculado(String origen,AndroidDriver<WebElement> Obj_Android_Driver) throws IOException{
		String mensaje="";
		try 
		{
			funciones.abrirVelo(Obj_Android_Driver);
			Thread.sleep(5000);
			//Obj_Android_Driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[5]/android.view.View[1]/android.view.View[1]").click();
			Obj_Android_Driver.findElementByXPath("//*[contains(@content-desc,'Saca') and @clickable='true']").click();
			Thread.sleep(5000);
			funciones.escogerOrigen(origen,Obj_Android_Driver);
			Thread.sleep(6000);
			Obj_Android_Driver.findElementByXPath("//*[contains(@content-desc,'Cajero') and @clickable='true']").click();
			Thread.sleep(4000);
			//********************************** Segunda Clave ********************
			for(int i=0; i<4; i++){
				Thread.sleep(1000);
				Obj_Android_Driver.tap(1, funciones.conx[i], funciones.cony[i], 0);
			}
			Thread.sleep(8000);
			mensaje="fallo Enviar";
			funciones.toma_Evidencias(Obj_Android_Driver);
			Obj_Android_Driver.findElementByXPath("//*[contains(@content-desc,'Vence')]");
			System.out.println(" **** Flujo Sacar ************** OK");
			Thread.sleep(10000);
			funciones.buscaElemento("//*[contains(@content-desc,'Terminar')]",Obj_Android_Driver);
			Thread.sleep(3000);
		}
		catch (Exception Obj_Error)
		{
			System.out.println(" ****  Flujo Sacar ************** FAIL "+mensaje);
			funciones.toma_Evidencias(Obj_Android_Driver);
		}	
	}
	
	public void creaBolsillo(AndroidDriver<WebElement> Obj_Android_Driver,String Str_Nombre_Bolsillo) throws IOException{
		String mensaje="";
		try {
			Thread.sleep(2000);
			WebElement Obj_Elemento;
			funciones.buscaElemento("//*[@content-desc='Bolsillos']",Obj_Android_Driver);	
			Thread.sleep(5000);	
			funciones.buscaElemento("//*[@content-desc='bolsillo_icono_bolsillonuevo']",Obj_Android_Driver);
			System.out.println(" **** Clic Crear Bolsillo ************** OK");	
			Thread.sleep(1000);			
			Obj_Android_Driver.findElement(By.xpath("//*/android.widget.EditText")).sendKeys(Str_Nombre_Bolsillo);
			Thread.sleep(1000);
			Obj_Android_Driver.findElementByXPath("//*[contains(@text,'$ 0')]").sendKeys("1000");							
			Thread.sleep(2000);
			int tam_x = Obj_Android_Driver.manage().window().getSize().getWidth();
			Obj_Android_Driver.tap(1,tam_x/2,90, 0);
			Thread.sleep(2000);
			Obj_Elemento = Obj_Android_Driver.findElement(By.xpath("//*[contains(@content-desc,'Crea un bolsillo')]"));
			int loc_Y2 = Obj_Elemento.getLocation().getY();
			Obj_Android_Driver.tap(1, tam_x-60, loc_Y2+30, 50);
			Thread.sleep(8000);
			mensaje="fallo Enviar";
			funciones.toma_Evidencias(Obj_Android_Driver);
			Obj_Android_Driver.findElementByXPath("//*[contains(@content-desc,'bolsillo_icono_bolsillonuevo')]");

		}
		catch (Exception Obj_Error)
		{
			System.out.println(" ****  Crea Bolsillo ************** FAIL "+mensaje);
			funciones.toma_Evidencias(Obj_Android_Driver);
		}	
	}
	
	public void crudBolsillo(String accion,AndroidDriver<WebElement> Obj_Android_Driver,String Str_Nombre_Bolsillo,String Str_Nombre2_Bolsillo) throws IOException{
			try {
				funciones.buscaElemento("//*[@content-desc='Bolsillos']",Obj_Android_Driver);	
				Thread.sleep(7000);				
				funciones.opEditarBol(Str_Nombre_Bolsillo,Obj_Android_Driver);
				switch (accion) 
				{ 			
						case "editar": funciones.editaBolsillo(Obj_Android_Driver,Str_Nombre2_Bolsillo); 
						break; 
						case "eliminar": funciones.eliminaBolsillo(Obj_Android_Driver,Str_Nombre_Bolsillo); 
						break;
				}
			} catch (Exception e) {
				System.out.println("**** CRUD BOLSILLO FAIL *******" + e);
				funciones.toma_Evidencias(Obj_Android_Driver);
			}	
		}
	
	public void crearMeta(AndroidDriver<WebElement> Obj_Android_Driver,String Str_Nombre_Meta) throws IOException{
		System.out.println("***** Crear Meta **********");
		String mensaje="";
		try {
			Thread.sleep(2000);
			funciones.buscaElemento("//*[@content-desc='Metas']",Obj_Android_Driver);	
			Thread.sleep(5000);	
			// ******* click en + para crear nueva Meta *****
			file1 = funciones.esperarCambio(Obj_Android_Driver);
//			buscaElemento("//*[@content-desc='?' and @clickable='true']");
			
			List<WebElement> list= Obj_Android_Driver.findElements(By.xpath("//*/android.view.View/android.view.View/android.view.View/android.widget.Button"));
			int Dbl_X = list.get(1).getLocation().getX();
			System.out.println(Dbl_X);
			int Dbl_Y = list.get(1).getLocation().getY();
			System.out.println(Dbl_Y);
			Obj_Android_Driver.tap(1, Dbl_X+50, Dbl_Y+50, 100);
			System.out.println(" **** Tap en + (Nuevo)  ************** OK");
			file2 = funciones.esperarCambio(Obj_Android_Driver);
			funciones.compara(file1,file2,Obj_Android_Driver);
			Thread.sleep(5000);

			int anch_pant = Obj_Android_Driver.manage().window().getSize().getWidth();

			file1 = funciones.esperarCambio(Obj_Android_Driver);
			Obj_Android_Driver.findElement(By.xpath("//*/android.widget.EditText")).sendKeys(Str_Nombre_Meta);
			file2 = funciones.esperarCambio(Obj_Android_Driver);
			funciones.compara(file1,file2,Obj_Android_Driver);
			System.out.println(" **** Ingresa el Nombre de la Meta ************** OK");
			Thread.sleep(2000);
			
			// ******* Monto de la Meta *****
			Obj_Android_Driver.tap(1,anch_pant/2,90, 0);
			Thread.sleep(2000);
		
			Obj_Android_Driver.findElementByXPath("//*[contains(@text,'$ 0') and @clickable='true']").sendKeys("200000");
			Thread.sleep(2000);
			System.out.println(" **** Ingresa el Monto de la Meta ************** OK");
			Obj_Android_Driver.tap(1,anch_pant/2,90, 0);
			Thread.sleep(2000);

			// ******* diligencia campo Fecha *****
			Thread.sleep(2000);
			Obj_Android_Driver.findElementByXPath("//*[contains(@content-desc,'Fecha límite') and @clickable='true']").click();
			funciones.toma_Evidencias(Obj_Android_Driver);
			Thread.sleep(2000);

			System.out.println(" **** Encuentra Campo Fechas ************** OK");

			//***************************************** Ingreso de mes *****************************	
			WebElement mes = Obj_Android_Driver.findElement(By.xpath("//*[@resource-id='android:id/month']"));
			mes.sendKeys("Sep");
			System.out.println(" **** ingresa el mes ************** OK");
			//***************************************** Ingreso de día *****************************	
			WebElement dia = Obj_Android_Driver.findElement(By.xpath("//*[@resource-id='android:id/day']"));
			dia.sendKeys("25");
			System.out.println(" **** Ingresa el día ************** OK");
			//***************************************** Ingreso de año *****************************	
			WebElement anio = Obj_Android_Driver.findElement(By.xpath("//*[@resource-id='android:id/year']"));
			anio.sendKeys("2018");
			System.out.println(" **** Ingresa el año ************** OK");
						
			System.out.println(" **** Ingresa la Fecha de la Meta ************** OK");
			
			Thread.sleep(2000);
			Obj_Android_Driver.findElement(By.xpath("//*[@resource-id='android:id/button1' and @text='Set']")).click();
	
			// ******* click en el Chulito *****
			
			List<WebElement> list2= Obj_Android_Driver.findElements(By.xpath("//*/android.view.View/android.view.View/android.view.View/android.widget.Button"));
			int Dbl_X_4 = list2.get(1).getLocation().getX();
			System.out.println(Dbl_X_4);
			int Dbl_Y_4 = list2.get(1).getLocation().getY();
			System.out.println(Dbl_Y_4);
			Obj_Android_Driver.tap(1, Dbl_X_4, Dbl_Y_4, 100);
			System.out.println(" **** Creación de Meta - FIN ************** OK");
			Thread.sleep(8000);
			mensaje="Fallo";
			funciones.toma_Evidencias(Obj_Android_Driver);
			Obj_Android_Driver.findElementByXPath("//*[contains(@content-desc,'Metas')]");

		}
		catch (Exception Obj_Error)
		{
			System.out.println(" ****  Creación de Meta ************** FAIL "+mensaje);
			funciones.toma_Evidencias(Obj_Android_Driver);
		}	
	}
	
	public void crudMeta(String accion,AndroidDriver<WebElement> Obj_Android_Driver,String Str_Nombre_Meta) throws IOException{
		try {
			Thread.sleep(4000);
			funciones.buscaElemento("//*[@content-desc='Metas']",Obj_Android_Driver);	
			Thread.sleep(5000);				
			//opSelMeta(Str_Nombre_Meta);
			funciones.buscaElemento("//*[@content-desc='Dsa']",Obj_Android_Driver);
			switch (accion) 
			{ 			
					case "editar": funciones.editaMeta(Obj_Android_Driver); 
					break;
					case "completar": funciones.completaMeta(Obj_Android_Driver,Str_Nombre_Meta); 
					break; 
					case "romper": funciones.rompeMeta(Obj_Android_Driver); 
					break;
			}
		} catch (Exception e) {
			System.out.println("**** CRUD Meta FAIL *******" + e);
			funciones.toma_Evidencias(Obj_Android_Driver);
		}	
	}

	public void recargaCelular(String origen,AndroidDriver<WebElement> Obj_Android_Driver,String Str_Numero_celrec) throws IOException{
		System.out.println("********* Recarga de Celular ***********");

		try 
		{
			
			funciones.abrirHerramientas(Obj_Android_Driver);
			System.out.println("************************* Pantalla Herramientas  ******************************");
			Thread.sleep(3000);
			funciones.buscaElemento("//*[contains(@content-desc,'Entendido') and @clickable='true']",Obj_Android_Driver);
			System.out.println(" **** Entendido ************** OK");
			Thread.sleep(5000);
			//funciones.buscaElemento("//*/android.view.View[contains(@content-desc,'Recarga de celular') and @clickable='true']",Obj_Android_Driver);

			List<WebElement> herramientas = Obj_Android_Driver.findElements(By.xpath("//*/android.widget.ListView/android.view.View/android.view.View"));
			herramientas.get(0).click();
			
			System.out.println(" **** Clic en botón de Recarga de Celular ************** OK");
			Thread.sleep(5000);
			int x=Obj_Android_Driver.manage().window().getSize().getWidth();
			int y=Obj_Android_Driver.manage().window().getSize().getHeight();
			System.out.println(" **** aca1 ************** OK");
			Obj_Android_Driver.tap(1, x-150,y-200, 50);
			System.out.println(" **** aca ************** OK");
			Thread.sleep(8000);
			funciones.escogerOrigen(origen,Obj_Android_Driver);
			System.out.println(" **** escoje el origen ************** OK");
			Thread.sleep(12000);
			funciones.buscaElemento("//*[contains(@content-desc,'Entendido') and @clickable='true']",Obj_Android_Driver);
			System.out.println(" **** Entendido ************** OK");	
			Thread.sleep(3000);
			funciones.buscaElemento("//*[contains(@content-desc,'Operador') and @clickable='true']",Obj_Android_Driver);
			System.out.println(" **** Seleccionar Operador ************** OK");
			Thread.sleep(5000);			
			List <WebElement> Operadores;
			Operadores= Obj_Android_Driver.findElements(By.xpath("//*/android.widget.ListView/android.view.View"));
			Operadores.get(1).click();
			System.out.println(" **** Seleccionar Claro ************** OK");				
			Thread.sleep(5000);			
			Obj_Android_Driver.findElement(By.xpath("//*/android.widget.EditText")).sendKeys(Str_Numero_celrec);
			System.out.println(" **** Número de Celular a Recargar  ************** OK");
			Thread.sleep(5000);		
			Obj_Android_Driver.findElement(By.xpath("//*[contains(@text,'$ 0')]")).sendKeys("2000");
			System.out.println(" **** Valor a Recargar  ************** OK");
			Thread.sleep(5000);			
			int tam_x = Obj_Android_Driver.manage().window().getSize().getWidth();
			Obj_Android_Driver.tap(1,tam_x/2,90, 0);
			Thread.sleep(3000);			
			funciones.buscaElemento("//*[contains(@content-desc,'Recarga') and @class='android.widget.Button']",Obj_Android_Driver);
			System.out.println(" **** Recarga Button ************** OK");	
			Thread.sleep(3000);
			
			
			for(int i=0; i<4; i++)
			{
				Thread.sleep(1000);
				Obj_Android_Driver.tap(1, funciones.conx[i], funciones.cony[i], 0);
			}
		}	
			
		catch (Exception Obj_Error)
		{
			System.out.println(" ****  Recarga de Celular ************** FAIL ");
			funciones.toma_Evidencias(Obj_Android_Driver);
		}	
	
	}
			
	public void recargaDirecTVPrepago(String origen,AndroidDriver<WebElement> Obj_Android_Driver,String Str_Numero_celrec) throws IOException
	
	{
		System.out.println("********* Recarga de DirectTV Prepago ***********");	
		
		
			try 
			{
				funciones.abrirHerramientas(Obj_Android_Driver);
				System.out.println("************************* Pantalla Herramientas  ******************************");
				Thread.sleep(3000);
	
				funciones.buscaElemento("//*[contains(@content-desc,'Entendido') and @clickable='true']",Obj_Android_Driver);
				System.out.println(" **** Entendido ************** OK");
				Thread.sleep(5000);
	
				List<WebElement> herramientas = Obj_Android_Driver.findElements(By.xpath("//*/android.widget.ListView/android.view.View"));
				//herramientas.get(1).click();					
				int x=herramientas.get(1).getLocation().getX();
				int y=herramientas.get(1).getLocation().getY();				
				Obj_Android_Driver.tap(1, x+100, y+100, 50);
				System.out.println(" **** Clic en botón de Recarga DirecTV ************** OK");
				Thread.sleep(5000);
				int ancho=Obj_Android_Driver.manage().window().getSize().getWidth();
				int largo=Obj_Android_Driver.manage().window().getSize().getHeight();
				Obj_Android_Driver.tap(1, ancho-150,largo-200, 50);
				System.out.println(" **** Aceptar ************** OK");
				Thread.sleep(5000);
				funciones.escogerOrigen(origen,Obj_Android_Driver);
				System.out.println(" **** escoje el origen ************** OK");
				Thread.sleep(5000);
				funciones.buscaElemento("//*[contains(@content-desc,'Entendido') and @clickable='true']",Obj_Android_Driver);
				System.out.println(" **** Entendido ************** OK");	
				Thread.sleep(3000);
				Obj_Android_Driver.findElement(By.xpath("//*/android.widget.EditText")).sendKeys("000666369343");
				System.out.println(" **** Número de Celular a Recargar  ************** OK");
				Thread.sleep(5000);	
				Obj_Android_Driver.findElement(By.xpath("//*[contains(@text,'$ 0')]")).sendKeys("20000");
				System.out.println(" **** Valor a Recargar  ************** OK");
				Thread.sleep(5000);
				int tam_x = Obj_Android_Driver.manage().window().getSize().getWidth();
				Obj_Android_Driver.tap(1,tam_x/2,90, 0);
				Thread.sleep(3000);
				funciones.buscaElemento("//*[contains(@content-desc,'Enviar') and @class='android.widget.Button']",Obj_Android_Driver);
				System.out.println(" **** Enviar Button ************** OK");	
				Thread.sleep(8000);				
				funciones.buscaElemento("//*[contains(@content-desc,'Recargar') and @class='android.widget.Button']",Obj_Android_Driver);
				System.out.println(" **** Enviar Recargar ************** OK");	
				Thread.sleep(8000);
				
				for(int i=0; i<4; i++)
				{
					Thread.sleep(1000);
					Obj_Android_Driver.tap(1, funciones.conx[i], funciones.cony[i], 0);
				}
			}
			catch (Exception Obj_Error)
			{
				System.out.println(" ****  Recarga de DirecTV  ************** FAIL ");
				funciones.toma_Evidencias(Obj_Android_Driver);
			}
			
		}
	}

