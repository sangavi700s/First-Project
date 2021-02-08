package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xslf.usermodel.XSLFSheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	
	File f;
	FileInputStream fis;
	XSSFWorkbook xsf;
	XSSFSheet sh;
	
	public Excel(String excelpath) throws IOException
	{
		f= new File(excelpath);
		fis=new FileInputStream(f);
		xsf=new XSSFWorkbook(fis);
	}
	public String getsheet(String sheetname,int row,int col)
	{
		   sh = xsf.getSheet(sheetname);
		   String str = sh.getRow(row).getCell(col).getStringCellValue();
		   return str;
		
	}

	   public int getRows(String sheetname)
	   {
		   sh = xsf.getSheet(sheetname);
		   int s = sh.getLastRowNum();
		   s=s+1;
		   return s;
	   }
	   
	   public int getCells(String sheetname)
	   {
		   sh = xsf.getSheet(sheetname);
		   short t= sh.getRow(0).getLastCellNum();
		   return t;
	   }


}
