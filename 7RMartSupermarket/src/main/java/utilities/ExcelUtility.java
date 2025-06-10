package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constants.Constant;

public class ExcelUtility 
{
	static FileInputStream f;// to read the file
	static XSSFWorkbook wb;//to fetch the details from the workbook
	static XSSFSheet   sh;//to fetch the details from the sheet

	public static String getStringData(int a , int b, String sheet) throws IOException
	{
		f=new FileInputStream(Constant.TESTDATAFILE);
		wb= new XSSFWorkbook(f);
		sh=wb.getSheet(sheet);// to get the details from the list, getSheet is used
		XSSFRow r =sh.getRow(a);// to get the row from the sheet , getRow is used
		XSSFCell c = r.getCell(b);//to get the cell details from the sheet, getCell is used
		return c.getStringCellValue();// return as string value
		
	}
	
	public static String getIntegerData(int a , int b, String sheet) throws IOException
	{
		f=new FileInputStream(Constant.TESTDATAFILE);
		wb= new XSSFWorkbook(f);
		sh=wb.getSheet(sheet);// to get the details from the list, getSheet is used
		XSSFRow r =sh.getRow(a);// to get the row from the sheet , getRow is used
		XSSFCell c = r.getCell(b);//to get the cell details from the sheet, getCell is used
		int d = (int)c.getNumericCellValue();// to take the numeric value
		return String.valueOf(d); // return as string value
		
	}
	public static String getFloatData(int a , int b, String sheet) throws IOException
	{
		f = new FileInputStream(Constant.TESTDATAFILE);
		wb = new XSSFWorkbook(f);
		sh = wb.getSheet(sheet);
		XSSFRow r = sh.getRow(a);
		XSSFCell c = r.getCell(b);
		float d = (float)c.getNumericCellValue();
		return String.valueOf(d);
	}

}
