package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testinrbabascript
{

	public static void main(String[] args) throws InterruptedException 
	{
		String path="D:\\Users\\rs47956\\eclipse-workspace\\1june_newautomation_batch\\exceldata.xlsx";
         WebDriver driver =new ChromeDriver();
         driver.get("http://testingbaba.com/index.html");
         driver.manage().window().maximize();
         driver.findElement(By.xpath("//*[@id=\"myModal2\"]/div/div/div[1]/button")).click();
         driver.findElement(By.xpath("//*[text()='Practice']")).click();
         driver.findElement(By.xpath("//*[@data-target=\"#elements\"]")).click();
         driver.findElement(By.xpath("//*[text()='text box']")).click();
         driver.findElement(By.xpath("//*[@id=\"fullname1\"]")).sendKeys( Excelutility1.getreaddata(path, 1, 0));
         driver.findElement(By.xpath("//*[@id=\"fullemail1\"]")).sendKeys(Excelutility1.getreaddata(path, 1, 1));
         driver.findElement(By.xpath("//*[@id=\"fulladdresh1\"]")).sendKeys(Excelutility1.getreaddata(path, 1, 2));
         driver.findElement(By.xpath("//*[@id=\"paddresh1\"]")).sendKeys(Excelutility1.getreaddata(path, 1, 3));
         driver.findElement(By.xpath("//*[@id=\"tab_1\"]/div/div[1]/form/input[3]")).click();
         driver.findElement(By.xpath("//*[text()='check box']")).click();
          WebElement iframecheckbox =driver.findElement(By.xpath("//*[@id=\"tab_2\"]/div/iframe")); 
         driver.switchTo().frame(iframecheckbox);  
         Thread.sleep(2000);
         driver.findElement(By.xpath("//*[@id=\"myCheck\"]")).click();
         driver.findElement(By.xpath("//*[@id=\"mylaptop\"]")).click();
         driver.findElement(By.xpath("//*[@id=\"mydesktop\"]")).click();
         String text =driver.findElement(By.xpath("//*[@id=\"text\"]")).getText();  
         System.out.println(text);
         
         driver.switchTo().defaultContent();
         
        driver.findElement(By.xpath("//*[text()='radio buttons']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"yes\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"impressive\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"no\"]")).click();
        
        String path1="D:\\Users\\rs47956\\eclipse-workspace\\1june_newautomation_batch\\testdata2.xlsx";
        driver.findElement(By.xpath("//*[text()='web tables']")).click();
        
        WebElement iframecheckbox1 =driver.findElement(By.xpath("//*[@id=\"tab_4\"]/div/iframe")); 
        driver.switchTo().frame(iframecheckbox1);
        
        driver.findElement(By.xpath("/html/body/div/form/div[1]/input")).sendKeys(Excelutility2.getdata(path1, 1, 0));
        driver.findElement(By.xpath("/html/body/div/form/div[2]/input")).sendKeys(Excelutility2.getdata(path1, 1, 1));
        driver.findElement(By.xpath("/html/body/div/form/button")).click();
        driver.findElement(By.xpath("/html/body/div/form/div[1]/input")).sendKeys(Excelutility2.getdata(path1, 2, 0));
        driver.findElement(By.xpath("/html/body/div/form/div[2]/input")).sendKeys(Excelutility2.getdata(path1, 2, 1));
        driver.findElement(By.xpath("/html/body/div/form/button")).click();
        driver.findElement(By.xpath("/html/body/div/form/div[1]/input")).sendKeys(Excelutility2.getdata(path1, 3, 0));
        driver.findElement(By.xpath("/html/body/div/form/div[2]/input")).sendKeys(Excelutility2.getdata(path1, 3, 1));
        driver.findElement(By.xpath("/html/body/div/form/button")).click();
        driver.findElement(By.xpath("/html/body/div/form/div[1]/input")).sendKeys(Excelutility2.getdata(path1, 4, 0));
        driver.findElement(By.xpath("/html/body/div/form/div[2]/input")).sendKeys(Excelutility2.getdata(path1, 4, 1));
        driver.findElement(By.xpath("/html/body/div/form/button")).click();
        driver.findElement(By.xpath("/html/body/div/form/div[1]/input")).sendKeys(Excelutility2.getdata(path1, 5, 0));
        driver.findElement(By.xpath("/html/body/div/form/div[2]/input")).sendKeys(Excelutility2.getdata(path1, 5, 1));
        driver.findElement(By.xpath("/html/body/div/form/button")).click();
        
         
         
	}
	
}
