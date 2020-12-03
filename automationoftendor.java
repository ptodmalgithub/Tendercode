package QAAutomation;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationoftendor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://prefeitura.pbh.gov.br/saude/licitacao/pregao-eletronico-151-2020");
	
		driver.findElement(By.xpath("//img[@alt='Inglês']")).click();
		driver.manage().window().maximize();
		
		WebElement Objective=driver.findElement(By.xpath("//font[contains(text(),'Price Registration for a period of 12 months, for the purchase of galvanized clamps.')]"));
		
		Objective.getAttribute("value");
		System.out.println("Objective is:"+Objective);
		
		//Close Date
		//*[@id="block-views-block-view-noticia-pbh-block-5"]/div/div/div/div/div/div[2]/span/span[6]/font/font
		 // Create object of SimpleDateFormat class and decide the format
		 DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
		 
		 //get current date time with Date()
		 Date date = new Date(0, 0, 0);
		 
		 // Now format the date
		 String date1= dateFormat.format(date);
		 
		 // Print the Date
		 System.out.println(date1);
		 


		
		
		
		
		
	}
}