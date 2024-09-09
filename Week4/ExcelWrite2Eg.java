package com.exceleg;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import java.io.*;


public class ExcelWrite2Eg {
	 
	static String sarr[][] = {{"dffd", "fgdgd", "dfgg"}, {"ffsg", "gdgg", "ggdg"}};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		
		Workbook wbook = new XSSFWorkbook();
		Sheet st = wbook.createSheet("First Sheet");

		for (int i=0; i<sarr.length; i++) {
			Row row = st.createRow(i);
			for (int j=0; j<sarr[0].length; j++) {
				Cell cell = row.createCell(j);
				cell.setCellValue(sarr[i][j]);
				System.out.println(sarr[i][j] + "\t");
			}
			System.out.println();			
		}
		
		FileOutputStream fos = new FileOutputStream("../../secondexcel.xlsx");
		}catch (Exception et) {
			et.printStackTrace();
		}
		
	}

}
