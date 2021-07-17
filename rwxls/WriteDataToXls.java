package com.rcv.rwxls;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataToXls {

	public static void main(String[] args) throws Exception {

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet1 = workbook.createSheet("Sheet1");
		Row r0 = sheet1.createRow(0);
		Cell c0 = r0.createCell(0);
		c0.setCellValue("Test1");
		
		File f = new File("F:\\eclipse-workspace\\JavaExcel\\src\\com\\rcv\\data\\sample.xls");
		FileOutputStream fos = new FileOutputStream(f);
		workbook.write(fos);
		fos.close();
		workbook.close();
		System.out.println("FileCreated");
		

	}

}
