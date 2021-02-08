package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reader {
	

	public static void main(String[] args) throws IOException
	{
		File f=new File("C:\\Users\\Sangavi\\Desktop\\Excel\\Withexcelsheet.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook xsf=new XSSFWorkbook(fis);
		XSSFSheet sh=xsf.getSheet("Sheet1");
		String str=sh.getRow(10).getCell(0).getStringCellValue();
		System.out.println(str);
		int s= sh.getLastRowNum()+1;
		System.out.println(s);
		
		
	}

}
