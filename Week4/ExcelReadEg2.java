package com.exceleg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

public class ExcelReadEg2 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		//open file
		FileInputStream fis = new FileInputStream("./firstexcel.xlsx");
		
		//read workbook
		Workbook wbook = new XSSFWorkbook(fis);
		
		System.out.println("No of sheets "+wbook.getNumberOfSheets());
		
		int no_of_sheets = wbook.getNumberOfSheets();
		System.out.println(no_of_sheets);
		
		for(int k=0; k< no_of_sheets; k++) {
	
		//read sheet
		Sheet st =wbook.getSheetAt(0);
		
		int no_of_rows = st.getPhysicalNumberOfRows();
		
		System.out.println(no_of_rows);
		
		for(int i=0; i<no_of_rows; i++) {		
		
		//read rows
		Row row = st.getRow(0);
		 int no_of_cols = row.getLastCellNum();
		 
		 for(int j=0; j< no_of_cols; j++) {		 
		 
		 
		//read cells
		Cell cell = row.getCell(0);
		
		System.out.println(cell.getStringCellValue());
		
		 }
		}
		}
		
		wbook.close();
		fis.close();		
		
	}

}
