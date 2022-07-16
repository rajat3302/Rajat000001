package script;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutility2
{

	public static String getdata(String path1, int rowno, int colno)
	{
		String value="";
		try 
		{
			 FileInputStream fis = new FileInputStream(path1);
			 XSSFWorkbook wb = new XSSFWorkbook(fis);
			 XSSFSheet sheet=wb.getSheetAt(0);
			 value =sheet.getRow(rowno).getCell(colno).getStringCellValue();
		} 
		catch (Exception e)
		{
			System.out.println("issue in getdata"+e);
	    }
		return value;
 }
}

