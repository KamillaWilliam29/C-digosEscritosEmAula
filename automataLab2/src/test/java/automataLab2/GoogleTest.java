package automataLab2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
	private WebDriver driver;
	private String URL_BASE = "https://google.com";
	private String PATH_DRIVE="C:\\projetos\\automataLab2\\src\\test\\resources\\chromedriver.exe";
	
	private void Iniciar() {
		System.setProperty("webdriver.chrome.driver", PATH_DRIVE);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL_BASE);
	}
	
	@Test
	public void pesquisarNoGoogle() {
			//Montagem de Cenário
		
			Iniciar();
		
			//Preparação
			WebElement inputPesquisa = driver.findElement(By.name("q"));
			//Execução
			inputPesquisa.sendKeys("Jogo do Brasil" + Keys.ENTER);
			
			String resultado = driver.findElement(By.id("result-stats")).getText();
			//Verificação e Análise
			assertTrue(resultado, resultado.contains("Aproximadamente"));
			
	}
}
