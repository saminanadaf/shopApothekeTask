package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//This code is to read test data from excel file

/*
public class ReadXLSData {
	
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	ReadXLSData red= new ReadXLSData();
	red.getData("login");
}


	public void getData(String excelSheetName) throws EncryptedDocumentException, IOException {
		File f= new File(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\testdata.xlsx");
		FileInputStream fis= new FileInputStream(f);
		Workbook wb= WorkbookFactory.create(fis);
		
		Sheet sheetName=(Sheet) wb.getSheet(excelSheetName);
		int totalrows= ((org.apache.poi.ss.usermodel.Sheet) sheetName).getLastRowNum();
		System.out.println(totalrows);
		Row rowCells=((org.apache.poi.ss.usermodel.Sheet) sheetName).getRow(0);
}
}
*/