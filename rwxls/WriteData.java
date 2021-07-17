package com.rcv.rwxls;

import java.io.FileNotFoundException;

import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet1 = workbook.createSheet("TestSheet");
		String[] columnHeading = {"ID", "Name", "Role", "Age"};
		Row headerRow = sheet1.createRow(0);
		
		for(int i=0;i<columnHeading.length;i++)
		{
			Cell cell = headerRow.createCell(i);
			cell.setCellValue(columnHeading[i]);
		}
		
		ArrayList<Employee> a = createData();
		
		int rownum = 1;
		for(Employee e : a)
		{
			Row row = sheet1.createRow(rownum++);
			row.createCell(0).setCellValue(e.getID());
			row.createCell(1).setCellValue(e.getName());
			row.createCell(2).setCellValue(e.getRole());
			row.createCell(3).setCellValue(e.getAge());
			
		}
		FileOutputStream fos = new FileOutputStream("F:\\eclipse-workspace\\JavaExcel\\src\\com\\rcv\\data\\Test.xls");
		workbook.write(fos);
		fos.close();
		workbook.close();
		
		System.out.println("completed");
				
		
		
	}

	private static ArrayList<Employee> createData() {
		ArrayList<Employee> a = new ArrayList();
		a.add(new Employee("001", "abc", "PAT", "22"));
		a.add(new Employee("002", "def", "PA", "24"));
		a.add(new Employee("003", "ghi", "A", "27"));
		a.add(new Employee("004", "jkl", "SA", "30"));
		
		return a;
	}

}
