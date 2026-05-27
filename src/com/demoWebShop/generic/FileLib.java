package com.demoWebShop.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	
	public String readDataFromProperty(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./data/commandata.properties");
		Properties property=new Properties();
		property.load(fis);
		String data = property.getProperty(key);
		fis.close();
		return data;
	}
	
	public String readDataFromExcel(String sheetName, int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		wb.close();
		fis.close();
		return data;
		
	}
	
	public void writeDataInExcel(String sheetName, int rowIndex,int cellIndex,String value) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetName).getRow(rowIndex).createCell(cellIndex).setCellValue(value);
		FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
		wb.write(fos);
		wb.close();
		fos.close();
		fis.close();
	}

}
