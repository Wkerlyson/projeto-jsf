package web3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsuarioTest {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wkerl\\Desktop\\Selenium WebDrive\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:8080/web3/usuarios.xhtml");
		
		driver.findElement(By.id("cNome")).sendKeys("Wkerlyson");
		
		driver.findElement(By.id("cSobrenome")).sendKeys("Batista");

		driver.findElement(By.id("cCidade")).sendKeys("Ocaras");
		
		
		driver.findElement(By.id("cTelefone")).sendKeys("88 9 8888-9922");
		

		driver.findElement(By.name("adicionar")).click();
//		
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		driver.close();
		
		driver.quit();
		
		
	}
}
