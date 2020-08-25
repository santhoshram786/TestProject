package com.defects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class list1 {
	public static void main(String args[]) throws InvalidFormatException, IOException
	{
	
	    File file = new File("C:\\\\softwares\\\\bug_fix.xlsx");
	    XSSFWorkbook workbook = new XSSFWorkbook(file);
	    XSSFSheet sheet = workbook.getSheetAt(1);
	    int rowcount = sheet.getLastRowNum()- sheet.getFirstRowNum();
	    System.out.println("Total row number: "+rowcount);
	    for(int i=1; i<rowcount+1; i++){
	        //Create a loop to get the cell values of a row for one iteration
	        Row row = sheet.getRow(i);
	        List<String> arrName = new ArrayList<String>();
	        for(int j=0; j<row.getLastCellNum(); j++){
	            // Create an object reference of 'Cell' class
	            Cell cell = row.getCell(j);
	            // Add all the cell values of a particular row
	            arrName.add(cell.getStringCellValue());
	            }
	        System.out.println(arrName);
	        System.out.println("Size of the arrayList: "+arrName.size());
	        // Create an iterator to iterate through the arrayList- 'arrName'
	        Iterator<String> itr = arrName.iterator();
	        while(itr.hasNext()){
	            System.out.println("arrayList values: "+itr.next());
	            
	        }
	        }

	}


}