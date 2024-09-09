package com.exceleg;

import java.io.*;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelReadEgCheck {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// open file
		FileInputStream fis = new FileInputStream("./firstexcel.xlsx");

		// read workbook
		Workbook wbook = new XSSFWorkbook(fis);

		System.out.println("No. of sheets" + wbook.getNumberOfSheets());

		int no_of_sheets = wbook.getNumberOfSheets();
		
		double value = 0;

		int no_of_rows = 0;
		Sheet st = null;
		for (int k = 0; k < no_of_sheets; k++) {
			// read sheet
			st = wbook.getSheetAt(k);

			no_of_rows = st.getPhysicalNumberOfRows();

			for (int i = 0; i < no_of_rows; i++) {
				// read rows
				Row row = st.getRow(i);

				int no_of_cols = row.getLastCellNum();

				for (int j = 0; j < no_of_cols; j++) {
					// read cells
					Cell cell = row.getCell(j);

					value = value + cell.getNumericCellValue();
				}
			}
		}
		System.out.println("sum is "+value);
		
		fis.close();
		

		FileOutputStream fos = new FileOutputStream("./firstexcel.xlsx");
		
		Row row = st.createRow(no_of_rows);
		System.out.println("Created row..."+(no_of_rows));
		Cell cell = row.createCell(0);
		cell.setCellValue(value);

       //get value in Cell 1B(row-0, cell-1)
		
		Row row9 = st.getRow(0);
		Cell cell9 = row9.getCell(1);
		Double iter = cell9.getNumericCellValue();
		
		//add 1//step 2
		iter++;
		
		//set above incremented value in Cell 1B//step 3

		wbook.write(fos);
		
		fos.close();

	}
}


       //get value in cell