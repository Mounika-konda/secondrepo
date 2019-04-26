package Newlearning;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelReader

{
	
	public static void main( String[] args ) throws Exception, InvalidFormatException, IOException
{
	 
	 Workbook workbook;
	
	File f1=new File("D:\\excel\\book1.xls");
	
	 FileInputStream fip=new FileInputStream(f1);
	  workbook=WorkbookFactory.create(fip);
	 
	 
			 Sheet sheet = workbook.getSheet("mouni");
			 

			Row row=sheet.getRow(2);
			Cell cell=row.getCell(3);
			Object data=cell.getNumericCellValue();
			
		Object data1=workbook.getSheet("mouni").getRow(2).getCell(1).getNumericCellValue();
		System.out.println(data1);
		
		workbook.getSheet("mouni").createRow(2).createCell(5).setCellValue("rajitha");
		workbook.write(new FileOutputStream("D:\\\\excel\\\\book1.xls"));
		workbook.getSheet("mouni").createRow(3).createCell(5).setCellValue("harshita");
		workbook.write(new FileOutputStream("D:\\\\excel\\\\book1.xls"));
		
		
		
}		
			
	
	
}
