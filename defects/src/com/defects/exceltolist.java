package com.defects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceltolist 
{

   public static void main(String args[]) throws IOException
   {

  
            FileInputStream file = new FileInputStream("C:\\softwares\\bug_fix.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(file);

            Sheet ws=workbook.getSheet("Sheet2") ;
            int l=ws.getLastRowNum();
            for(int i=1;i<=l;i++)
            {
            	Row r=ws.getRow(i);
            	Cell ex=r.getCell(0);
            	Cell ac=r.getCell(1);
            	String Key1=ex.getStringCellValue();
            	String Key2=ac.getStringCellValue();
            	String[] separated1 = Key1.split("\n");
            	String[] separated2 = Key2.split("\n");
                Map<String, String> map1 =
            		    Arrays.asList(separated1)
            		        .stream()
            		        .map(elem -> elem.split("-"))
            		        .collect(Collectors.toMap(e -> e[0], e -> e[1]));
            	
            	System.out.println("Map 1::::" +map1);
            	Map<String, String> map2 =
            		    Arrays.asList(separated2)
            		        .stream()
            		        .map(elem -> elem.split("-"))
            		        .collect(Collectors.toMap(e -> e[0], e -> e[1]));
            	
            	System.out.println("Map 2::::" +map2);
            	System.out.println(map1.equals(map2));
            	Boolean b=map1.equals(map2);
if(b==false)
{
                    for (String k : map2.keySet())
                    {
                    	for(String k1 : map1.keySet())
                    	{
                    		System.out.println("Key value of map1:::"+k1);
                    		System.out.println("Key value of map2:::"+k);
                    		System.out.println("value of map1:::"+map1.get(k1));
                    		System.out.println("value of map2:::"+map2.get(k));
                    		
                  
                    			if(!k.equals(k1)&&!map1.get(k1).equals(map2.get(k)))
                    				{
                    					System.out.println("key and values are not equal(Atribute and value defect)");
                    				}
                    			else if (!map1.get(k1).equals(map2.get(k))&& k.equals(k1)) 
                    			{
                        	
                    					System.out.println("key is not equal but values are equal(Atribute defect)");
                    			}
                    			else if (map1.get(k1).equals(map2.get(k))&& !k.equals(k1)) 
                    			{
                        	
                    					System.out.println("key is  equal but values are not equal(Value defect)");
                    			}
                    			else
                    				System.out.println("Both key  and value are equal");
                    	}
                    	
                    } 

                
            	
}         	
            	
            }
            
        
        
    }
}
